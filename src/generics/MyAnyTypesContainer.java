package generics;

/**
 * Created by Komatoz on 17.01.2018.
 */
public class MyAnyTypesContainer<T> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
