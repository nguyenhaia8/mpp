package lab04.prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double result = 0;
		for (Employee employee : list) {
			result += employee.computeUpdatedBalanceSum();
		}
		return result;
	}
}
