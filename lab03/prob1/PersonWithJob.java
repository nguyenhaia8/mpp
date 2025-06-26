package lab03.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	PersonWithJob(String name, double s) {
		this.person = new Person(name);
		salary = s;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return person.getName();
	}

	public Person getPerson() {
		return person;
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob other = (PersonWithJob) aPersonWithJob;
		return this.person.equals(other.person) && this.salary == other.salary;
//		PersonWithJob p = (PersonWithJob)aPersonWithJob;
//		boolean isEqual = this.getName().equals(p.getName()) &&
//				this.getSalary()==p.getSalary();
//		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob personWithJob = new PersonWithJob("Joe", 30000);
		Person p1 = personWithJob.getPerson();
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

	//	PersonWithJob p1 = new PersonWithJob("Joe", 30000);
	//	Person p2 = new Person("Joe");
	//	//As PersonsWithJobs, p1 should be equal to p2
	//	System.out.println("p1.equals(p2)? " + p1.equals(p2));
	//	System.out.println("p2.equals(p1)? " + p2.equals(p1));

	// Explain:
	// p1 is a instance of PersonWithJob, so equals method in PersonWithJob was called
	// in equals method in PersonWithJob, we check should be instanceof PersonWithJob. But p2 is a Person, not PersonWithJob. so return false

	// p2 is a instance of Person, so equals method in Person was called
	// in equals method in Person, we check should be instanceof Person, moreover p1 is a PersonWithJob, also a Person, and then we compare the name so it return true
}
