/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
class Plants {
	
	public String oxygen() {
		String _oxygen = null;
		return _oxygen;
		
	}
	
	public void _carbondioxide(String carbondioxide) {
		System.out.println("taking carbondioxde"+carbondioxide);
	}
}

class NeemTree extends Plants{
	
	public String oxygen(String _oxygen) {
		return _oxygen;
	}
	
	public void _carbondioxide(String carbondioxide) {
		System.out.println("accepting carbondioxide"+carbondioxide);
	}
}

class SunFlowerPlant extends Plants{
	
	public String oxygen(String _oxygen) {
		return _oxygen;
	}
	
	public void _carbondioxide(String carbondioxide) {
		System.out.println("accepting carbondioxide"+carbondioxide);
	}
	
}

class RosePlant extends Plants{
	
	public String oxygen(String _oxygen) {
		return _oxygen;
	}
	
	public void _carbondioxide(String carbondioxide) {
		System.out.println("accepting carbondioxide"+carbondioxide);
	}
	
}

public class Plant{
	public static void main(String[] args) {
		
		String _oxygen = "oxygen";
		String carbondioxide = "carbondioxide";
		
		
		NeemTree nt = new NeemTree();
		nt.oxygen();
		nt._carbondioxide(carbondioxide);
		
		SunFlowerPlant sfp = new SunFlowerPlant();
		sfp._carbondioxide(carbondioxide);
		sfp.oxygen(_oxygen );
		
		RosePlant rp = new RosePlant();
		rp._carbondioxide(carbondioxide);
		rp.oxygen(_oxygen);
		
	}
}