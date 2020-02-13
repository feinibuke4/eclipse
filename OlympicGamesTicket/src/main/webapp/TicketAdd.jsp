<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <b>添加比赛门票信息</b>
		</p>
    </div>
    <div align="center">
    <form action="secaadd" method="post">
        <table class="divTab" width="50%">
            <tr align="left">
                <td>
                    比赛名称:</td>
                <td>
                    <input id="Text1" type="text" name="Ticketname" /><span style="color: Red;">不能为空</span></td>
            </tr>
            <tr align="left">
                <td>
                    比赛场地:</td>
                <td>
                    <select id="SelStadium" name="Stadiumid">
                        <option value="0" selected>请选择</option>
                        <option value="1">国家体育场</option>
                        <option value="2">国家游泳中心</option>
                        <option value="3">工人体育场</option>
                        <option value="4">北京大学体育馆</option>
                    </select>
                </td>
            </tr>
            <tr align="left">
                <td>
                    开始时间:</td>
                <td>
                    <input id="Text4" type="date" name="Begintime" /><span style="color: Red;">不能为空</span></td>
            </tr>
            <tr align="left">
                <td>
                    价格:</td>
                <td>
                    <input id="Text5" type="text" name="Price" /><span style="color: Red;">不能为空且必须为数字</span></td>
            </tr>
            <tr align="left">
                <td>
                    备注:</td>
                <td>
                    <textarea name="Descn" id="TextArea1" style="width: 260px; height: 84px"></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input id="Button1" type="submit" value="提交" />
                    <input id="Button2" type="button" value="重置" /></td>
            </tr>
        </table>
        </form>
    </div>

</body>
</html>