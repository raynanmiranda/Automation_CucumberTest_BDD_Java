Feature: This is a file of registrations tests

	Scenario: Verify that user is able to register
			
		Given User goes to http://demoqa.com/registration/
	    When the user fill in the given details on the form
		|FirstName  	 | testMaster  		 |
		|LastName   	 | tester      		 |
		|Hobby      	 |  Reading	  		 |
		|PhoneNumber	 | 123123123   		 |
		|userName   	 | testmaster01      |
		|Email      	 | testcuc@gmail.com |
		|password   	 |     1234$#@!		 |
		|ConfirmPassword |     1234$#@!    	 |
		
