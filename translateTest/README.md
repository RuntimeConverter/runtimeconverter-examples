# Translate Test Example

This example code is from a project that uses an older version of Google's *google-api-php-client* library to make translation requests.

Included is a basic "/index.php" HTML file with included JavaScript that will accept either Russian or English text as input. As output, it will give both the English and the Russian output.

The result is a significant convenience over Google Translate's interface, which does not automatically reverse translation pairs when the auto-detected language changes.

You will find both "php" and "java" directories containing the code before and after conversion with runtimeconverter.com. **No modifications were made except to remove Google API keys.**

To run either the php or the java branch, you will need to make a developer account with Google and **obtain proper keys** of the type found in "php/translate.php" and "java/src/main/java/com/project/convertedCode/includes/file_translate_php.java".

To load the server on port 8080 on either Mac OS or Ubuntu 16.04 operating system, install gradle and type "**gradle bootRun**" command into the "java" directory.

Ubuntu 16.04 requires also "**sudo apt-get install mcrypt libxpm4 libjpeg8 libwebp5**" to install php extension dependencies.

### Conversion Result

![Screenshot](https://s3.amazonaws.com/runtimeconverter-static/images/translateTestScreenshot.png "Screenshot")


