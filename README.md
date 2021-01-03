
##### Part of John Thompson's Microservices course


**Beer Service** is responsible for generating the Beer objects used in the application and stores that Beer object data in a database. 
**Beer Order Service** and **Beer Inventory** make calls to **Beer Service** to get information about the Beer objects.

Beer object example:

- UUID **id** = '026cc3c8-3a0c-4083-a05b-e908048c1b08' 
- String **beer_name** = 'Pinball Porter' 
- String **beer_style** = 'PORTER' 
- Timestamp **created_date** = CURRENT_TIMESTAMP 
- Timestamp **last_modified_date** = CURRENT_TIMESTAMP 
- Integer **min_on_hand** = 12 
- Integer **quantity_to_brew** = 200 
- BigDecimal **price** = 12.95 
- String **upc** = '0083783375213' 
- Long **version** = 1

# Default Port Mappings - For Single Host
| Service Name | Port | 
| --------| -----|
| [Brewery Beer Service](https://github.com/kawgh1/mssc-beer-service) | 8080 |
| [Brewery Beer Order Service](https://github.com/kawgh1/mssc-beer-order-service) | 8081 |
| [Brewery Beer Inventory Service](https://github.com/kawgh1/mssc-beer-inventory-service) | 8082 |

[![CircleCI](https://circleci.com/gh/kawgh1/mssc-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/kawgh1/mssc-beer-inventory-service)
# MSSC Beer Inventory Service - Microservice

Steps for Deconstruction into  Microservices
1. Dependency Management
2. (Local) MySQL Configuration
3. JMS Messaging
4. JMS with Microservices
5. Spring State Machine
6. Using Sagas with Spring
7. Integration Testing Sagas