package d0727;

import java.util.List;

import d0727.dao.AggrDao;
import d0727.vo.MoneySum;

public class D0722Test {

	public static void main(String[] args) {
		AggrDao dao = AggrDao.getInstance();
		List<MoneySum> result = dao.moneySum();
		System.out.println(result);
		
	}

}
