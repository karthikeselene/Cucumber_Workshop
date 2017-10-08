Feature: Create Lead functionlaity in opentaps site

Scenario Outline: Create Lead functionlaity in opentaps site(Positive)
Given Lanuch the browser
And Launch the url
And Maximize the window
And Set timeouts
When Enter the userName as DemoSalesManager
And Enter the password as crmsfa
And Click the login button
And Click the CRM/SFA link in the home page
And Click the Creat Lead link in the menu
And Enter the company name <companyName>
And Enter the first name <firstName>
And Enter the last name <lastName>
And Click on the create lead button
Then Print the company name in the view lead

Examples:
| companyName | firstName   | lastName  |
| Ameex       | Karthikeyan | Rajendran |
