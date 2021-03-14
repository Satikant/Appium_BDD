Feature: Site Photo Feature

Scenario: ECSite Site Photos Test Scenario

Given User is on Login Page
Then  Click on LOGIN button without entering the credentials
Then  User enters UN, SId and Pwd
And   Click on login button 
And   User will be redirected to home page
Then  Click on Site Photos menu from the 1st level form group screen
Then  Click on F29 from the 2nd level form group
Then  Click on Camera icon of A-F29-1 from the list
And   Capture a photo and click on Save button
Then  Click on Component Instrument Info from the 2nd level form group screen
Then  Click on Pre camera icon and capture photo
And   Add name to the same photo taken in pre option
Then  Click on Post camera icon and capture photo
And   Add name to the same photo taken in post option
Then  Click on Save buttons
And   Click on OK in Success message
Then  Click Ecsite logo to go back
Then  Click on Sync button