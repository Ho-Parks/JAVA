package Student_Main;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.impl.StudentServiceImpl;
import study.jave.myschool.service.StudentService;

public class Main02 {
	public static void main(String[] args) {
		
		/** 처리 결과를 기록할 Lgo4J 객체 생성 */
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main02.class.getName());

		/** 수정될 데이터를 담고 있는 Beans 객체 생성 */
		// --> import study.java.myschool.model.Department;
		Student stud = new Student();
		stud.setStudno(20106);
		stud.setName("박인호");
		stud.setUserid("ebusinho");
		stud.setGrade(4);
		stud.setIdnum("7709121128371");
		stud.setBirthdate("1996-04-20 00:00:00");
		stud.setTel("051)724-1111");
		stud.setHeight(180);
		stud.setWeight(60);
		stud.setDeptno(201);
		stud.setProfno(9902);
		/**  데이터베이스 접속 */
		// --> import org.apache.ibatis.session SqlSession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/** 데이터 처리 수행 */
		// 비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		StudentService studentService = new StudentServiceImpl(session, logger);
		// 수정된 결과를 리턴받기 위한 Beans 객체
		//Department result = null;
		
		
		try {
			// 학과 수정하기
			studentService.editStudent(stud);
			// 수정결과를 데이터베이스에 반영하기
			//session.commit();
			// 처리 결과를 로그에 기록하기
			//logger.debug("수정된 데이터 >> " + result.toString());
		} catch (NullPointerException e) {
			// 수정된 데이터가 없는 경우
			logger.error("수정된 데이터가 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			// SQL문에 문제가 있는 경우.
			// 데이터베이스로부터 전달되는 에러메시지를 상세히 확인하기 위하여
			//  e.getMessage()의 리턴값을 함께 기록한다.
			logger.error("데이터 수정에 실패했습니다." + e.getMessage());
			e.printStackTrace();
		}
		
		/** 데이터베이스 접속 해제 */
		//session.close();
	}
}
