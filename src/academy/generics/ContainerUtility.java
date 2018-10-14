package academy.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContainerUtility {

	private static final String TEST_STRING = "WBR for Roma & inventorsoft";
	private static final Long NUMBER_LONG = Long.valueOf(777L);
	private static final Integer NUMBER_INTEGER = Integer.valueOf(555);
	private static final Integer NUMBER_INTEGER_BAD = Integer.valueOf(666);

	private static final List<Number> TEST_NUMBER_ODD_LIST = Arrays.asList(-3,1,3,5,7,9);
	private static final List<Number> TEST_NUMBER_LIST = Arrays.asList(-100,-4f,-3,0,1,2,3,4d,5,6,7,8L,9,10);
	private static final List<Integer> TEST_INTEGER_LIST = Arrays.asList(-100,-4,-3,0,1,2,3,4,5,6,7,8,9,10);
	private static final List<Float> TEST_FLOAT_LIST = Arrays.asList(-2f, 1f, 2.2f, 4.0f, 100f);
	private static final List<String> TEST_STRING_LIST1 = Arrays.asList("a0","a1","a2","a3","a4","a5");
	private static final List<String> TEST_STRING_LIST2 = Arrays.asList("b0","b1","b2","b3","b4");
	private static final int INDEX0 = 2, INDEX1 = 4, INDEX2 = 1;
	private static final int BAD_INDEX1 = -1, BAD_INDEX2 = TEST_STRING_LIST2.size();

	
	// 3.
	public static int countEvenNumbers(Collection<? extends Number> coll) {
		return coll.stream()
				.map( x -> x.doubleValue() )
				.mapToInt( x -> x%2 == 0 ? 1 : 0 )
				.sum();
	}
	
	public static long countEvenNumbersLongResult(Collection<? extends Number> coll) {
		return coll.stream()
				.map( x -> x.doubleValue() )
				.filter( x -> x%2 == 0 ? true : false )
				.count();
	}
	
	public static long countEvenNumbersWithoutDecimal(Collection<? extends Number> coll) {
		return coll.stream()
				.filter( x -> x.getClass().getSimpleName().contains("Float") ? false : true )
				.filter( x -> x.getClass().getSimpleName().contains("Double") ? false : true )
				.filter( x -> x.getClass().getSimpleName().contains("Decimal") ? false : true )
				.mapToLong( x -> x.longValue() )
				.filter( x -> x%2 == 0 ? true : false )
				.count();
	}

	// 4.
	public static <T> void replaceElementAtPosition (List<? super T> list1, List<? extends T> list2, int index) {
		if( list1.size() <= index || list2.size() <= index || index < 0)
			throw new IndexOutOfBoundsException("There are no elements at position " + index + " in both lists");
		
		list1.set(index, list2.get(index) );
//		Error
//		The method set(int, capture#6-of ? extends T) in the type List<capture#6-of ? extends T> is not applicable for the arguments (int, capture#7-of ? super T)
//		list2.set(index, list1.get(index) );
	}
	
	// 5.
	public static <T> void switchElementsAtPosition (List<T> list1, List<T> list2, int index) {
		if( list1.size() <= index || list2.size() <= index || index < 0)
			throw new IndexOutOfBoundsException("There are no elements at position " + index + " in both lists");
		
		T tmp = list1.get(index);
		list1.set(index, list2.get(index) );
		list2.set(index, tmp);
	}
	
	// 6. I can't do it more generally than in JDK. Only downcast from Collection to List according to task
	//    but I can explain every bound
	public static <T extends Comparable<? super T>> T maxInList(List<? extends T> list) {
		return Collections.max(list);
	}
	public static <T> T maxInList(List<? extends T> list, Comparator<? super T> comp) {
		return Collections.max(list, comp);
	}
	
	
	public static void main(String[] args) {

		// 3. test
		System.out.println("--- 3 TEST ---");
		System.out.println(" countEvenNumbers " + countEvenNumbers(TEST_NUMBER_ODD_LIST) + " in " + TEST_NUMBER_ODD_LIST);
		System.out.println(" countEvenNumbers " + countEvenNumbers(TEST_NUMBER_LIST) + " in " + TEST_NUMBER_LIST);
		System.out.println(" countEvenNumbers " + countEvenNumbers(TEST_INTEGER_LIST) + " in " + TEST_INTEGER_LIST);
		System.out.println(" countEvenNumbers " + countEvenNumbers(TEST_FLOAT_LIST) + " in " + TEST_FLOAT_LIST);
//		Error
//		The method countEvenNumbers(Collection<? extends Number>) in the type ContainerUtility is not applicable for the arguments (List<String>)
//		countEvenNumbers(TEST_STRING_LIST1);
		System.out.println(" countEvenNumbersLongResult " + countEvenNumbersLongResult(TEST_NUMBER_ODD_LIST) + " in " + TEST_NUMBER_ODD_LIST);
		System.out.println(" countEvenNumbersLongResult " + countEvenNumbersLongResult(TEST_NUMBER_LIST) + " in " + TEST_NUMBER_LIST);
		System.out.println(" countEvenNumbersLongResult " + countEvenNumbersLongResult(TEST_INTEGER_LIST) + " in " + TEST_INTEGER_LIST);
		System.out.println(" countEvenNumbersLongResult " + countEvenNumbersLongResult(TEST_FLOAT_LIST) + " in " + TEST_FLOAT_LIST);
		System.out.println(" countEvenNumbersWithoutDecimal " + countEvenNumbersWithoutDecimal(TEST_NUMBER_ODD_LIST) + " in " + TEST_NUMBER_ODD_LIST);
		System.out.println(" countEvenNumbersWithoutDecimal " + countEvenNumbersWithoutDecimal(TEST_NUMBER_LIST) + " in " + TEST_NUMBER_LIST);
		System.out.println(" countEvenNumbersWithoutDecimal " + countEvenNumbersWithoutDecimal(TEST_INTEGER_LIST) + " in " + TEST_INTEGER_LIST);
		System.out.println(" countEvenNumbersWithoutDecimal " + countEvenNumbersWithoutDecimal(TEST_FLOAT_LIST) + " in " + TEST_FLOAT_LIST);
		
		// 4. test
		System.out.println("--- 4 TEST ---");
		System.out.println(" TEST_STRING_LIST1 " + TEST_STRING_LIST1);
		System.out.println(" TEST_STRING_LIST2 " + TEST_STRING_LIST2);
		replaceElementAtPosition(TEST_STRING_LIST1, TEST_STRING_LIST2, INDEX0);
		System.out.println(" replaceElementAtPosition " + INDEX0);
		System.out.println(" TEST_STRING_LIST1 " + TEST_STRING_LIST1);
		System.out.println(" TEST_STRING_LIST2 " + TEST_STRING_LIST2);

		// 5. test
		System.out.println("--- 5 TEST ---");
		System.out.println(" TEST_STRING_LIST1 " + TEST_STRING_LIST1);
		System.out.println(" TEST_STRING_LIST2 " + TEST_STRING_LIST2);
		switchElementsAtPosition(TEST_STRING_LIST1, TEST_STRING_LIST2, INDEX1);
		System.out.println(" switchElementsAtPosition " + INDEX1);
		System.out.println(" TEST_STRING_LIST1 " + TEST_STRING_LIST1);
		System.out.println(" TEST_STRING_LIST2 " + TEST_STRING_LIST2);
		switchElementsAtPosition(TEST_STRING_LIST1, TEST_STRING_LIST2, INDEX2);
		System.out.println(" switchElementsAtPosition " + INDEX2);
		System.out.println(" TEST_STRING_LIST1 " + TEST_STRING_LIST1);
		System.out.println(" TEST_STRING_LIST2 " + TEST_STRING_LIST2);
		try {
			switchElementsAtPosition(TEST_STRING_LIST1, TEST_STRING_LIST2, BAD_INDEX1);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			switchElementsAtPosition(TEST_STRING_LIST1, TEST_STRING_LIST2, BAD_INDEX2);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
//		Error
//		The method switchElementsAtPosition(List<T>, List<T>, int) in the type ContainerUtility is not applicable for the arguments (List<String>, List<Integer>, int)
//		switchElementsAtPosition(TEST_STRING_LIST1, TEST_INTEGER_LIST, INDEX2);
//		The method switchElementsAtPosition(List<T>, List<T>, int) in the type ContainerUtility is not applicable for the arguments (List<Float>, List<Integer>, int)
//		switchElementsAtPosition(TEST_FLOAT_LIST, TEST_INTEGER_LIST, INDEX2);

		// 6. test
		System.out.println("--- 6 TEST ---");
		System.out.println(" maxInList " + maxInList(TEST_FLOAT_LIST) + " in " + TEST_FLOAT_LIST);
		System.out.println(" maxInList with natural comparator " + maxInList(TEST_FLOAT_LIST, Comparator.naturalOrder() ) + " in " + TEST_FLOAT_LIST);
		System.out.println(" maxInList with reverse comparator " + maxInList(TEST_FLOAT_LIST, Comparator.reverseOrder() ) + " in " + TEST_FLOAT_LIST);
		System.out.println(" maxInList with own comparator " + maxInList(TEST_FLOAT_LIST, (x,y) -> (int)(y-x) ) + " in " + TEST_FLOAT_LIST);
		System.out.println(" maxInList with own comparator " + maxInList(TEST_STRING_LIST1, (x,y) -> x.charAt(1)-y.charAt(1) ) + " in " + TEST_STRING_LIST1);
		System.out.println(" maxInList with own comparator " + maxInList(TEST_STRING_LIST2, (x,y) -> y.charAt(1)-x.charAt(1) ) + " in " + TEST_STRING_LIST2);
		
		
		// 1,2 test
		System.out.println("--- 1,2 TEST ---");

//		Error
//		Cannot infer type arguments for ContainerAny<>
//		ContainerAny<String> containerAnyString0 = new ContainerAny<>(NUMBER_INTEGER_BAD);
		ContainerAny<String> containerAnyString1 = new ContainerAny<>(TEST_STRING);
		ContainerAny<String> containerAnyString2 = new ContainerAny<>();
		containerAnyString2.setElement(TEST_STRING);
//		Error
//		The method setElement(String) in the type ContainerAny<String> is not applicable for the arguments (Integer)
//		containerAnyString2.setElement(NUMBER_INTEGER_BAD);
		ContainerAny<Number> containerAnyNumber1 = new ContainerAny<>();
		containerAnyNumber1.setElement(NUMBER_INTEGER);
		ContainerAny<Number> containerAnyNumber2 = new ContainerAny<>(NUMBER_INTEGER_BAD);
		containerAnyNumber2.setElement(NUMBER_LONG);
//		Error
//		The method setElement(Number) in the type ContainerAny<Number> is not applicable for the arguments (String)
//		containerAnyNumber2.setElement(TEST_STRING);
		ContainerAny<Long> containerAnyLong1 = new ContainerAny<>(NUMBER_LONG);
//		Error
//		The method setElement(Long) in the type ContainerAny<Long> is not applicable for the arguments (Integer)
//		containerAnyLong1.setElement(NUMBER_INTEGER);

//		Error
//		Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type ContainerNumber<T>
//		ContainerNumber<String> containerNumber0 = new ContainerNumber<>(TEST_STRING);
		ContainerNumber<Number> containerNumber1 = new ContainerNumber<>(NUMBER_INTEGER_BAD);
		containerNumber1.setNumber(NUMBER_LONG);
		ContainerNumber<Integer> containerNumber2 = new ContainerNumber<>(NUMBER_INTEGER);
//		Error
//		The method setNumber(Integer) in the type ContainerNumber<Integer> is not applicable for the arguments (Long)
//		containerNumber2.setNumber(NUMBER_LONG);
//		Error
//		The method setNumber(Integer) in the type ContainerNumber<Integer> is not applicable for the arguments (String)
//		containerNumber2.setNumber(TEST_STRING);

//		Error
//		Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type ContainerNumberExtAny<T>
//		ContainerNumberExtAny<String> containerNumberExtAny0 = new ContainerNumberExtAny<>(TEST_STRING);
		ContainerNumberExtAny<Number> containerNumberExtAny1 = new ContainerNumberExtAny<>(NUMBER_LONG);
		ContainerNumberExtAny<Integer> containerNumberExtAny2 = new ContainerNumberExtAny<>(NUMBER_INTEGER);
//		Error
//		The method setElement(Integer) in the type ContainerAny<Integer> is not applicable for the arguments (Long)
//		containerNumberExtAny2.setElement(NUMBER_LONG);
		
		System.out.println(containerAnyString1.getElement());
		System.out.println(containerAnyNumber1.getElement());
		System.out.println(containerAnyNumber2.getElement());
		System.out.println(containerAnyLong1.getElement());
		System.out.println(containerNumber1.getNumber());
		System.out.println(containerNumber2.getNumber());
		System.out.println(containerNumberExtAny1.getElement());
		System.out.println(containerNumberExtAny2.getElement());
		System.out.println(containerAnyString2.getElement());
	}

}
