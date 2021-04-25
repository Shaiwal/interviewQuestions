package com.test.interviewQuestions;

import java.util.HashSet;
import java.util.Set;

class MapTest2 {

	private String name;
	private int salary;

	public MapTest2(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + salary + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MapTest2 employee = (MapTest2) o;

		if (salary != employee.salary) return false;

		if (name != null ? !name.equals(employee.name) : employee.name != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + salary;
		return result;
	}

	// Program to demonstrate the need for overriding equals and hashCode
	// method in Java
	public static void main(String[] args)
	{
		MapTest2 e1 = new MapTest2("John", 80000);
		MapTest2 e2 = new MapTest2("John", 80000);

		Set<MapTest2> employees = new HashSet<>();

		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);
	}
}