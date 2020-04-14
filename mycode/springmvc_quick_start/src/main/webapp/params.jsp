<%--
  Created by IntelliJ IDEA.
  User: 尔康
  Date: 2020/4/10
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--请求参数的绑定--%>
<%--    <a href="param/testParam?username=hehe&password=123">请求参数绑定</a>--%>
    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username" /><br/>
        密码：<input type="text" name="password" /><br/>
        金额：<input type="text" name="money" /><br/>
<%--        用户的姓名：<input type="text" name="user.uname" /><br/>--%>
<%--        用户的年龄：<input type="text" name="user.age" /><br/>--%>
        用户的姓名：<input type="text" name="list[0].uname" /><br/>
        用户的年龄：<input type="text" name="list[0].age" /><br/>

        用户的姓名：<input type="text" name="map['one'].uname" /><br/>
        用户的年龄：<input type="text" name="map['one'].age" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>
</body>
</html>
