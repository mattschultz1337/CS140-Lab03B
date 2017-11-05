package lab04;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeTester{
	public static void main(String[] args){
		ArrayList<Integer> practiceArray = new ArrayList<Integer>(Arrays.asList(0,1,2,2,4));
		ArrayList<Integer> copyArray = new ArrayList<Integer>(Arrays.asList(0,1,2,2,4));
		ArrayList<Integer> secondArray = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8,9,10));
		ArrayList<Integer> thirdArray = new ArrayList<Integer>(Arrays.asList(4,5,6,7));
		ArrayListPractice test1 = new ArrayListPractice(new ArrayList<Integer>(Arrays.asList(0,1,2,2,4)));
		ArrayListPractice test2 = new ArrayListPractice(new ArrayList<Integer>(Arrays.asList(0,1,2,2,4)));
		//intRemoveAll
		System.out.println(test1.intRemoveAll(2));
		System.out.println(test1.getArrList());

		//isEqual
		System.out.println(test2.isEqual(copyArray));

		//AppendArray
		int[] testArr = {5,6,7,8};
		test2.appendArray(testArr);
		System.out.println(test2.getArrList());

		//sumElementWIse
		System.out.print("Expected [4, 6, 8, 9, 12, 14, 16, 7, 8] actual: ");
		System.out.println(test2.sumElementWise(secondArray));
System.out.print("Expected [0, 2, 6, 2, 4, 5, 6, 7, 8] actual: ");
		System.out.println(test2.sumElementWise(test1.getArrList()));

	}
}
