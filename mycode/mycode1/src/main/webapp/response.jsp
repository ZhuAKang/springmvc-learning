<%--
  Created by IntelliJ IDEA.
  User: 尔康
  Date: 2020/4/11
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script type="text/javascript">
        //页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                $.ajax({
                    //编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hehe","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                })
            });
        });
    </script>

</head>
<body>
    <a href="user/testString">testString,返回字符串类型</a><br/>
    <a href="user/testVoid">testVoid,返回空</a><br/>
    <a href="user/testVoid">testModelAndView</a><br/>
    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br/>

    <button id="btn">发送Ajax的请求</button>
</body>
</html>
