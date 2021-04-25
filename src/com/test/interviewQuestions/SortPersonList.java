package com.test.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * multifield sorting on person object list in java... 
 */
public class SortPersonList implements Comparator<Person> {
	
	private static List<Comparator<Person>> comparatorList = null; 
	
	public static void main(String args[]) {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person("Shaiwal", "Sharma", 31, "India"));
		l.add(new Person("Apoorwa", "Jain", 26, "Pakistan"));
		l.add(new Person("Shivani", "Gupta", 25, "Bangladesh"));
		l.add(new Person("Aayushi", "Jain", 24, "Switzerland"));
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		String[] sortFields = input.split(" ");
		comparatorList = new ArrayList<Comparator<Person>>();
		for(String str : sortFields) {
			//sortField = str;
			if(str.equalsIgnoreCase("firstName"))
				comparatorList.add(new FirstNameComparator());
			if(str.equalsIgnoreCase("lastName"))
				comparatorList.add(new LastNameComparator());
			if(str.equalsIgnoreCase("age"))
				comparatorList.add(new AgeComparator());
			if(str.equalsIgnoreCase("country"))
				comparatorList.add(new CountryComparator());
			//chained sorting with Java8 can also be done as below...
			//Collections.sort(l, new SortPersonList("lastName").thenComparing(new SortPersonList("firstName")));
		}
		Collections.sort(l, new SortPersonList());
		System.out.println(l);
		
	}

	@Override
	public int compare(Person o1, Person o2) {
		
		for(Comparator<Person> comp : comparatorList) {
			int result = comp.compare(o1, o2);
			if(result !=0) {
				return result;
			}
		}
		
		return 0;
	}
	/*
	 * if(sortField.equalsIgnoreCase("firstName")) { return
	 * o1.getFirstName().compareTo(o2.getFirstName()); }
	 * if(sortField.equalsIgnoreCase("lastName")) { return
	 * o1.getLastName().compareTo(o2.getLastName()); }
	 * if(sortField.equalsIgnoreCase("age")) { return o1.getAge() - o2.getAge(); }
	 * if(sortField.equalsIgnoreCase("country")) { return
	 * o1.getCountry().compareTo(o2.getCountry()); } return 0; }
	 */
}

class FirstNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

class LastNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
	
}

class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge() - o2.getAge();
	}
	
}

class CountryComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getCountry().compareTo(o2.getCountry()); 
	}
	
}

class Person{
	private String firstName;
	private String lastName;
	private int age;
	private String country;
	
	Person(String firstName, String lastName, int age, String country){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName + " age: " + this.age  + " country: " + this.country;
	}
}
