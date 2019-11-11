<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生管理系统</title>
    <base href="${pageContext.request.contextPath}/">
    <link rel="stylesheet" type="text/css" href="css/BaseStyle.css">
    <link rel="stylesheet" type="text/css" href="css/listStyle.css">
</head>
<body>
<div class="center">
    <form action="QueryStuServlet" method="get">
        <table>
            <tr>
                <td colspan="8"><label for="sname">姓名：</label>
                    <input type="text" name="sname" id="sname" placeholder="请输入姓名"/>
                    <label for="sgender">性别：</label>
                    <select id="sgender" name="sgender">
                        <option value="">--请选择--</option>
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select> <input type="submit" value="查询"/> <a href="addStu">添加学生</a></td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>学生编号</td>
                <td>学生姓名</td>
                <td>学生年龄</td>
                <td>学生性别</td>
                <td>学生爱好</td>
                <td>学生生日</td>
                <td>操作</td>
            </tr>
            <c:if test="${empty stuList}">
                <tr>
                    <td colspan="8">无学生数据，请添加。</td>
                </tr>
            </c:if>
            <c:if test="${not empty stuList}">
                <c:forEach items="${stuList}" var="stu">
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>${stu.sid}</td>
                        <td>${stu.sname}</td>
                        <td>${stu.sage}</td>
                        <td>${stu.sgender}</td>
                        <td>${stu.shobby}</td>
                        <td>${stu.sbirthday}</td>
                        <td><a href="GoEditStuServlet?sid=${stu.sid}">修改</a> <a href="javascript:;"
                                                                                onclick="delBySid(${stu.sid})">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </form>
</div>
</body>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script>
    function delBySid(sid) {
        var flag = confirm("是否删除？");
        if (flag) {
            location.href = "DeleteBySid?sid=" + sid;
        } else {
            alert("未删除！");
        }
    }
</script>
</html>