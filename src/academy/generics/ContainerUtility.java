package academy.generics;

public class ContainerUtility {

	private static final String TEST_STRING = "WBR for Roma & inventorsoft";
	private static final Long NUMBER_LONG = Long.valueOf(777L);
	private static final Integer NUMBER_INTEGER = Integer.valueOf(555);
	private static final Integer NUMBER_INTEGER_BAD = Integer.valueOf(666);
	
	public static void main(String[] args) {
		
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
