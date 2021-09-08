import java.sql.Connection;

import study.java.daoex.ProfessorDao;
import study.java.daoex.impl.ProfessorDaoImpl;
import study.java.daoex.modal.Professor;
import study.java.helper.DBHelper;

public class Main01 {
	public static void main(String[] args) {
		// 1) 데이터베이스에 접속
		// --> import java.sql.Connection
		// --> import study.java.helper.DBHelper;
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		// 2) INSERT를 수행할 데이터 생성 
		// -->  사용되지 않는 값(deptno)는 0(int)이나 null(String)로 지정한다.
		Professor model = new Professor(0, "박인호", "ebusinho", "교수", 500, "2021-04-16 00:00:00", 30, 101);
		
				
		// 3) 데이터 저장
		ProfessorDao dao = new ProfessorDaoImpl(conn);
		int result = dao.insert(model);
		
		// 4) 결과 판별
		System.out.println(result + "번 데이터 저장됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
