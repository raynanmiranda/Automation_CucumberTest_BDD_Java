Feature: This is a file of registrations tests

Background:
		Given User goes to http://demoqa.com/registration/	 

	Scenario: Verify that user is able to register
			
			
	    When the user fill in the given details on the form
		|FirstName  	 | testMaster  		 |
		|LastName   	 | tester      		 |
		|Hobby      	 |  Reading	  		 |
		|PhoneNumber	 | 1231231231  		 |
		|userName   	 | testmaster01      |
		|Email      	 | testcuc@gmail.com |
		|password   	 |     1234$#@!		 |
		|ConfirmPassword |     1234$#@!    	 |
		Then The user will be able to registrated sucessfully
		
	
	Scenario: Verify that user already exist to register
			
		#Given The User goes to http://demoqa.com/registration/
	    When the user fill in  the given details on the form that already exist 
		|FirstName  	 | testMaster  		 |
		|LastName   	 | tester      		 |
		|Hobby      	 |  Reading	  		 |
		|PhoneNumber	 | 1231231231  		 |
		|userName   	 | testmaster01      |
		|Email      	 | testcuc@gmail.com |
		|password   	 |     1234$#@!		 |
		|ConfirmPassword |     1234$#@!      |
		Then The user will validate tha already been registrated
