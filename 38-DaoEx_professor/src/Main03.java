
import java.sql.Connection;

import study.java.daoex.ProfessorDao;
import study.java.daoex.impl.ProfessorDaoImpl;
import study.java.daoex.modal.Professor;
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
		Professor model = new Professor(9901, "김도훈", "capool", "교수", 500, "1982-06-12 00:00:00", 15, 101);
		
		// 3) 데이터 수
		ProfessorDao dao = new ProfessorDaoImpl(conn);
		int result = dao.update(model);
	
		// 4) 결과 판별
		System.out.println(result + "개의 데이터 수정됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
