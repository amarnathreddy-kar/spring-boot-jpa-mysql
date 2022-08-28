# spring-boot-jpa-mysql

## Following resful routes implemenated:

**Methods	    Urls	                                                       Actions**
*POST	      /api/tutorials	                                             create new Tutorial
*GET	        /api/tutorials	                                             retrieve all Tutorials
*GET	        /api/tutorials/:id	                                         retrieve a Tutorial by :id
*PUT	        /api/tutorials/:id	                                         update a Tutorial by :id
*DELETE	    /api/tutorials/:id	                                         delete a Tutorial by :id
*DELETE	    /api/tutorials	                                             delete all Tutorials
*GET	        /api/tutorials/published	                                   find all published Tutorials
*GET	        /api/tutorials?title=[keyword]	                             find all Tutorials which title contains keyword



## Paging Implemented, some sample resful-routes are as follows:

*/api/tutorials?page=1&size=5
*/api/tutorials?size=5: using default value for page
*/api/tutorials?title=data&page=1&size=3: pagination & filter by title containing ‘data’
*/api/tutorials/published?page=2: pagination & filter by ‘published’ status
