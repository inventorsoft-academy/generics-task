package test;

public class SingleNumberContainer <T extends Number> {

    private T singleNumber;

    public SingleNumberContainer(T singleNumber) {
        this.singleNumber = singleNumber;
    }

    public T getSingleNumber() {
        return singleNumber;
    }

    public void setSingleNumber(T singleNumber) {
        this.singleNumber = singleNumber;
    }

    public void showFoo() {
        System.out.println(getSingleNumber());
    }
}


