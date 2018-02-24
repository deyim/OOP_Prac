package guitarStore;

public class GuitarSpec {
	
	private int numStrings;
	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numString;
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
	
	public int getNumStrings() {
	    return numStrings;
	  }
	
	public boolean matches(GuitarSpec otherSpec) {
		 if (builder != otherSpec.builder)
		      return false;
		    if ((model != null) && (!model.equals("")) &&
		        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
		      return false;
		    if (type != otherSpec.type)
		      return false;
		    if (numStrings != otherSpec.numStrings)
		      return false;
		    if (backWood != otherSpec.backWood)
		      return false;
		    if (topWood != otherSpec.topWood)
		      return false;
		    return true;
	}
	
	
	
	
}
