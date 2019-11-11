<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
<link rel="stylesheet" type="text/css" href="../css/BaseStyle.css">
<link rel="stylesheet" type="text/css" href="../css/listStyle.css">
</head>
<body>
	<form action="${pageContext.request.contextPath }/addstu" method="post">
		<label for="sname">姓名：</label>
		<input type="text" name="sname" id="sname" placeholder="请输入姓名"/><span id="sname_tips"></span><br>
		<label for="sage">年龄：</label>
		<input type="text" name="sage" id="sage" placeholder="请输入年龄"/><br>
		<label for="sgender">性别：</label>
		<input type="radio" name="sgender" id="sgender" value="男"/>男
		<input type="radio" name="sgender" id="sgender" value="女"/>女<br>
		<label for="shobby">爱好：</label>
		<input type="checkbox" name="shobby" id="shobby" value="足球"/>足球
		<input type="checkbox" name="shobby" id="shobby" value="篮球"/>篮球
		<input type="checkbox" name="shobby" id="shobby" value="排球"/>排球
		<input type="checkbox" name="shobby" id="shobby" value="气球"/>气球<br>
		<label for="sbirthday">生日：</label>
		<input type="date" name="sbirthday" id="sbirthday"/><br>
		<input type="submit" id="submit" value="添加学生"/>
	</form>
</body>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script>
	$(function(){
		$("#sname").blur(function(){
			$.ajax({
				url:"SnameCheckServlet",
				method:"GET",
				async:true,
				data:{sname:$("#sname").val()},
				dataType:"json",
				success:function(data){
					var result = data.result;
					if(result=="success"){
						$("#sname_tips").html("用户名可用！").css("color","green");
					}else{
						$("#sname_tips").html("用户名不可用！").css("color","red");
						$("#sname").focus();
					}
				},
				error:function(error){
					console.log(error);
				}			
			});
		});
	});
</script>
</html>