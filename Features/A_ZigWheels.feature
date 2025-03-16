Feature: ZigWheels
	

	Scenario: ZigWheels Page
		Given User navigate to zigwheels page
		When User gets the current url
		Then Verify directed to zigwheels page

	Scenario: New Bikes Page
		Given User is on zigwheels page
		When User click on search box and enter upcoming bikes
		#And clicks on upcoming bikes
		And capturing current url
		Then Verify directed to new bikes page
	
  