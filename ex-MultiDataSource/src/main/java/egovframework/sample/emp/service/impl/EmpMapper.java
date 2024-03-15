/*
 * Copyright 2014 MOSPA(Ministry of Security and Public Administration).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.sample.emp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import egovframework.sample.emp.service.EmpVO;

/**
 * 사원정보에 관한 데이터처리 매퍼 클래스
 * 
 * @author Daniela Kwon
 * @since 2014.01.24
 * @version 3.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2014.04.07	Daniela Kwon		최초생성
 * 
 * </pre>
 */

@Repository("empMapper")
public class EmpMapper extends EgovAbstractMapper {
	
    @Resource(name = "otherSqlSession")
    public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
    	LoggerFactory.getLogger(EmpMapper.class).debug("###########otherSqlSession(otherDataSource) 바인딩");
    	super.setSqlSessionFactory(sqlSession);
    }
    
	/**
	 * DB에서 사원목록을 조회한다.
	 * 
	 * @param empVO
	 * @return List
	 * @throws Exception
	 */
	public List<EmpVO> retrieveEmpList(EmpVO empVO) throws Exception {
		return selectList("EmpMapper.retrieveEmpList", empVO);
	}

	/**
	 *  DB에서 사원정보를 상세조회한다.
	 * 
	 * @param empVO
	 * @return EmpVO
	 * @throws Exception
	 */
	public EmpVO retrieveEmp(EmpVO empVO) throws Exception {
		return selectOne("EmpMapper.retrieveEmp", empVO);
	}

	/**
	 *  DB에서 사원정보를 수정한다.
	 * 
	 * @param empVO
	 * @return void
	 * @throws Exception
	 */
	public void updateEmp(EmpVO empVO) throws Exception {
		update("EmpMapper.updateEmp", empVO);
	}

	/**
	 *  DB에 사원정보를 입력한다.
	 * 
	 * @param empVO
	 * @return void
	 * @throws Exception
	 */
	public void insertEmp(EmpVO empVO) throws Exception {
		insert("EmpMapper.insertEmp", empVO);
	}

	/**
	 *  DB에서 사원정보를 삭제한다.
	 * 
	 * @param empVO
	 * @return void
	 * @throws Exception
	 */
	public void deleteEmp(EmpVO empVO) throws Exception {
		delete("EmpMapper.deleteEmp", empVO);
	}

	/**
	 *  사원조회 시 총 레코드 수를 조회한다.
	 * 
	 * @param empVO
	 * @return int
	 * @throws Exception
	 */
	public int retrieveEmpListTotCnt(EmpVO empVO) throws Exception {
		return selectOne("EmpMapper.retrieveEmpListTotCnt", empVO);
	}
}
