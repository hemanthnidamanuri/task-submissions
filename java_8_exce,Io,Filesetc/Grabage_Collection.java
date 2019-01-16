/**
 * 
 */
package test;

/**
 * @author hemanth
 *
 */
public class Grabage_Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grabage_Collection gc = new Grabage_Collection();
		Grabage_Collection cg = new Grabage_Collection();
		gc=cg;
		System.out.println(gc+"..."+cg);
		System.gc();
	}

}
