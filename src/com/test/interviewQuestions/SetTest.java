package com.test.interviewQuestions;

import java.util.HashSet;
import java.util.Set;

/*
 * Set allows to add objects of same type
 */
public class SetTest {
	
	public static void main(String args[]) {
		Employee e1 = new Employee("Shaiwal");
		Employee e2 = new Employee("Vishal");
		Employee e3 = new Employee("Shaiwal");
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.println(set.size() + " ... " + set.toString());
	}

}

class Employee{
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
	
	public String toString() {
		return "name: "+this.name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	/*
	 * uncomment this... to test.. 
	 *@Override
	public boolean equals(Object o) {
		if(o instanceof Employee && ((Employee) o).getName().equals(this.name)) {
			System.out.println(((Employee) o).getName() + " ... " + this.name);
			return true;
		}
		return false;
	}*/
}