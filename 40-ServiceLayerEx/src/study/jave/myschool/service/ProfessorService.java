package study.jave.myschool.service;

import java.util.List;
import study.java.myschool.model.Professor;

/**   
 * 학과 관리 기능과 관련된 MyBatis  Mapper를 간접적으로 호출하기 위한
 * 기능 명세.
 * 하나의 처리를 위해서 두 개 이상의 기능을 연동할 필요가 있을 경우,
 * 이 인터페이스의 구현체(Impl)을 통해서 처리한다.
 */
public interface ProfessorService {
	/** 
	 * 교수 등록하기
	 * @param professor - 저장할 정보를 담고 있는 Beans
	 * @return 
	 * @throws Exception
	 */
	// --> import study.jsp.myschool.model.Professor
	public void addProfessor(Professor professor) throws Exception;
	
	/** 
	 * 교수 수정하기
	 * @param professor - 수정할 정보를 담고 있는 Beans
	 * @return - 수정된 데이터
	 * @throws Exception
	 */
	public void editProfessor(Professor professor) throws Exception;
	
	/** 
	 * 교수 삭제하기
	 * @param professor - 저장될 정보를 담고 있는 Beans
	 * @throws Exception
	 */
	public void deleteProfessor(Professor professor) throws Exception;
	
	/** 
	 * 교수 상세 조회
	 * @param params - 조회할 교수의 정보를 담고 있는 Beans
	 * @return - 조회결과를 담고 있는Beans
	 * @throws Exception 
	 */
	public Professor getProfessorItem(Professor professor) throws Exception;

	/** 
	 * 교수 목록 조회
	 * @return - 조회 결과에 대한 컬렉션
	 * @throws Exception - SQL처리에 실패한 경우
	 */
	public List<Professor> getProfessorList(Professor professor) throws Exception;
}
