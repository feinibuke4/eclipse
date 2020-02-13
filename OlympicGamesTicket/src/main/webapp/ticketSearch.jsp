<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="Css/default.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="Div">
		<p align="center">
			<b>门票详细信息</b>
		</p>
	</div>
	<div align="right">
		<form method="post"  action="addUI">
			<input type="submit" value="新增门票信息" />
		</form>
	</div>
	&nbsp
	<div align="center">
		<table class="divTab" width="100%">
			<tr>
				<td><b>序号</b></td>
				<td><b>比赛项目</b></td>
				<td><b>开始时间</b></td>
				<td><b>价格</b></td>
				<td><b>剩余票数</b></td>
				<td><b>操作</b></td>
			</tr>
			<c:forEach items="${list }" var="li">
				<tr>
					<td>${li.ticketid }</td>
					<td>${li.ticketname }</td>
					<td><frm:formatDate value="${li.begintime }"
							pattern="yyyy-MM-dd" /></td>
					<td>${li.price }</td>
					<td>${li.totalcount-li.ordercount}</td>
					<td><a href="updateUI?id=${li.ticketid }" style="cursor: hand;">修改</a> <a
						href="delete?id=${li.ticketid }" style="cursor: hand;">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>