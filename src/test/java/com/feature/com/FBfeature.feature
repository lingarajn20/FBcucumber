Feature: User check they  overall functionality of FB page

Scenario Outline:: User check the login functionality of FB page
Given user launch the application
When user pass the correct username in "<username>"
And user  pass the correct password in "<password>"
Then FB login take place

Examples:
|username|password|
|lingarajleelavathy@gmail.com|9976704161|
|lingi.raj@rediffmail.com|9965637666|
