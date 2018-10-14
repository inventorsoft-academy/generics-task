/*
* Task:
* Create class-container for any types;
*/
class AnyTypeContainer<T> {
    private T data;

    AnyTypeContainer(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}