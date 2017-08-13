##############################################
Spring Integration with SOAP Webservices
#########################################


Checkout the code ,cd to the project folder and run command:

mvn clean install

Webservice will start at local server.

If you want to access the webservice from remote then,

enter http://<IP_ADDRESS>:<PORT>/SpringSoapWS/account

Example: http://192.168.0.104:8080/SpringSoapWS/account?wsdl

wsdl file will be generated, you can start writting client code and start consuming 
webservice.
