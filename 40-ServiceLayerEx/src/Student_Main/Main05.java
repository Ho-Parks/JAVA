package Student_Main;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.impl.StudentServiceImpl;
import study.jave.myschool.service.StudentService;

public class Main05 {
	public static void main(String[] args) {

		/** 처리 결과를 기록할 Log4J 객체 생성 */
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main05.class.getName());
		
		/** 데이터베이스 접속 */
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/** 데이터 처리 수행 */
		// 비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		StudentService studentService = new StudentServiceImpl(session, logger);
		// 조회 결과가 저장될 객체 선언
		List<Student> list = null;
		
		try {
			// 학과 조회하기
			list = studentService.getStudentList(null);
			// 처리 결과를 로그에 기록하기
			for(int i=0; i < list.size(); i++) {
				Student temp = list.get(i);
				logger.debug(String.format("조회결과[%d] >> %s", i, temp.toString()));
			}
		} catch (NullPointerException e) {
			logger.error("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			logger.error("데이터 조회에 실패했습니다." + e.getMessage());
		}
		
		/** 데이터베이스 접속 해제 */
		session.close();
		
	}
}
