
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Util {

	/**
	 * Create utility method, which counts even numbers in given collection;
	 */
	public int countEvenNumbers(List<? extends Number> list){
		int count = 0;
		for (Number number: list) {
			if(number.doubleValue() % 2 == 0)
				count++;
		}
		return count;
	}

	/**
	 * Create utility method, which takes two lists and index and replaces element at given position
	 * in the first collection with corresponding element from the second one,
	 * without possibility to do vice versa;
	 */
	public <T> void replaceElement(List<T> list1, List<T> list2, int index){
		list1.set(index, list2.get(index));
	}

	/**
	 * Create utility method, which takes two lists and index and switches elements at given position;
	 * @param list1 first list
	 * @param list2 second list
	 * @param index index of element to switch
	 */
	public <T> void switchElements(List<T> list1, List<T> list2, int index){
		T o1 = list1.get(index);
		list1.set(index, list2.get(index));
		list2.set(index,o1);
	}

	/**
	 * Create utility method, which finds maximum element in the given list.
	 * @param list
	 * @return maximum element of list
	 */
	public <T extends Comparable<T>> T findMax(List<T> list){
		T max = list.get(0);
		for(int i=1; i<list.size()-1; i++){
			if(list.get(i).compareTo(list.get(i+1)) > 0){
				max = list.get(i);
			}
		}
		return max;
	}


	public static void main(String... args){
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		Util util = new Util();
		System.out.println("Count of even numbers is " + util.countEvenNumbers(integers));

		List<Integer> integers1 = Arrays.asList(5,4,3,2,1);

//		util.replaceElement(integers, integers1,0);
//		for(Integer o: integers){
//			System.out.println(o);
//		}
//		System.out.println();

		util.switchElements(integers1,integers,0);
		for(Integer i: integers){
			System.out.println(i);
		}
		System.out.println();
		for(Integer i: integers1){
			System.out.println(i);
		}
		System.out.println();


		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(2);
		list2.add(1);
		util.switchElements(list1,list2,0);
		for(Integer i: list2){
			System.out.println(i);
		}

		System.out.println("Max = "+util.findMax(integers));

		System.out.println("Count is " + util.countEvenNumbers(Arrays.asList(4.1, 4.2, 4.3)));
 	}
}
