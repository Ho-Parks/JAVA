
import java.sql.Connection;

import study.java.daoex.StudentDao;
import study.java.daoex.impl.StudentDaoImpl;
import study.java.daoex.modal.Student;
import study.java.helper.DBHelper;

public class Main03 {
	public static void main(String[] args) {
		// 1) 데이터베이스에 접속
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2)UPDATE를 수행할 데이터 생성
		Student model = new Student(10101, "전인하", "jun123", 3, "7907021369824", "1979-07-02 00:00:00", "051)781-2158", 176, 72, 101, 9903);
		
		// 3) 데이터 수
		StudentDao dao = new StudentDaoImpl(conn);
		int result = dao.update(model);
	
		// 4) 결과 판별
		System.out.println(result + "개의 데이터 수정됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
