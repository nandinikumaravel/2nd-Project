package org.emp;

public class Employee {

	private void empID() {

		System.out.println(1234);

	}

	private void empName() {
		System.out.println("Manoj");

	}

	private void empDob() {
		System.out.println("PI123");

	}

	private void empPhone() {
		System.out.println("7871068736");

	}

	private void empEmail() {

System.out.println("manoj@gmail.com");

}

	private void empAddress() {
		System.out.println("123, Chennai - 600096");

	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empID();
		e.empAddress();
		e.empDob();
		e.empEmail();
		e.empName();
		e.empPhone();
		int a=0;
		if (a == 0) {
			System.out.println(a);
		}
		for (int i = 0; i < args.length; i++) {
			a++;
		}
		
	}
}
