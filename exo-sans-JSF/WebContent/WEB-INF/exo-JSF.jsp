<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="exo-JSF.css">
<title>exercice JSF</title>
</head>
<body>
    <fieldset>
        <form action="" method="POST" id="form" enstype="application/x-www-form-urlencoded">
            <div>
                <input type="text" name="A" id="A" value="${left}">
                <input type="text" name="B" id="B" value="${right}">
            </div>
            <div>
                <input type ="submit" name="toTheRight" value=">>>">
            </div>
            <div>
                <input type ="submit" name="toTheLeft" value="<<<">
            </div>
            
        </form>    
    </fieldset>
</body>
</html>