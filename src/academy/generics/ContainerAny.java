package academy.generics;

public class ContainerAny<T> {
	
	private T element;

	public ContainerAny() {
	}

	public ContainerAny(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}
