public class Main02 {
	public static void main(String[] args) {
		/**
		 * 무명클래스(Anonymous Class) 
		 * ------------------------------------ 
		 * Interface나 Abstract Class처럼 상속을 통해서만 사용할 수 있는 경우, 
		 * 별도의 클래스 생성과정 없이 상속과 구현을 한번에 처리하는 기법
		 */

		// 게시판의 기능 정의
		MySite bbs = new MySite() {
			@Override
			public void write() {
				System.out.println("새 글 쓰기");
			}

			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		}; // end MySite
		
		bbs.write();
		bbs.delete();
		
		// 회원관리의 기능 정의
		MySite member = new MySite() {

			@Override
			public void write() {
				System.out.println("회원가입");
			}

			@Override
			public void delete() {
				System.out.println("회원탈퇴");
			}
			
		};
		
		member.write();
		member.delete();
	}

}
