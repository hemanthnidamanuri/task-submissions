/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */

public class Hierarchical_Iheritance extends Distance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchical_Iheritance ihe = new Hierarchical_Iheritance();
		Slope  slop = new Slope();
		slop._slope_formule_calculation();
		MidPoint mp = new MidPoint();
		mp._midpoint_formule_calculation();
		ihe._distance_formule_calculation();
		
	}

}
