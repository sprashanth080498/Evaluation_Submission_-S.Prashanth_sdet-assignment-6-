# Evaluation_Submission_-S.Prashanth_sdet-assignment-6-
Project Title:
  Selenium automation
Name:
  S.Prashanth
Description of the project:
  Selenium is an open source framework for automated browser testing and web application automation providing a suite of tools to interact with the web browsers programmatically.
  Here I have created a package in the src/test/java named "SDET-Assignment-6".
  And I have created three classes namely: 1.drag_and_drop 2.file_upload 3.instagram
    drag and drop- here I have automated the football UI element 
    file_upload- here I have uploaded an excel file in the file upload part.
    instagram- here I have used the data-driven testing method to enter the details in the instagram username and password fields.

Instructions on how to set up and run your project:
  1.We have to install the spring tool suite and create a maven project in it.
  2.We have to create a package and a class in that project
  3.We have to add the following dependencies in the pom.xml file in the project
  4.Install testng in the eclipse market place of help.
  5.Now we have to write our scripts in the class and run as testNG.

dependencies:
  <project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>demo_project</groupId>
  <artifactId>demo_project</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies><!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.2</version>
</dependency>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
</dependencies>
</project>



