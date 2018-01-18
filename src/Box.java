public class Box <T> {

    private T thing;
    private String tool;

    public Box(T thing, String tool) {
        this.thing = thing;
        this.tool = tool;
    }

    public T getThing() {
        return thing;
    }

    public String getTool() {
        return tool;
    }
}
