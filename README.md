# CalebRhoda_ST10435099_IMAD_Assignment1

This is the Report of the Age Finder App written using Kotlin 26 on Android Studio.

I created this app in March 2024 for IMAD5112 for my first assignment using Android Studio. Android Studio utilises a lot of drag and drop features which helps speed up the creation of a visually appealing user interface. It takes some time to get used to which can put a lot of people off getting used to certain aspects of the workspace such as restraints and attributes. This can be easily rectified in the code section of the xml activity. At first I did struggle with the layout with the pictures and the restraining however after a couple of hours of experimenting it became a fluid process.
  
The user interface of the app looks like this. The title is at the top, followed by text which prompts the user to enter an age in the box adjacent to said text. The box clarifies the ages in which it accepts, that being numbers between 20 and 100. Below the input text box are the buttons ‘Generate’ and ‘Clear’. Generate runs the code and clear removes any text that you entered as well as clearing the output box. The output box is located within the bottom image.

This app is called App Finder which allows you to input your age, or any age and it will output a famous figure that died at that age. It uses if statements to check if the inputted age is valid and has an attached famous figure. It has a very simple user interface and is very easy to use. The background is that of a canyon and there is a picture of a treeline which is used to display the output. There is an input box where you can type in numbers, and it will display text depending on the condition. There is also a button to clear the input and output text boxes. To use the app simply input an age between 20 and 100 in the white text box, press the Generate button and read what the output box says. Use the clear button to input more numbers and to remove any leftover text in the output box.
As this is my first project in Android Studio there were a few errors in which I had to use Stack Overflow, YouTube and Chat to fix. The purpose of this app is to educate the user on historical figures and the age at which they died by showing a historical figure which died at their age. Currently there are only 10 historical figures stored in the code, which can be easily expanded upon in the historical figures string list. The assignment only required me to insert 10 historical figures so there isn’t a historical figure stored for every number between 20 and 100. 
 
This is the module that handles the storage and display of the various historical figures, tying different numbers to a specific string. The module is then returned to the main function. This map also allows for easy addition and subtraction of historical figures as long as there only one historical figure per number. It is possible to have 80 different historical figures in this app however I was only required to add 10. The historical figures in this programme range from inventors to thinkers to actors to musicians and more. If you would like to add more historical figures just follow the same format pictured above, changing the name of the historical figure and using a different age. 
This is the code for the clear button. It is a very simple button. It works by waiting for a click and when it does get a click it sets the output text to nothing and clearing the input box. It clears both texts to save time. This button isn’t 100% necessary for the app to function as entering another age will overwrite the output text, it is a neat feature to have. The assignment didn’t specify whether the presence of text in the output box would disallow the re-entering of another age.
 
This is the code for the Generate button. The button waits for a click before running the code. Then it checks if there is a valid integer. If there is a valid integer but no stored historical figure, the code will then output “No historical figure found” however if there isn’t a valid integer it will output “Please enter a valid age”. Then it checks for if the inputted number is within range, in this case the range being between 20 and 100. If the inputted number is greater than 100, the output will display “Not within range (Too Big)” otherwise if the age is less than 20 the output will display “Not within range (Too small)”. If those criteria aren’t met then the app will output the name of a historical figure. For example if I type in 19 or 101 and click generate it will display an error message. If I type in nothing and click generate it will display a different error message. If I type in an age within the range but isn’t stored in the code, it will display a different error message. It will only output the name of a historical figure if the historical figure is stored in the code.

I used strings to suppress the hard coding errors in the xml files. I also used SuppressLint to quell some of the more odd errors I was getting. I used a YouTube video to learn how to upload this project to Github. I also used the IIE Varsity College Module Manual for Introduction to Mobile Application development to learn how to use Android Studio as well as Chat to explain what I didn’t understand such as the syntax for Kotlin and how to use functions and such. I imported TextView and Button and EditText widgets to make the project function properly. I used the commit and push function for Android studio to upload the files for the app to GitHub and have been regularly pushing to GitHub when changes have been made to the project.

CalebRhoda/CalebRhoda_ST10435099_Assignment1 at master (github.com)
This is the link to the project on GitHub. It contains everything about the project including the app itself. I used a YouTube video to figure out how to do this. I have unfortunately been struggling to get the automated testing working as the YouTube videos don’t seem to either not comprehensive enough or don’t line up with my use case. In any case as of now I have not properly implemented the automated testing required for the assignment.
 
This is the string xml file I used to clear the hardcoding errors. They are named appropriately for their use case and help further organize the code. This allows for the text to be appropriately and accurately translated.

Stack Overflow. 2021. No speakable text present at Android Studio. [Online] Available at: https://stackoverflow.com/questions/69142705/no-speakable-text-present-at-android-studio [Accessed 18 March 2024].

Stack Overflow. 2018. Missing accessibility label: in Android Studio Warning. [Online] Available at: https://stackoverflow.com/questions/52868488/missing-accessibility-label-in-android-studio-warning [Accessed 18 March 2024].

Stack Overflow. 2010. Android textview outline text. [Online] Available at: https://stackoverflow.com/questions/3182393/android-textview-outline-text 
[Accessed 18 March 2024].

Stack Overflow. 2013. java - how to add button click event in android studio. [Online] Available at: https://stackoverflow.com/questions/20156733/how-to-add-button-click-event-in-android-studio.

CodingBot. 2022. How to push android studio project to github in 2022. [Online] Available at: https://www.youtube.com/watch?v=XIHNxES2hbQ&ab_channel=CodingBot [Accessed 18 March 2024].

Nyakundi, H. (2021). How to Write a Good README File for Your GitHub Project. [Online] freeCodeCamp.org. Available at: https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/. [Accessed 18 March 2024].

The IIE. 2024. Introduction to Mobile App Development [Module Manual]. The Independent Institute of Education: Unpublished.

OpenAI. (2024). ChatGPT (Dec 20 version) [Large language model]. https://chat.openai.com/
