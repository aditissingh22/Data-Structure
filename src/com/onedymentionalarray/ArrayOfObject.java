package com.onedymentionalarray;

public class ArrayOfObject {

	
	public static void main(String[] args) {
		
		
		Student s1 = new Student("Aditi", 1);
		Student s2 = new Student("Mrigank", 2);
		Student s3 = new Student("Babu", 3);
		
		Student[] student = new Student[5]; //Array of reference
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		
		for (Student stud : student) {
			
			System.out.println(stud);
		}
	}
	
}


class Student{
	
	String name;
	int rollNum;
	
	
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + "]";
	}
	
	
}
