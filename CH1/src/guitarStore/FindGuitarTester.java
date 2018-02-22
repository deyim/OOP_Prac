package guitarStore;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, wood.Alder);
		
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null) {
			System.out.println("Erin, you might like this" + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType()+ " "
					+ guitar.getBackWood() + " back and sides, \n " + guitar.getTopWood() + "top.\nYou can have it only for"
							+ "$" + guitar.getPrice() + "!" );
		}else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, wood.Alder);
		inventory.addGuitar("fege", 17724.0, "geer", "wwtte", "aags", "gddf", "ssfdg");
		inventory.addGuitar("qr22", 1204.0, "erwe", "wwtte", "aags", "gddf", "ssfdg");
		inventory.addGuitar("asfsd", 1344.0, "wwre", "wwtte", "aags", "gddf", "ssfdg");
		inventory.addGuitar("V93493", 1244.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
	}
}
