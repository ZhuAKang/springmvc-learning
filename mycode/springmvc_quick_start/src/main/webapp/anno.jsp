<%--
  Created by IntelliJ IDEA.
  User: 尔康
  Date: 2020/4/11
  Time: 8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="anno/testRequestParam?name=haha">RequestParam</a>

    <form action="anno/testRequestBody" method="post">
        姓名：<input type="text" name="username" /><br/>
        密码：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>
    <a href="anno/testPathVariable/10">testPathVariable</a><br/>
    <a href="anno/testCookieValue">testCookieValue</a><br/>
    <a href="anno/testSessionAttributes">testSessionAttributes</a><br/>
    <a href="anno/getSessionAttributes">getSessionAttributes</a><br/>
</body>
</html>
