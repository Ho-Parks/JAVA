package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;
import study.java.myschool.model.Student;
import study.jave.myschool.service.StudentService;

public class StudentServiceImpl implements StudentService {

	/** 처리 결과를 기록할 Log4J객체 생성 */
	// --> import org.appache.logging.log4j.Logger
	Logger logger;

	/** MyBatis */
	// --> import org.appache.ibatis.session.SqlSession
	SqlSession sqlSession;

	/** 생성자. SqlSession을 전달받는다 . */
	public StudentServiceImpl(SqlSession sqlSession, Logger logger) {
		this.sqlSession = sqlSession;
		this.logger = logger;
	}

	@Override
	public void addStudent(Student student) throws Exception {
		try {
			int result = sqlSession.insert("StudentMapper.insertStudentItem", student);
			if (result == 0) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("저장된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 저장에 실패했습니다.");
		} finally {
			logger.debug("저장된 데이터 >> " + student.toString());
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Override
	public void editStudent(Student student) throws Exception {
		try {
			int result = sqlSession.update("StudentMapper.updateStudentItem", student);
			if (result == 0) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("변경된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 수정에 실패했습니다.");
		} finally {
			logger.debug("수정된 데이터 >> " + student.toString());
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Override
	public void deleteStudent(Student student) throws Exception {
		try {
			int result = sqlSession.delete("StudentMapper.deleteStudentItem", student);
			if (result == 0) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("삭제된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 삭제에 실패했습니다.");
		} finally {
			logger.debug("삭제된 데이터 >> " + student.toString());
			sqlSession.commit();
			sqlSession.close();
		}
	}

	@Override
	public Student getStudentItem(Student student) throws Exception {
		Student result = null;

		try {
			result = sqlSession.selectOne("StudentMapper.selectStudentItem", student);
			if (result == null) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		return result;
	}

	@Override
	public List<Student> getStudentList(Student student) throws Exception {
		List<Student> result = null;

		try {
			result = sqlSession.selectList("StudentMapper.selectStudentList", null);
			if (result == null) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		return result;
	}

}