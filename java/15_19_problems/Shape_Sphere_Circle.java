/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * write a program to execute follow instructions.
 * --> Create an interface 'shape' with PI value = 3.14159
 * 	   and a method 'volume(float a)'
 * --> Implement this interface individually in 'sphere' and 
 *     'circle'  classes to find thier.
 *
 */

	// Declaring a interface shape
public interface Shape_Sphere_Circle {
	
	//declaring a pi value as final.
	public static final float pi = 3.14159f;
	
	//abstrct method for calculateing the volume.
	public void volume(float pi);
}
