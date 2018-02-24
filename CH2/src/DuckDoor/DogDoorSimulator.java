package DuckDoor;

public class DogDoorSimulator {	
		
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Fido starts barking..");
		System.out.println("\nGina grabs the remote control..");
		remote.pressButton();
		System.out.println("\nFido has gone outside");
		System.out.println("\nFido's all done");
		
		try {
			Thread.currentThread().sleep(10000);
			System.out.println("\nthread sleeping\n");
		}catch(InterruptedException e) {	}
		
		System.out.println("...but he's stuck outside!");
	    System.out.println("\nFido starts barking...");
	    System.out.println("...so Gina grabs the remote control.");
	    remote.pressButton();
        System.out.println("\nFido's back inside");
        
		
		
	}
}
