<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<link type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css"
> 
</head>
<body>
 
 <div id="wrapper">
     <div id="header">
         <h2>Employee Listings</h2>
     </div>
     <div id="container">
         <div id="content">
         <!-- add button -->
         <input type="button" value="Add New"
           onClick="window.location.href='showFormForAdd';return false;"
               class="add-button"
         />
          <input type="button" value="logout" style=""
           onClick="window.location.href='logout';return false;"
                class="add-button"
         />
          <table border="1" cellpadding="10">
          <tr>
           <th>Employee Code</th>
            <th>Employee Name</th>
             <th>Location</th>
              <th>Email</th>
               <th>Date of Birth</th>
               <th>Action</th>
          </tr>
          
          <c:forEach  var="temp" items="${employees}">
          
          <c:url var="updateLink" value="/employee/showFormForUpdate">
             <c:param name="employeeId" value="${temp.id }"/>
          </c:url>
          
           <c:url var="deleteLink" value="/employee/delete">
             <c:param name="employeeId" value="${temp.id }"/>
          </c:url>
            <tr>
            <td>${temp.id }</td>
            <td>${temp.name }</td>
            <td>${temp.location}</td>
            <td>${temp.email }</td>
            <td>${temp.dob }</td>
            <td>
            <a href="${updateLink }">Edit</a>
            |
             <a href="${deleteLink }"
                onClick="if(!(confirm('Are You Sure ?')))return false">Delete</a>
             
            </td>
          
            
            </tr>
          
          </c:forEach>
          
          </table>
         
         </div>
     </div>
 </div>
 
 
 
</body>
</html>