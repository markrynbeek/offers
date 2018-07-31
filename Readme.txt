

This project implements a Spring Boot REST service, a demo with offers created by merchants.

Building the service
--------------------
This is a Maven build:
 - command line: use "mvn clean install" to build and test the project.
 - IDE: open the project (pom file) and build the project there. Default is for Intellij.

Running the service
-------------------
Open the project in your IDE and run class OfferApplication.
This is a Spring Boot application that will start a service on default port 8080.


API documentation (Swagger)
---------------------------
After starting the service
     See: http://localhost:8080/v2/api-docs
     http://localhost:8080/swagger-ui.html#


Invoking the service
--------------------
A Postman collection is included in file "Offer service.postman_collection"
To test for example, use these requests:
- Create offer 1
- Create offer 2
- Update offer
- Get all offers
etc...


Project design decisions
------------------------
- The project is set up with a standard package structure (controller, dao, service etc)
- As a simplification offers are persisted to a file; see the "Demo" class implementations of the DAO interfaces
- Assumption: a 'valid' offer means that the offer is not cancelled and is not past its duration in days. So the value
  is derived from other attributes in the object rather than being its own attribute.

Tests
-----
The current set of tests is not exhaustive;  rather it is meant to showcase different kinds of unit testing relevant to
the given REST service.