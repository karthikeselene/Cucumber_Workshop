@Karthi
Feature: Login into the LeadfOpensite both positive and negative cases

Background: These steps should executes before each scenarios in this feature file
Given Launch the url
And Maximize the window
And Set timeouts

@smoke
Scenario Outline: Positive Scenario
When Enter the userName as <userName>
And Enter the password as <password>
And Click the login button
Then Print the welcome message
Examples:
| userName         | password|
| DemoSalesManager | crmsfa  |
| DemoCSR          | crmsfa  |

@sanity
Scenario: Negative Scenario
When Enter the userName as DemoSalesManager1
And Enter the password as crmsfa1
And Click the login button
But Print the error message