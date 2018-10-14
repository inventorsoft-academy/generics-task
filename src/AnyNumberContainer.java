/*
* Task:
* Create class-container for numbers;
*/
class AnyNumberContainer <T extends Number> {
    private T data;

    AnyNumberContainer (T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}