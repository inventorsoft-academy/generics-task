/**
 * Create class-container for any types;
 * @param <T> any type
 */
public class ContainerForAnyTypes<T> {
	private T something;

	public T getSomething(){
		return something;
	}

	public void setSomething(T some){
		something = some;
	}
}
