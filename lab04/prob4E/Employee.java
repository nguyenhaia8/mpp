package lab04.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double result = 0;
		for (Account account : accounts) {
			result += account.computeUpdateBalance();
		}
		return result;
	}
}
