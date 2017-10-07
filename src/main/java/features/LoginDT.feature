Feature: Login into the opentap site using data table

Sceario: Passing Username and Password using data table
Given Lanuch the browser
And Launch the url
And Maximize the window
And Set timeouts
When Enter the username and password
| UserName | Password |
| DemoSalesManager | crmsfa|
And Click the login button
Then Print the welcome message