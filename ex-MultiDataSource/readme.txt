본 예제는 두 개의 DataSource(DB)를 사용해 동작하며, MyBatis 기준으로 작성되었습니다.
단, 단일 트랜잭션(DataSourceTransactionManager)으로 처리되므로 JTA 트랜잭션과 필요한 예외처리는 직접 추가하셔야 합니다

1) context-datasource.xml - dataSource(embedded db 사용) 와 otherDataSource(mysql 사용) 정의
2) context-mybatis.xml - sqlSession(dataSource 사용) 과 otherSqlSession(otherDataSource 사용) 정의
3) EmpMapper.java - otherSqlSession을 사용하도록 setSqlSessionFactory() 메소드 오버라이딩