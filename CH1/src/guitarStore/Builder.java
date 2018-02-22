package guitarStore;

public enum Builder{

	FENDER, MARTIN, GIBSON;

	public String toString(){
		swith(this){
			case FENDER: return "Fender";
			case MARTIN: return "Martin";
			case GIBSON: return "Gibson";
		}
	}
}