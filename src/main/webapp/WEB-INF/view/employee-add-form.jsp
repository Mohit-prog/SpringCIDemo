<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/add-employee-style.css">

</head>
<body>
<div id="wrapper">
<div id="header">
    <h2>Add New Employee</h2>
 
</div>
</div>

<div id="container">
    
    <form:form action="saveEmployee" modelAttribute="employee" method="POST">
    <!-- associate with employee -->
    <form:hidden path="id"/>
    
    <table>
    <tbody>
        <tr>
           <td><label>Full Name :</label></td>
           <td><form:input path="name" required="true"/></td>
        </tr>
           <tr>
           <td><label>Location:</label></td>
           <td><form:textarea path="location"/></td>
        </tr>
           <tr>
           <td><label>Email :</label></td>
           <td><form:input path="email" required="true"/></td>
        </tr>
           <tr>
           <td><label>Date Of Birth :</label></td>
           <td><form:input path="dob"/></td>
        </tr>
           <tr>
           <td><label></label></td>
           <td><input type="submit" value="Save" class="save"/></td>
        </tr>
       
    </tbody>
    </table>
    
    
    </form:form>
  <div style="clear;both;"></div>
  <p>
    <a href="${pageContext.request.contextPath}/employee/list">Back to Details</a>
  </p>
</div>

</body>
</html>