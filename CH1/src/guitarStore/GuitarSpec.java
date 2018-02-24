package guitarStore;

public class GuitarSpec {
	
	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, int StringNum, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}	
	
	public Type getType() {
		return type;
	}
	
	public String getModel() {
		return model;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
}
