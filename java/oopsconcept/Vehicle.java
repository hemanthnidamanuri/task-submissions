/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
public interface Vehicle {
	
	public void steering(String steer_version,String type);
	
	public void tyres(String type,String model);
	
	public void handle(String type,String design);
	
	public void company(String name);
	
	default void energy(String type) {
		
	}
}
