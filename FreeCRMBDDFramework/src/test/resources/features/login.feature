Feature: Free CRM login Feature

Background: Login into web
 Given user is on login page
 When tilte is name of web
 Then user add "<9970264720>" and "Saga@123"
 Then user click on login button
 
 Scenario Outline: Free CRM Login test 
 When user validate homePage
 And close the browser

Examples:
	| username   |	password |
	| 9970264720 |	Saga@123 |
	
	Scenario: Check hotels list
	Given user click on hotel tab
	When Hotel page opens add city name
	Then click on search button
	And close web