package generics;



/**
 * Created by Komatoz on 17.01.2018.
 */
public  class MyContainerOfNumbers<T extends Number> {
    private T listofNumbers;

    public T getListofNumbers() {
        return listofNumbers;
    }
}
