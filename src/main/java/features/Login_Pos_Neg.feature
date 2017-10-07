Feature: Login into the LeadfOpensite both positive and negative cases

Background: These steps should executes before each scenarios in this feature file
Given Lanuch the browser
And Launch the url
And Maximize the window
And Set timeouts

Scenario: Positive Scenario
When Enter the userName as DemoSalesManager
And Enter the password as crmsfa
And Click the login button
Then Print the welcome message

Scenario: Negative Scenario
When Enter the userName as DemoSalesManager1
And Enter the password as crmsfa1
And Click the login button
But Print the error message