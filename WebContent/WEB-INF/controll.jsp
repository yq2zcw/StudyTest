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
<script type="text/javascript" src="./js/controll.js">

</script>


</head>
<body>

	<table id="id" border="6" align="left">
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


	<div>
	<h3>删除</h3>
		<form action="delete" id="deleteId" align="center">
			<input type="text" id="delId" placeholder="输入id" name="id" />
			<button type="button" id="Id">
				<p>确认</p>
			</button>
		</form>
	</div>

	<div>
	<h3>添加</h3>
		<form action="add" id="addId" align="center">
			<input type="text" id="addid" placeholder="输入id" name="id" /> <input
				type="text" id="addname" placeholder="输入name" name="name" /> <span
				class="alertarea"></span> <input type="text" id="addbirthday"
				placeholder="输入birthday" name="birthday" /> <input type="text"
				id="addage" placeholder="输入age" name="age" /> <input type="text"
				id="addclassName" placeholder="输入className" name="classname" />
			<button type="button" id="ADDid">
				<p>确认</p>
			</button>
		</form>
	</div>

	<div>
	<h3>修改</h3>
		<form action="update" id="updId" align="center">
			<input type="text" id="updid" placeholder="输入id" name="id" /> <input
				type="text" id="updname" placeholder="输入name" name="name" /> <span
				class="alertarea"></span> <input type="text" id="updbirthday"
				placeholder="输入birthday" name="birthday" /> <input type="text"
				id="updage" placeholder="输入age" name="age" /> <input type="text"
				id="updclassName" placeholder="输入className" name="classname" />
			<button type="button" id="UPDid">
				<p>确认</p>
			</button>
		</form>
	</div>
</body>
</html>