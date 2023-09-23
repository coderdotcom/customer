This is a Sample Project that returns the total reward points of a customer who made transactions within last 3 months.

Upon application start, it will run on localhost:8080. And below are the endpoints created.

/all = returns all the transactions of customers defined in DAO
/last3months = retuns only customer transactions from last 3 months (from when the application is run)
/customer/<id> (id can be gathered from running the above endpoints) = returns the details of customers and their reward points

If a wrong customer id is used or a customer id that doesn't belong to the last 3 months is hit in the endpoint,
it will return a 404 response with the message defined in the Controller Class.
