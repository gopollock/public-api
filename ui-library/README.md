# UI Library

## This library includes: 
- Question modal for creating/editing questions. 
- Session dashboard for managing students and viewing their progress.
- Session settings modal.

## How to use this library
1. You need to import it in your html file inside `<head>`
    ```html
    <script type="text/javascript" src="https://beta.classtime.com/release/Classtime.js"></script>
    ```
2. At the end of `<body>` tag, you need to insert `<script defer>`
  with your own code where you can interact with the code from this library.<br>
  The library, using Webpack, adds to the window object the following data:
     - `window.Classtime.init`
 3. In order to start rendering the application you need to call `window.Classtime.init`. 
    You need to pass an object with the following data:
    - `authToken` (required)
    - `sessionCode` (required)
    - `rootHTMLElementId` (required): id of the html element in which you want to render the app
    - `callbacks`: an object, which currently accepts 1 property `onClose`
      * `onClose`: a callback, which will be called when question modal is closed. Accepts 1 boolean argument, which shows whether a question was saved or not, after closing the modal
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
    - `componentsToRender` (required if you want to render some component) - an object, which has 2 boolean properties which are false by default:
      * `questionEditorModal`
      * `sessionDashboard`
      
      <br>For example if you want to render session dashboard and question editor modal, you can pass such object to this property:
      ```javascript 
      {
        questionEditorModal: true,
        sessionDashboard: true,
      }
      ```

4. Functions for opening the question modal:
`window.Classtime.actions` returns a Promise with an instance of `ClasstimeApi` containing following methods:
   - `openQuestionModalForNewQuestion`: accepts 1 argument: question set id
   - `openQuestionModalForExistingQuestion`: accepts 2 arguments: existing question id and question set id

The example of usage is in the file [example.html](example.html).
