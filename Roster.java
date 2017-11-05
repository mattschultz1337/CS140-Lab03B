package lab04;

import java.util.*;

public class Roster{
	private ArrayList<Student> classRoster = new ArrayList<Student>();

	public ArrayList<Student> getRoster(){
		return classRoster;	
	}

	public void addStudent(Student s){
		classRoster.add(s);	
	}
	public void dropStudent(String name){
		for(int i=0;i<classRoster.size();i++){
			if(classRoster.get(i).getName().equals(name)){
				classRoster.remove(i);
			}
		}	
	}
	public String toString(){
		String retString = "[";
		for(int i=0;i<classRoster.size();i++){
			if(i==classRoster.size()-1){
				retString = retString + classRoster.get(i).getName() + "]";
			}
			else {
				retString = retString + classRoster.get(i).getName() + ", ";
			}
		}	
		return retString;
	}
	public void sortById(){
		Student placeholder;
		for(int i=0;i<classRoster.size();i++){
			for(int x=1;x<classRoster.size();x++){
				if(classRoster.get(x-1).getId() > classRoster.get(x).getId()){
				    placeholder = classRoster.get(x-1);
				    classRoster.set(x-1,classRoster.get(x));
				    classRoster.set(x,placeholder);	
				}
			}
		}
	}
}
