<%-- 
    Document   : show-cate-list
    Created on : Sep 8, 2020, 9:22:48 PM
    Author     : yup
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <input type="button" value="Add new Category" onclick="window.location.href='showFormForAdd'; return false;">
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Position</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${categories}">
                <c:url var="updateCategoryz" value="showFormForUpdate">
                    <c:param name="categoryId" value="${item.id}"/>
                </c:url>
                <c:url var="deleteCategory" value="deleteCategory">
                    <c:param name="categoryId" value="${item.id}"/>
                </c:url>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.position}</td>
                    <td><a href="${updateCategoryz}">Update</a></td>
                    <td><a href="${deleteCategory}" onclick="if(confirm('Delete Category with Id = ${item.id}')==false) return false;">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
