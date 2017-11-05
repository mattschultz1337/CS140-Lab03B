package lab04;

import java.util.*;

public class RosterTester{
	public static void main(String[] args){
		Roster testRost = new Roster();
		Student jake = new Student(1811,"Jake");
		Student matt = new Student(2044,"Matt");
		Student alessandra = new Student(3210,"Alessandra");
		Student henry = new Student(4890,"Henry");
		testRost.addStudent(jake);
		testRost.addStudent(alessandra);
		testRost.addStudent(henry);
		testRost.addStudent(matt);
		System.out.println(testRost.toString());
		testRost.dropStudent(alessandra.getName());
		System.out.println(testRost.toString());
        testRost.sortById();
        System.out.println(testRost.toString());
		for(int i=0;i<testRost.getRoster().size();i++){
			System.out.println(testRost.getRoster().get(i).getName() + " " + testRost.getRoster().get(i).getId());
		}
	}
}
