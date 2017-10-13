package testMaven.com.qian.util.json;

public class JsonProcessorWrapper<T> {
	
	public JsonProcessorWrapper() {
		super();
	}
	
	public JsonProcessorWrapper(Class<?> targetClass, T processor) {
		this.targetClass = targetClass;
		this.processor = processor;
	}
	
	public JsonProcessorWrapper(Class<?> targetClass, T processor, Class<?> targetPropertyType) {
		this(targetClass, processor);
		this.targetPropertyType = targetPropertyType;
	}
	
	private Class<?> targetClass;
	
	private T processor;
	
	private Class<?> targetPropertyType;

	public Class<?> getTargetPropertyType() {
		return targetPropertyType;
	}

	public void setTargetPropertyType(Class<?> targetPropertyType) {
		this.targetPropertyType = targetPropertyType;
	}

	public Class<?> getTargetClass() {
		return targetClass;
	}

	public void setTargetClass(Class<?> targetClass) {
		this.targetClass = targetClass;
	}

	public T getProcessor() {
		return processor;
	}

	public void setProcessor(T processor) {
		this.processor = processor;
	}

}
