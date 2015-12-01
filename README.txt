This project contains two applications(php and SpringMVC).

PHP application is for getting product feeds from flipkart and store that information in MySQL database.
SpringMVC application retirives products data from MySQL and displays to the user.

Note: Currently this code is written to get only television details from flipkart. To improve this application for retriving all sorts of products from flipkart one need to do minor changes to php files.

MySql database details:
-----------------------
username = "root"
password = "pass123"

database Name = flipkart
Table Name    = tvprices (Rows: id, title, MRP, SP, URL, ImageUrl)

 

ProductFeed-php-files
-------------------

To create database in MySQL execute php file: 
BuildDB.php

To get the television information from flipkart please run:
feed.php   // this extracts information from flipkart and stores data to MySQL.



spring3-mvc-maven-telivision
----------------------------
contains MVC code to extract television data from MySQL and renders the data.



