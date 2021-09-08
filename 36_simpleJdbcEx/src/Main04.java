import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import study.java.helper.DBHelper;

public class Main04 {
	public static void main(String[] args) {
		// 'department'테이블에 '컴퓨터정보과' 추가하기 위한 SQL
		String sql = "DELETE FROM department WHERE deptno=300";

		/** DBHelper를 통한 DB 접속 처리 */
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();

		/** SQL 구문 실행하기 */
		// SQL문을 실행할 수 있는 객체
		Statement stmt = null;
		// 결과값 (저장된 데이터의 수)
		int result = 0;

		try {
			// SQL문을 실행할 수 있는 객체 생성(예외처리 요구됨)
			stmt = conn.createStatement();
			// SQL문 실행하기 --> 결과 행 리턴됨 (예외처리 요구됨)
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());
		} finally {
			// SQL 구문의 에러 여부에 상관 없이 stmt 객체를 닫기 위하여 finally 블록 사용
			// --> 객체의 유효범위 설정을 위해서 stmt 객체는 try 블록 밖에 선언되었다.
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			}
		}

		// 결과출력
		System.out.println(result + " Record Delete");
		/** DB 접속 해제 */
		db.close();

	}
}
