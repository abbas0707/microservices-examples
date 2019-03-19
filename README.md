# microservices-examples
Microservices examples with architectural patterns

The project is a microservice for enabling customer to create/edit and delete their profiles in an enterprise. The functionality is implemented using 
microservice architecture and exposed using Restful API. 

The solution consist of three projects

1- Microserivce Rest API exposing three operations create, update and delete to manange customer their profiles

2- API service and discovery registry where customer API register it self

3- An API gateway using spring cloud gateway, which also registers on discovery server to get the API address

##Sequence to start the apps

1- Ist start API "customer-service-discovery-server" from project home using command "mvn spring-boot run". It is implemented using Eureka and can be accessed now http://localhost:8010/
2- Start customer-profile-service, once started it registered it self on eureka discovery server
3- Start API GATEWAY, "api-gateway", gateway is exposed on 8080 port

Three services URL's are using post mapping

localhost:8080/customer/create
localhost:8080/customer/update
localhost:8080/customer/delete/{id}
