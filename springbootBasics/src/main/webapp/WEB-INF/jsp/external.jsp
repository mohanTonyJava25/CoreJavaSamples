<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


response : ${response}



<table>
<tr>
<th>args</th>
<th>headers</th>
<th>origin</th>
<th>url</th>
</tr>
<tr>
<td>${response.args}</td>
<td>${response.headers}</td>
<td>${response.origin}</td>
<td>${response.url}</td>

</tr>
</table>

</body>
</html>