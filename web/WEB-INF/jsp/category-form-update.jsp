<%-- 
    Document   : category-form
    Created on : Sep 9, 2020, 8:17:28 PM
    Author     : TEACHER
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Category form</h1>
        
        <%--<form:form action="updateCategory" modelAttribute="categories">--%>
            <%--name: <form:input path="name"/><br>--%>            
            <!--Position: <input type="number" name="position"/><br>-->            
            <!--<input type="submit" value = "Update" />-->
        <%--</form:form>--%>
            
        <form:form action="updateCategory" modelAttribute="categories">
            <form:hidden path="id"/>
            <table>
                <tr>
                    <td>Name:</td>
                    <%--<td><form:input path="name"/></td>--%>
                    <td><input type="text" path="name"/></td>
                </tr>
                <tr>                    
                    <td>Position:</td>
                    <td><input type="number" path="position"/></td>
                </tr>
                <tr>                    
                    <td>                        
                    </td>
                    <td>
                        <input type="submit" value="Update" name="btnUpdate"/>
                    </td>
                </tr>
            </table>
        </form:form>
        
        
    </body>
</html>
