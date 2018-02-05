Feature: This is a file of registrations tests

	Scenario: Verify that user is able to register
			
		Given User goes to http://demoqa.com/registration/
	    When the user fill in the given details on the form
		|testMaster  |
		|tester      |
		|Reading	 |
		|123123123	 |
		|testmaster01|
		|testcuc@gmail.com|
		|1234$#@!|
		|1234$#@!|
		
