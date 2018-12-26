/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
public class Slope extends CoordinatiGeometry {
	
		void _slope_formule_calculation() {
			System.out.println("Enter slope details");
			x1 = in.nextInt();
			x2 = in.nextInt();
			y1 = in.nextInt();
			y2 = in.nextInt();
			double _slope = 0.0;
			if (x2!=x1) {
				_slope = y2-y1/x2-x1;
			}
			System.out.println(_slope);
		}
}
