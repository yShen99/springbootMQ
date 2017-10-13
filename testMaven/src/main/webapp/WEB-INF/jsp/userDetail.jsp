<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>SSMREDIS测试</title>
  </head>
  
  <body>
    <form action="insertUser" method="post">
    	姓名：<input name="name" value="${user.userName}">
    	密码：<input name="pwd" value="${user.password}">
    	年龄：<input name="age" value="${user.age}">
    	主键：<input name="age" value="${user.id}">
    	<br>
    	<p>数据库中多了一个创建时间的字段，是后来加上的，但是java类已经生成了，就没有重新生成一次了</p>
    	<p>在userMapper.xml中加入了  useGeneratedKeys="true" keyProperty="id" 两个属性，可以返回该条插入记录的主键 ID为主键的字段名，
    	可以跟你自己的名称做修改</p>
    	<p>我在项目中配置的启动项目名为ssmRedis，访问的时候直接访问http://localhost:8081/ssmRedis会出现hello world </p>
    	<p>然后可以借着访问http://localhost:8081/ssmRedis/user/login </p>
    	<p>注意提交的是年龄必须为数字，否则后台会报异常，后台定义的age字段类型为int</p>
    	<p>当你访问 	http://localhost:8081/ssmRedis/user/getUser?id=33 	时可以通过控制台输出的日志看到是否会再次执行sql</p>
    	<button type="submit">提交</button>
    </form>
  </body>
</html>
