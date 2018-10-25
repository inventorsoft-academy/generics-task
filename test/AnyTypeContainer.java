package test;

import java.util.List;

public class AnyTypeContainer <T> {

    private List<T> container = null;

    public AnyTypeContainer(List<T> container) {
        this.container = container;
    }

    public void showFooContainer() {
        for (T elem : container) {
            System.out.println(elem);
            };
        }


    public List<T> getContainer() {
        return container;
    }

    public void setContainer(List<T> container) {
        this.container = container;
    }

    public T getElemByIndex(int index) {
        T elem = container.get(index);
        return elem;
    }


}
