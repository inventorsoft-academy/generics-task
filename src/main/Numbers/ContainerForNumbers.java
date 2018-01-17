package main.Numbers;

//class-container for numbers
public class ContainerForNumbers<T extends Number> {
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
