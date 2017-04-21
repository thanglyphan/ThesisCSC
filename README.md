# ThesisCSC - Installasjonsguide

- 1. Downloading and install Android Studio: https://developer.android.com/studio/index.html
- 2. "Clone" the project to an empty folder through one of the following methods: 
     - Click the green "Clone or Download" button on the github page
     - Open up a command prompt and do the following (assuming you have Git installed):
          * Navigate to the folder you would like to install the project to
          * git clone https://github.com/thanglyphan/ThesisCSC.git
- 3. Open Android Studio
- 4. Find and open the project you have downloaded.
- 5. Once the application has finished initializing, change the view to "Android" and navigate to "LoginActivity" under java > thesiscsc.thesiscsc.

![alt tag](https://github.com/thanglyphan/ThesisCSC/blob/master/img/login.PNG)

- 6. Change the String variable "ip" to the ip and port of the server the app will be connecting to.

- 7. To set up Firebase so you can recieve notifications about pending remittances, log into a google account and open this link:
     https://console.firebase.google.com/
- 8. Click "Add project" and write in a project name before clicking "Create Project".
- 9. Once the new page has loaded, click "Add Firebase to your Android app" type "thesiscsc.thesiscsc" into the "Android package name" field.
- 10. Download the "google-services.json" file and replace the existing file in the project either through Android Studio or by manually overwriting it with Windows Explorer (Note that it is recommended to restart Android Studio after this step to ensure that the IDE loads the new file correctly).
- 11. You can now click "Continue" and then "Finish" on the Firebase website.
- 12. The Server key needs to be added to the SICS Workstation template for it to send notifications.
- 13. Click the cog next to "Overview" in the upper left-hand corner of the site, and click "Project settings"
- 14. Navigate to the "CLOUD MESSAGING" tab and copy the token under "Server key".
- 15. Consult with Harald on how to replace the existing key in the remittance template.

![alt tag](https://github.com/thanglyphan/ThesisCSC/blob/master/img/projectsettings.PNG)
     
- 16. You can now click the "Run"(play) button in Android Studio.
- 17. You must now choose between using a physical Android smartphone, or the built in emulator.
- 18. To use a physical phone, activate developer settings and connect it to the computer. It should show up in the list.
- 19. To use and emulator you must download one via Android Studio. Click "Create New Virtual Device" and select your device of choice. You then select "Marshmallow API level 23", click "next" and then "finish". You should now be able to select the newly created virtual device from the list.

![alt tag](https://github.com/thanglyphan/ThesisCSC/blob/master/img/create.PNG)

- 20. The last steps are to add the user to the list of potential owners of the "Authorize and Close Remittance" step of the remittance template, and to add the user's "Mobile Phone Notification ID" to the database SICS Workstation is using. (Consult Harald)
- 21. You can find the user's "Notification ID" by starting the app, logging in and then opening up the "Android Monitor" tool in Android Studio, selecting "Verbose" and filtering for "FIREBASETOKEN". It should now be the only thing visible in the logcat field.

![alt tag](https://github.com/thanglyphan/ThesisCSC/blob/master/img/Firebasetoken.PNG)
