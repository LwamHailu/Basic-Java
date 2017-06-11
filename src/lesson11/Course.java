package lesson11;

import java.util.Arrays;

public class Course {
	String c_name;
	String[] faculty;
	//int size=0;
	
	public Course(String c_name,String a[]) {
		this.c_name=c_name;
		faculty=a;
		//size=a.length;
		
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String[] getFaculty() {
		return faculty;
	}
	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}
	public String toString(){
		return String.format("\n"+Arrays.toString(getFaculty())+ " The Course Nmae is:- "+getC_name());
	}

}
