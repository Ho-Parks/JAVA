package study.java.daoex;
import java.util.List;
import study.java.daoex.modal.Student;

/** 학생별 성적 리스트 구현에 대한 설계 */
public interface StudentDao {
	/**
	 * 데이터를 저장한다. (INSERT 구문을 실행)
	 * @param params 	저장할 값을 담고 있는 Department 클래스의 객체
	 * @return int 		저장된 행의 Primary Key값 
	 */
	public int insert(Student params);
	
	/**
	 * 데이터를 삭제한다. (DELETE 구문을 실행)
	 * @param params 	WHERE절 조건값으로 시용할 deptno
	 * @return int 		삭제된 데이터의 수
	 */
	public int delete(int params);
	
	/**
	 * 데이터를 갱신한다. (UPDATE 구문을 실행)
	 * @param params 	Department 클래스의 객체
	 * @return int 		수정된 데이터의 수
	 */
	public int update(Student params);
	
	/**
	 * 데이터를 조회한다. (WHERE절을 사용한 SELECT문을 실행)
	 * @param params 	WHERE절 조건값으로 사용할 deptno
	 * @return department 조회된 데이터를 포함한 객체
	 */
	public Student selectOne(int params);
	
	/**
	 * 데이터 목록을 조회한다. (SELECT를 사용한 전체 데이터 조회)
	 * @return List 조회된 데이터를 포함한  컬렉션
	 */
	public List<Student> select();
}
