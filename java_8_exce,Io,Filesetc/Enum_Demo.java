/**
 * 
 */
package test;

/**
 * @author hemanth
 *
 */
public class Enum_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directions direction = Directions.EAST;
		if (direction == Directions.EAST) {
			System.out.println("your at east direction");
		}else if(direction == Directions.WEST) {
			System.out.println("your at west direction");
		}else if(direction == Directions.SOUTH) {
			System.out.println("your at south direction");
		}else if(direction == Directions.NORTH) {
			System.out.println("your at north direction");
		}else {
			System.out.println("unknown direction:");
		}
	}
}
