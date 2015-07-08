
To Developers

Install
	Eclipse Luna+ 
	Apache Tomcat 7.0.56
	Apache Maven 3.3.3

Git URL https://github.com/mateusmedice/nutrisys

Configure Tomcat + Maven deploy: 

	In file 'TOMCAT_HOME/conf/tomcat-users.xml' :

	<?xml version='1.0' encoding='utf-8'?>
	<tomcat-users>
	  <role rolename="manager-gui"/>
	  <role rolename="manager-script"/>
	  <user username="admin" password="password" roles="manager-gui,manager-script" />
	  <user username="managerGui" password="managerPwd" roles="manager-gui"/>
	  <user username="manager" password="managerPwd" roles="manager-script"/>
	</tomcat-users>


	In file 'MAVEN_HOME/conf/settings.xml' :

	Insinde   <servers>

	...
	    <server>
	      <id>TomcatServer</id>
	        <username>manager</username>
	        <password>managerPwd</password>
	    </server>
	...

	To relax your mind, configure '~/.m2/settings.xml' too.

Using Maven 

	cd ... /nutrisys/ 
	$ mvn clean install -U

	cd nutrisys-webapp/
	$ mvn clean install -U tomcat7:redeploy

	PS. tomcat7:redeploy works only if the server is running.





