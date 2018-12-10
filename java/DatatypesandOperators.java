/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
public class DatatypesandOperators {

	/**
	 * @param args
	 */
	
	public void bytechecking() {
		byte a = 127;
		System.out.println(a);	
	}
	public void shortrange() {
		// TODO Auto-generated method stub
		short b = 32767;	
	    System.out.println((int)b);
	}
	public void intrange() {
		int c = 2147483647;
		System.out.println(c);
	}
	public void longrange() {
		long l = 92235807l;
		System.out.println((int)l);
	}
	private void floatrange() {
		// TODO Auto-generated method stub
		double f = 1.1+1.1;
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatatypesandOperators dop = new DatatypesandOperators();
		dop.bytechecking();
		dop.shortrange();
		dop.intrange();
		dop.longrange();
		dop.floatrange();
	}
}
