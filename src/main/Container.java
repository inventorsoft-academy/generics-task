package main;

public class Container<T> {
    private T item;
    private String label;

    public Container(T item, String label) {
        this.item = item;
        this.label = label;
    }

    public T getItem() {
        return item;
    }

    public String getLabel() {
        return label;
    }
}
