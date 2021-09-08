import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import study.java.helper.DBHelper;

public class Main03 {

	public static void main(String[] args) {
		/** 조회할 데이터와 SQL 구문 정의하기 */
		// 검색어
		String keyword = "김도훈";

		// 'department' 테이블에서 301번 학과를 삭제하기 위한 SQL 템플릿
		String sql = "SELECT profno, name, userid, position, sal, "
				+ "hiredate, comm, deptno FROM professor WHERE name=?";

		/** DBHepler를 통한 DB 접속 처리 */
		// import study.java.helper.DBHelper;
		DBHelper db = DBHelper.getInstance();
		// import java.sql.Connection;
		Connection conn = db.open();

		/** SQL 구문 실행하기 */
		// SQL문의 템플릿을 포함한 SQL 실행 객체
		// import java.sql.PreparedStatement;
		PreparedStatement pstmt = null;
		// SELECT 결과를 저장할 객체
		// import java.sql.ResultSet;
		ResultSet rs = null;

		// 결과값 (저장된 데이터의 수)
		int result = 0;

		try {
			// pstmt 객체 할당
			// AUTO_INCREMENT 값을 받을 필요가 없기 때문에 옵션을 설정하지 않는다.
			// --> INSERT 처리와 비교해 보세요.
			pstmt = conn.prepareStatement(sql);

			// 템플릿에 데이터 설정
			pstmt.setString(1, keyword);

			// SQL문 실행하기 --> 결과 행 리턴됨 (예외처리 요구됨)
			rs = pstmt.executeQuery();

			// 조회 결과의 첫 번째 줄로 이동
			boolean first = rs.next();

			if (first) {
				// SELECT절에 명시한 컬럼 이름을 사용하여 데이터를 추출
				int profNo = rs.getInt("profno");
				String name = rs.getString("name");
				String userid = rs.getString("userid");
				String position = rs.getString("position");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				System.out.printf("교수번호: %d\n", profNo);
				System.out.printf("이름: %s\n", name);
				System.out.printf("아이디: %s\n", userid);
				System.out.printf("직급: %s\n", position);
				System.out.printf("급여: %d\n", sal);
				System.out.printf("입사일: %s\n", hiredate);
				System.out.printf("보직수당: %d\n", comm);
				System.out.printf("학과번호: %d\n", deptno);
			} else {
				System.out.println("조회 결과가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());

		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) { }
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) { }
			}

			/** 결과 출력 */
			System.out.println(result + " Record Delete");

			/** DB 접속 해제 */
			db.close();
		}

	}
}
