SSO-with-CAS-example
====================

SSO implementation using CAS (as server) and Spring MVC (as clients).

To check it in action, you have to have a certified tomcat (sample certificate you can find in main directory - the name of the service is "tomcat").
http://www.mkyong.com/tomcat/how-to-configure-tomcat-to-support-ssl-or-https/

Add to your hosts file entry which points to 127.0.0.1 and name "tomcat".

Build and run application. Checkout:
https://tomcat:8443/app1/home
https://tomcat:8443/app2/home
https://tomcat:8443/cas/
