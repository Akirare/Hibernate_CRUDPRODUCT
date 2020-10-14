<%-- 
    Document   : category-form
    Created on : Sep 9, 2020, 8:19:32 PM
    Author     : yup
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
        <%--<form:form action="saveCategory" modelAttribute="categories">--%>
            <%--name: <form:input path="name"/><br>--%>            
            <!--Position: <input type="number" name="position"/><br>-->            
            <!--<input type="submit" value ="save" />-->
        <%--</form:form>--%>
    
        <form:form action="saveCategory" modelAttribute="categories">
            <form:hidden path="id"/>
            <table>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>                    
                    <td>Position:</td>
                    <td><form:input type="number" path="position"/></td>
                </tr>
                <tr>                    
                   
                    <td>
                        <input type="submit" value="Save" name="btnAdd"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
