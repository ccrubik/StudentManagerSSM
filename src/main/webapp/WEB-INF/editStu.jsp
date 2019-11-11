<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
<link rel="stylesheet" type="text/css" href="../css/BaseStyle.css">
<link rel="stylesheet" type="text/css" href="../css/listStyle.css">
</head>
<body>
	<form action="UpdateStuServlet" method="post">
		<input type="hidden" name="sid" value="${stu.sid}"/>
		<label for="sname">姓名：</label>
		<input type="text" name="sname" id="sname" value="${stu.sname}" /><br>
		<label for="sage">年龄：</label>
		<input type="text" name="sage" id="sage" value="${stu.sage}"/><br>
		<label for="sgender">性别：</label>
		<input type="radio" name="sgender" id="sgender" value="男" <c:if test="${stu.sgender=='男'}">checked</c:if>/>男
		<input type="radio" name="sgender" id="sgender" value="女" <c:if test="${stu.sgender=='女'}">checked</c:if>/>女<br>
		<label for="shobby">爱好：</label>
		<input type="checkbox" name="shobby" id="shobby" value="足球"  <c:if test="${fn:contains(stu.shobby,'足球')}">checked</c:if>/>足球
		<input type="checkbox" name="shobby" id="shobby" value="篮球"  <c:if test="${fn:contains(stu.shobby,'篮球')}">checked</c:if>/>篮球
		<input type="checkbox" name="shobby" id="shobby" value="排球"  <c:if test="${fn:contains(stu.shobby,'排球')}">checked</c:if>/>排球
		<input type="checkbox" name="shobby" id="shobby" value="气球"  <c:if test="${fn:contains(stu.shobby,'气球')}">checked</c:if>/>气球<br>
		<label for="sbirthday">生日：</label>
		<input type="date" name="sbirthday" id="sbirthday" value="${stu.sbirthday}"/><br>
		<input type="submit" id="submit" value="修改"/>
	</form>
</body>
</html>