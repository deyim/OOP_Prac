package guitarStore;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec spec)
	{
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}		
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
			
			Guitar guitar = (Guitar)i.next();
			GuitarSpec spec = guitar.getSpec();
			
			if(searchSpec.getBuilder() != spec.getBuilder())
					continue;
			String model = searchSpec.getModel().toLowerCase();
			if((model != null) && (!model.equals("")) && (!model.equals(spec.getModel().toLowerCase())))
					continue;
			if(searchSpec.getType() != spec.getType())
					continue;
			if(searchSpec.getBackWood() != spec.getBackWood())
					continue;
			if(searchSpec.getTopWood() != spec.getTopWood())
					continue;
			
			matchingGuitars.add(guitar);
			
		}
		return matchingGuitars;
	}

}
