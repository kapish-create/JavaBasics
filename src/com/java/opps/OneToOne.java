package com.java.opps;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address ad1 = new Address("Sector 103", "Gurgaon", "Haryana");
		Employee emp1 = new Employee("#1", "Kapish", ad1);
		
		Address ad2 = new Address("Sector 103", "Dwarka", "Delhi");
		Employee emp2 = new Employee("#2", "Gagan", ad2);
		
		emp1.showImpDetails();
		System.out.println("------------------------------------------------------------------------");
		emp2.showImpDetails();

	}

}

class Employee {
	String empId;
	String empName;

	Address address;

	Employee(String empId1, String empName1, Address address1) {
		empName = empName1;
		empId = empId1;
		address = address1;

	}

	void showImpDetails() {
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee location :" + address.location);
		System.out.println("Employee city :" + address.city);
		System.out.println("Employee state :" + address.state);
	}

}

class Address {
	String location;
	String city;
	String state;

	Address(String location1, String city1, String state1) {

		location = location1;
		city = city1;
		state = state1;
	}
}
