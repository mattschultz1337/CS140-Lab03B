package lab04;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice{
	private ArrayList<Integer> arrList = new ArrayList<Integer>();
	
	public ArrayListPractice(ArrayList<Integer> arr){
		arrList=arr;
	}
	
	public int intRemoveAll(int e){
		int total = 0;
		for(int i=0;i<arrList.size()-1;i++){
			if(arrList.get(i)==e){
				arrList.remove(i);
				i--;
				total ++;
			}
		}
		return total;
	}
	public boolean isEqual(ArrayList<Integer> other){
		if(other.size()!=arrList.size()){
			return false;
		}
		for(int i=0;i<arrList.size()-1;i++){
			if(arrList.get(i)!=other.get(i)){
				return false;	
			}
		}
		return true;
	}
	public void appendArray(int[] arr){
		if(arr==null){
			throw new IllegalArgumentException("Array can not be null");
		}
		for(int i=0;i<arr.length;i++){
			arrList.add(arr[i]);
		}
	}
	public ArrayList<Integer> sumElementWise(ArrayList<Integer> other){
		if(other ==null){
			throw new IllegalArgumentException("ArrayList can not be null");
		}
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if(other.size()<=arrList.size()){
			for(int i=0;i<arrList.size();i++){
				retList.add(arrList.get(i));
			}
			for(int l=0;l<other.size();l++){
				retList.set(l,other.get(l) + arrList.get(l));
			}
		}
		else{
		for(int x = 0;x<other.size();x++){
			retList.add(other.get(x));
		}
		for(int z = 0;z<arrList.size();z++){
			retList.set(z,other.get(z) + arrList.get(z));
		}
		}
		return retList;
	}
	public ArrayList<Integer> getArrList(){
		return arrList;	
	}
}
