/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
public class MidPoint extends CoordinatiGeometry {

		void _midpoint_formule_calculation() {
			System.out.println("Enter midpoint formulae values");
			x1 = in.nextInt();
			x2 = in.nextInt();
			y1 = in.nextInt();
			y2 = in.nextInt();
			
			System.out.println("Midpoint  = ("+(x1+x2/2)+","+(y1+y2/2) + ")");
		}
}
