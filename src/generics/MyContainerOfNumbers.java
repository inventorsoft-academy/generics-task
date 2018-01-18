package generics;



/**
 * Created by Komatoz on 17.01.2018.
 */
public  class MyContainerOfNumbers<T extends Number> {
    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    private T num;


}
