<%@ page language="java" pageEncoding="utf-8" 	contentType="text/html; charset=utf-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DataAccess | MultiDataSource 예제</title>
<style type="text/css">
body, p, pre {
    font-family: 나눔고딕;
    font-size: 15px;
    color: #666;
}
#menu, #menu li a{
    list-style-type: square;
    font-size: 15px;
    text-decoration: none;
    color: #333;
}
#menu li a:hover {
   font-weight: bold;
}
span {
background-color: #EAEAEA; font-weight: bold; 
}
</style>
</head>
<body>
<h1>MultiDataSource 예제</h1>
<p>
<pre>
<span>[요약]</span>
본 예제는 두 개의 DataSource(DB)를 사용해 동작하며, MyBatis 기준으로 작성되었습니다.
단, 단일 트랜잭션(DataSourceTransactionManager)으로 처리되므로 JTA 트랜잭션과 필요한 예외처리는 직접 추가하셔야 합니다

1) context-datasource.xml - dataSource(embedded db 사용) 와 otherDataSource(mysql 사용) 정의
2) context-mybatis.xml - sqlSession(dataSource 사용) 과 otherSqlSession(otherDataSource 사용) 정의
3) EmpMapper.java - otherSqlSession을 사용하도록 setSqlSessionFactory() 메소드 오버라이딩
</pre>
</p>
<br />
<div>
	<ul id="menu">
		<li><a href="<c:out value='dept/retrieveDeptList.do' />">dataSource에 연결된 부서게시판</a></li><br />
		<li><a href="<c:out value='emp/retrieveEmployeeList.do' />">otherDataSource에 연결된 사원게시판</a></li>
	</ul>
</div>
</body>
</html>