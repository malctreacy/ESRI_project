# ESRI Mini Project

Small project working with Selenium Webdriver, Junit test framework on a banking login page. 
Author: Malcolm Treacy
Date: 6/10/21

# Dependencies

* Selenium 3.14 (Included)
* Geckodriver (Included)

# Project Structure
### ParaBankTest
Main test, calls relevant class(es). 
### RegisterUser 
Registers a new user / users.  Uses the website's UI to register a new user. 
Could be updated to also utilize the sites provided RESTful service.  Should also accept a test DB of new users.    

# Test Cases
### testLoginSucceed()
* Tests login success using valid login parameters. 
### testLoginFailure()
* Test login failure using *invalid login.*
### testCapsLockFailureUsername()
* Test login failure using all-capital *username.*
### testCapsLockFailurePassword()
* Test login failure using all-capital *password.*
