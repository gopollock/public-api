# UI Library

## This library includes: 
- Question modal for creating/editing questions, 
- Session dashboard for managing students and viewing their progress 
- Session settings modal

## How to use this library
1) You need to import it in your html file inside ```<head>```
```html
<script type="text/javascript" src="https://beta.classtime.com/release/Classtime.js"></script>
```
2) At the end of ```<body>``` tag, you need to insert ```<script defer> ```
with your own code where you can interact with the code from this library.<br>
The library, using Webpack, adds to object window the following data:
- ***window.Classtime.init***
- ***window.Classtime.actions***

  In order to start rendering the applicaltion you need to call ***window.Classtime.init***<br>
  There you need to pass an object with the following data:
- authToken
- sessionCode
- rootHTMLElementId - id of the html element in which you want to render the app (defaults to 'app')
- callbacks - an object, which now accepts 1 property ***onClose***
  * onClose - a callback, which will be called when question modal is closed. Accepts 1 boolean argument, which shows whether a question was saved or not, after closing the modal
- theme - an object in which you can overwrite colors in the app
  * in order to overwrite 2 mostly used colors, pass such structure:
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
- locale - a string, which is used to show needed language in the app (defaults to "en")
<br>
<br>
3) Functions for opening the question modal:<br>
Inside ***window.Classtime.actions*** there are 2 functions:
- openQuestionModalForNewQuestion - accepts 1 argument: question set id
- openQuestionModalForExistingQuestion - accepts 2 arguments: existing question id and question set id

The example of usage is in the file ***ui-library-example.html***