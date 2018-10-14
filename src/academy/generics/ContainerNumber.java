package academy.generics;

public class ContainerNumber<T extends Number> {
	
	private T number;

	public ContainerNumber() {
	}

	public ContainerNumber(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

}
