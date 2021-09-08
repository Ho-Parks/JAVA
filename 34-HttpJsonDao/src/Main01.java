
import java.util.List;
import study.java.dao.GradeDao;
import study.java.dao.impl.HttpJsonGradeDaoImpl;
import study.java.modal.Grade;

public class Main01 {

	public static void main(String[] args) {
		GradeDao dao = new HttpJsonGradeDaoImpl();
		List<Grade> list = dao.getGradeList();
		
		for (int i = 0; i < list.size(); i++) {
			Grade item = list.get(i);
			System.out.println(item.toString());
		}
	}

}
