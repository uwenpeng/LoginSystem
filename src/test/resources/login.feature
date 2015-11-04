Feature:  I wanna login the system
	Scenario Outline: I use the username and password to login
		Given I have a username is <username>
		When I have a password is <password>
		Then I will login the system
		And The system will reply me a result
		
		Examples: 
		|username|password|
		|Uwen  |1111|
		|Steven|2222|
		|Keson |3333|
		|Mike  |4444|
