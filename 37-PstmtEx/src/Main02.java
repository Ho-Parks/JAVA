import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import study.java.helper.DBHelper;

public class Main02 {

	public static void main(String[] args) {
		/** 삭제할 데이터와 SQL 구문 정의하기 */
		// 삭제할 데이터
		int deptno = 0;

		// 'department' 테이블에서 301번 학과를 삭제하기 위한 SQL 템플릿
		String sql = "DELETE FROM department WHERE deptno=?";

		/** DBHepler를 통한 DB 접속 처리 */
		// import study.java.helper.DBHelper;
		DBHelper db = DBHelper.getInstance();
		// import java.sql.Connection;
		Connection conn = db.open();
		
		/** SQL 구문 실행하기 */
		// SQL문의 템플릿을 사용하여 쿼리 실행을 준비하는 객체'
		PreparedStatement pstmt = null;

		// 결과값 (저장된 데이터의 수)
		int result = 0;

		try {
			// pstmt 객체 할당
			// AUTO_INCREMENT 값을 받을 필요가 없기 때문에 옵션을 설정하지 않는다.
			// --> INSERT 처리와 비교해 보세요.
			pstmt = conn.prepareStatement(sql);

			// 템플릿에 데이터 설정
			pstmt.setInt(1, deptno);

			// SQL문 실행하기 --> 결과 행 리턴됨 (예외처리 요구됨)
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());

		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}

			/** 결과 출력 */
			System.out.println(result + " Record Delete");

			/** DB 접속 해제 */
			db.close();
		}

	}
}
