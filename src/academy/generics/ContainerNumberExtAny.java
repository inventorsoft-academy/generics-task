package academy.generics;

public class ContainerNumberExtAny<T extends Number> extends ContainerAny<T> {

	public ContainerNumberExtAny() {
	}

	public ContainerNumberExtAny(T element) {
		super(element);
	}

}
