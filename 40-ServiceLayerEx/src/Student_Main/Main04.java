package Student_Main;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.impl.StudentServiceImpl;
import study.jave.myschool.service.StudentService;

public class Main04 {
	public static void main(String[] args) {

		/** 처리 결과를 기록할 Log4J 객체 생성 */
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main03.class.getName());
		
		/** 조회할 데이터의 일련번호를 저장하고 있는 Beans 객체 생성 */
		// --> import study.java.myschool.model.Department;
		Student stud = new Student();
		stud.setStudno(10101);
		
		/** 데이터베이스 접속 */
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/** 데이터 처리 수행 */
		// 비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		StudentService studentService = new StudentServiceImpl(session, logger);
		// 조회 결과가 저장될 객체 선언
		Student item = null;
		
		try {
			// 학과 조회하기
			item = studentService.getStudentItem(stud);
			// 처리 결과를 로그에 기록하기
			logger.debug("조회된 데이터 >> " + item.toString());
		} catch (NullPointerException e) {
			logger.error("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			logger.error("데이터 조회에 실패했습니다." + e.getMessage());
		}
		
		/** 데이터베이스 접속 해제 */
		//session.close();
		
	}
}
