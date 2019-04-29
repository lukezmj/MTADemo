## 1. Download and install Eclipse

    Eclipse Java EE IDE for Web Developers.
    Version: Neon.3 Release (4.6.3)
    Build id: 20170314-1500

## 2.1 Download and install JDK

    C:\**\jdk1.8.0_191
    ---
    cmd->java -version
    java version "1.8.0_201"
    Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
    Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)
    
## 2.2 Modify environment variables  

    JAVA_HOME "C:\**\jdk1.8.0_191"
    Path "%JAVA_HOME%\bin"
    ---
    cmd->C:\**>echo %java_home%
    C:\**\jdk1.8.0_191
    
## 3.1 Download and install Maven
    
    C:\**\apache-maven-3.6.0
    ---
    cmd->mvn -version
    Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-25T02:41:47+08:00)
    Maven home: c:\Tools\apache-maven-3.6.0\bin\..
    Java version: 1.8.0_191, vendor: Oracle Corporation, runtime: C:\Tools\jdk1.8.0_191\jre
    Default locale: en_US, platform encoding: Cp1252
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
    
    mvn compile -generate target
    mvn clean -delete target
    mvn test -build and test 
    mvn package -generate jar
    mvn install - package and create local repository
    
## 3.2 Modify environment variables

    M2_HOME "C:\**\apache-maven-3.6.0"
    Path "M2_HOME"\bin"
    ---
    cmd->C:\**>echo %m2_home%
    C:\**\apache-maven-3.6.0
    
## 3.3 Download and install Tomcat

    https://tomcat.apache.org/download-70.cgi
    C:\**\apache-tomcat-7.0.94
    
## 3.4 Modify environment variables
    
    TOMCAT_HOME "C:\**\apache-tomcat-7.0.94"
    CATALINA_HOME %TOMCAT_HOME%
    CATALINA_BASE %TOMCAT_HOME%
    Path %TOMCAT_HOME%\bin;%TOMCAT_HOME%\lib
    ---
    cmd->catalina run
    after you see "INFO: Server startup in **** ms"
    browser: localhost:8080->Tomcat homepage
    
    if you see error like below:     
    Apr 26, 2019 4:01:17 PM org.apache.catalina.core.StandardServer await
    SEVERE: StandardServer.await: create[localhost:8005]:
    java.net.BindException: Address already in use: JVM_Bind

    go to C:\**\apache-tomcat-7.0.94\conf\server.xml, then change 8005 port to 8035 (or any other port not in use).
 
 ## 4 Download and install MySQL
 
    https://dev.mysql.com/downloads/installer/
    ----
    Logon my sql 
    cmd->mysql -u root -p    
