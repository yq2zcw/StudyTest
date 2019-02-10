<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/juery.dataTables.min.js">

</script>

<script type="text/javascript">
	$(function() {
		$("#idquerysumit").click(function() {
			var input_Id = $("#queryid").val();
			if (input_Id == null || input_Id == "") {
				alert("输入不能为空");
			} else {
				var idname = /^[0-9]+$/;
				if (!idname.test($("#queryid").val())) {
					alert("输入数字");
				} else {
					$("#IDform").submit();
				}
			}
		})
	})
</script>

<script type="text/javascript">
	$(function() {
		$("#namequerysumit").click(function() {
			var input_Name = $("#queryname").val();
			if (input_Name == null || input_Name == "") {
				alert("输入不能为空");
			} else {
				var name =  /^[\u3040-\u309F\u30A0-\u30FF\u4e00-\u9fa5A-Za-z]+$/;
				if (!name.test($("#queryname").val())) {
					alert("请输入正确姓名");
				} else {
					$("#Nameform").submit();
				}
			}
		})
	})
</script>
</head>
<body>
	<!--设置图表，边框粗细，文本靠左 -->
	<table id="table_id" border="8" align="left">
		<!--设置图表首行 -->
		<tr>
			<th>id</th>
			<th>name</th>
			<th>birthday</th>
			<th>age</th>
			<th>className</th>
			<th>test</th>
		</tr>
		<!--设置内容值 -->
		<tr>
			<c:forEach items="${teacher}" var="teacher">
				<tr>
					<td>${teacher.id}</td>
					<td>${teacher.name}</td>
					<td>${teacher.birthday}</td>
					<td>${teacher.age}</td>
					<td>${teacher.className}</td>
					<td>${teacher.test}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>

	<!--id查询栏，按钮 -->
	<div id="edit_com" class="class" align="center">
		<h2>学生Id查询</h2>
		<form id="IDform" action="queryById" method="post">
			<input id="queryid" type="text" placeholder="查询id" name="id" />
			<button id="idquerysumit" type="button">
				<p>查询</p>
			</button>
		</form>
	</div>

	<!--name查询栏，按钮 -->
	<div id='edit_com' class="class" align="center">
		<h2>学生姓名查询</h2>
		<form id="Nameform" action="queryByName" method="post">
			<input id="queryname" type="text" placeholder="查询name" name="name" />
			<button id="namequerysumit" type="button">
				<p>查询</p>
			</button>
		</form>
	</div>


</body>
</html>