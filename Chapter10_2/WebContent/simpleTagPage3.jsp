<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- this taglib is using from same tld file but that file has more than one custom tag --%>
<%@ taglib prefix="example" uri="simpleTag2" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 3</title>
</head>
<body>
<%-- this movie attribute not exist at this time, only when started execute tag inside doTag method --%>
	<h1>Movie Table:</h1><br>
	<table bgcolor="yellow" border="5">
		<example:simple3>
		 <tr><td>${movie}</td></tr>
		</example:simple3>
	</table>
</body>
</html>