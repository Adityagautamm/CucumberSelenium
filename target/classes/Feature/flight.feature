Feature: Flights booking and search

Scenario: Car booking test

Given user clicks on "cars" link
And user clicks on "search cars" button
Then user enters "Melbourne" on "cars hire location" textbox
And user selects "Domestic Terminal" from "cars hire location suggestion" dropdown 
Then user clicks on "car hire start date" button
And user select date "28" "July" "2020" from calender
Then user clicks on "car hire from time dropdown" button
And user selects "10:30" from "car hire from time" dropdown 
And user select date "30" "August" "2020" from calender
Then user clicks on "car hire to time dropdown" button
And user selects "10:30" from "car hire to time" dropdown
Then user clicks on "car hire search button" button
And user is on page with url like "cars.cartrawler.com"
 

Scenario: Flight search test
 
 Given user clicks on "return trip dropdown" button
 And user selects "Return trip" from "return trip suggestion" dropdown
Then user clicks on "passenger button" button 
And user enters "3" on "adult textbox" textbox
And user clicks on "passenger confirm button" button
Then user clicks on "from flight location button" button
And user enters "New" on "from flight location textbox" textbox
And user selects "Newcastle" from "flight location suggestion" dropdown
Then user clicks on "to flight location button" button
And user enters "queen" on "to flight location textbox" textbox
And user selects "Gold Coast" from "flight location suggestion" dropdown
Then user clicks on "flight date button" button
And user select departure date "28" "July" "2020" from flight calender
And user select return date "31" "July" "2020" from flight calender
Then user clicks on "search flight button" button
And user is on page with url like "booking.jetstar.com"

 
Scenario: hotelandAirBnb search test
Given user clicks on "hotels and airbnb button" button
Then user clicks on "airbnb radio button" button
And user clicks on "airbnb location button" button
And user enters "melbourne" on "airbnb location textbox" textbox
Then user selects "South Melbourne" from "airbnb location suggestion" dropdown
#And user clicks on "airbnb date button" button
Then user select date "28" "July" "2020" from hotelandairbnb calender
And user select date "30" "July" "2020" from hotelandairbnb calender
Then user clicks on "airbnb confirm date button" button
And user clicks on "who button" button
Then user enters "3" on "adult textbox" textbox
And user clicks on "done button" button
Then user clicks on "search airbnb button" button
And user is on page with url like "https://www.jetstar.com/au/en/airbnb-stay-and-earn"




Scenario: holidays search test

Given user clicks on "holidays button" button
Then user clicks on "traveller button" button
And user enters "3" on "adult textbox" textbox
Then user clicks on "confirm traveller button" button
When user clicks on "from holidays location button" button
And user enters "a" on "from holidays location textbox" textbox
Then user selects "Cairns" from "holidays location suggestion" dropdown
When user clicks on "to holidays location button" button
And user enters "a" on "to holidays location textbox" textbox
Then user selects "Barossa Valley" from "holidays location suggestion" dropdown
When user clicks on "holidays dates button" button
And user select date "28" "July" "2020" from holidays calender
And user select date "30" "July" "2020" from holidays calender
Then user clicks on "confirm holidays button" button
When user clicks on "search holidays button" button
And user is on page with url like "www.jetstarholidays.com.au"


  
  
 
 