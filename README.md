# my-cms
Simple Cash Management System (myCMS) for POC. Current Version <b>v1.1.0</b>

<p>A cash management system is used to forecast, track, and report corporate cash flows. 
The solution is especially helpful to manage cash flows (including in various currencies) across multiple,
including international, company branches and across complex bank account structures.
</p>

<h3>Module:</h3>

1. (N/A)Inhouse Transfer (Transfer cash in Account within same bank)
2. (N/A)Domestic Transfer (Transfer cash in Account with different bank and in same Country)
3. (N/A)Telegraphic Transfer/Remittance (Transfer cash in Account with different bank and different country)
4. (N/A)Service Payment
5. (N/A)Currency Live Rate (Forex)
6. (N/A)Batch Job 

<h3>Tech Stack:</h3>

1. Front-End: ReactJS <b>v16.13.1</b>
2. Axios: <b>v0.27.2</b>
3. react-router-dom: <b>v5.3.3</b>
4. Bootstrap: <b>v4.5.0</b>
5. Back-End: <b>Spring Boot</b> [Spring intializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.1&packaging=jar&jvmVersion=11&groupId=com&artifactId=springbootbackend&name=springboot-backend&description=Simple%20full%20stack%20web%20application%20for%20managing%20accounts%20in%20a%20company&packageName=com.springbootbackend&dependencies=web,data-jpa,devtools,postgresql)
6. Batch-Job: Spring Batch
7. Database: <b>PostgreSQL</b>


Architecture:

ReactJs -> Axios HTTP request -> Spring Boot -> PostgreSQL


ERD:

open mycms-erd.xml in [draw.io](https://app.diagrams.net/)




Legend:
BRN -> Business Registration Number
TRX_STATUS: 0 - fail, 1-success, 3-on hold



Please install these npm package:
npm install react-bootstrap bootstrap