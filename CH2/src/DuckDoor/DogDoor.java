package DuckDoor;

public class DogDoor {
	private boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	
	public void open() {
		System.out.println("Open the door");
		open = true;
	}
	
	public void close() {
		System.out.println("Close the door");
		open = false;
	}
	
	public boolean isOpen() {
		if(open)
			return true;
		else
			return false;
	}
	
}
