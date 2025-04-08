# UI Library

## This library includes: 
- Question modal for creating/editing questions. 
- Session dashboard for managing students and viewing their progress.
- Session settings modal.

## How to use this library
1. You need to import it in your html file inside `<head>`.
   1. For the pre-production version of the library:
       ```html
       <script type="text/javascript" src="https://beta.classtime.com/release/Classtime.js"></script>
       ```
   2. For the production version of the library:
       ```html
       <script type="text/javascript" src="https://www.classtime.com/release/Classtime.js"></script>
       ```
2. At the end of `<body>` tag, you need to insert `<script defer>`
  with your own code where you can interact with the code from this library.<br>
  The library, using Webpack, adds to the window object the following data:
     - `window.Classtime.init` 
3. In order to use the Classtime Library you need to call `window.Classtime.init`.<br>
  **Note: You must only call `init` once! To update the config use the `updateConfig` method of the library.**<br>
  You need to pass an object with the following data:
   - `rootHTMLElementId` (required): ID of the HTML element for attaching the modals to the DOM tree. This element must never be removed from the DOM tree. 
   - `authToken` (required)
   - `callbacks`: an object, which currently accepts the following properties:
     * `onSessionSettingsModalClose` callback, which is called when the session settings modal is closed
     * `onQuestionModalClose` callback, which will be called when question modal is closed. Accepts 1 boolean argument, which shows whether a question was saved or not, after closing the modal
     * `onClose` [deprecated]: legacy name for onQuestionModalClose
   - `sessionCode`
   - `theme`: an object in which you can overwrite colors in the app
     * in order to overwrite 2 mostly used colors (two shades of blue in our UI), pass such structure:
     ```javascript
     {
       palette: {
         primary: {
           main: '#a2c510',
           light: '#eefeab',
         },
       },
     }
     ```
   - `locale` - a string, which is used to show needed language in the app (defaults to "en")

4. Functions for opening the question modal: The `init` method returns a Promise with an instance of `ClasstimeApi` containing following methods:
   - `updateConfig`: Allows to update the configuration passed that was passed in to the `init` method. You do not need to update the full config but
     can just specify the fields that you want to change. All fields can be updated except for `rootHTMLElementId` and `callbacks`.
   - `openQuestionModalForNewQuestion`: accepts 1 argument: question set id
   - `openQuestionModalForExistingQuestion`: accepts 2 arguments: existing question id and question set id
   - `openSessionSettingsModal`: accepts no arguments
   - `renderSessionDashboard`: accepts 1 argument: the ID of the DOM node where to render the dashboard.<br>
      It will render the session dashboard into the DOM node with the given ID. 
      If the DOM node is removed from the document, then the resources will be cleaned up and `renderSessionDashboard` can be called again.
 
The example of usage is in the file [example.html](example.html).

## Changelog

### 2025-04-08
- `updateConfig` method has been added to `ClasstimeApi`
- `renderSessionDashboard` method has been added to `ClasstimeApi`. 
- `componentsToRender` has been removed from the object passed to `init`. All modals are now active by default. To render the session dashboard you 
   need to explicitly call `renderSessionDashboard`.
