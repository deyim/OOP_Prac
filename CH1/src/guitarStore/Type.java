package guitarStore;

public enum Type{

	ACOUSTIC, ELECTRIC;

	public String toString(){
		swith(this){
			case ACOUSTIC: return "acoustic";
		}
	}
}