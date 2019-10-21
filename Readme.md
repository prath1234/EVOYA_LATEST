#the Port number in the docker compose for search server,configserver and anslysis server is not correct .Please ask ur architect about it


##Environment Variable##

1. Ask your Architect to remove localhost and ask him to define a env variable called: SERVER_IP
2. Ask your Architect to remove localhost and ask him to define a env variable called: CONSUL_IP for consuls address
3. if he has created any database in mssqlserver ask him to create a database env variable : dbname
