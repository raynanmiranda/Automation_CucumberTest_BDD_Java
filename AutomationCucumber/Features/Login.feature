Feature: Login 

	This feature file contains all the login tests

Scenario: verify that user is able to login using a valid username and password 

	Given A user is on http://store.demoqa.com 
	When User Clicks on MyAccount link 
	And  User enters a valid username testecucumber and password qwer!@#$4321 
	Then User is able to login sucessfully 
	
	
Scenario: login with a invalid username 
	Verify that user is not able to login using username with special characters
	
	Given A user navigates to http://store.demoqa.com/products-page/your-account/
	When User enters a invalid username testeErro and valid password qwer!@#$4321
	Then Application should dine login to the user by displaying approprieate erro message
	
Scenario: login with a invalid password 
	Verify that user is not able to login using password with special characters
	
	Given A user navigates to http://store.demoqa.com/products-page/your-account/
	When User enters a valid username testecucumber and invalid password !@#$4321aa
	Then Application should dine login to the password by displaying approprieate erro message
	
	