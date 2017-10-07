Feature: Login into the LeadfOpensite

Scenario: Positive Scenario
Given Lanuch the browser
And Launch the url
And Maximize the window
And Set timeouts
When Enter the userName as DemoSalesManager
And Enter the password as crmsfa
And Click the login button
Then Print the welcome message