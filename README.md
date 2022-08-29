## spring-boot-jpa-mysql

### Following resful routes implemenated:

|Methods	    |Urls	                                 | Actions                              			|
|-------------- |----------------------------------------|--------------------------------------------------|
| POST	      	| /api/tutorials	                     | create new Tutorial								|
| GET	        | /api/tutorials	                     | retrieve all Tutorials							|
| GET	        | /api/tutorials/{id}	                 | retrieve a Tutorial by {id}						|
| PUT	        | /api/tutorials/{id}	                 | update a Tutorial by {id}						|
| DELETE	    | /api/tutorials/{id}	                 | delete a Tutorial by {id}						|
| DELETE	    | /api/tutorials	                     | delete all Tutorials								|
| GET	        | /api/tutorials/published	             | find all published Tutorials						|
| GET	        | /api/tutorials?title=[keyword]	     | find all Tutorials which title contains keyword	|


### Paging Implemented, some sample resful-routes are as follows:

* /api/tutorials?page=1&size=5  |
* /api/tutorials?size=5: | using default value for page
* /api/tutorials?title=data&page=1&size=3: | pagination & filter by title containing ‘data’
* /api/tutorials/published?page=2: | pagination & filter by ‘published’ status

##### Database source password encrytion

### Error/ Exceptions Handling
> Handling - 
>> non-existent Get Request |  creating/updating with wrong fields  | delete non-existent tutorial

### Swagger Enabled
![Swagger-UI](https://user-images.githubusercontent.com/44445642/187128941-29905d5f-44a1-4c09-b8c1-21a88f1faccd.png)

### Validation Support Implementation




### Unit Testing Coverage


### Sorting Multiple Columns


### JPA One-to-Many and Many-to-Many Association Mapping





