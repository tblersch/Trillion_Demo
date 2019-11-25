# Trillion_Demo

Demo as requested on 11/22.  Understanding was that this was to demonstrate knowledge of Spring Boot and JPA Repository functionality, with three main features:
1) Registration page for users to enter their name and address.
2) Page to list users entered in the system, pre-populated with at least 100 records.
3) Means to search for users in a given zip code.  

These features are complete.  There are other ancillary/derived features not yet completed is for a user to view the addresses of people near them.  A RESTful endpoint and Repository functions are written for that; it requires a login mechanism that is not yet complete.  
The database is also not properly normalized - clearly, users (i.e. user names) should have a one-to-many relation to addresses, and a one-to-many relation to passwords (to support tracking the last X number of passwords used, and only use the current one).
