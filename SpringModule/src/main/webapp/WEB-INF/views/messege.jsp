<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
	<div>${messege }</div>	
	<form id="frm" method="post">
		<input type="text" name="name" placeholder="name">
		<input type="number" name="age" placeholder="age">
		<input type="submit" value="전송">
	</form>
	
	<div>${item.name }</div><br>
	<div>${item.age }</div><br>
</body>
</html>
