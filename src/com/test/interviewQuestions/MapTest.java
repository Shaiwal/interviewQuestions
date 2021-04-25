package com.test.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String args[]) {
		Emp e1 = new Emp();
		e1.setEmployeeId(1);
		
		Emp e2 = new Emp();
		e2.setEmployeeId(1);
		
		Map<Emp, Integer> m = new HashMap<Emp, Integer>();
		
		m.put(e1, 1);
		m.put(e2, 1);
		
		System.out.println(m.size() + " ... " + m);
	}

}

class Emp{
	int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	@Override
	public int hashCode() {
		return this.employeeId;
	}
	
	/*
	 * Uncomment this to test
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Emp && ((Emp)o).employeeId == this.employeeId) {
			return true;
		}
		return false;
	}
}
