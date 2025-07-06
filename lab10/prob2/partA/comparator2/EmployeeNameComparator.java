package lab10.prob2.partA.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
//		return e1.name.compareTo(e2.name);
		int nameCompare = e1.name.compareTo(e2.name);
		if (nameCompare == 0) {
			return Integer.compare(e1.salary, e2.salary);
		}
		return nameCompare;
	}
}
