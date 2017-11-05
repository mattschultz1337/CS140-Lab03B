package lab04;

import java.util.*;

public class Student{
	private int id;
	private String name;
	
	public Student(int idNum, String namer){
		id = idNum;
		name = namer;
	}

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}
