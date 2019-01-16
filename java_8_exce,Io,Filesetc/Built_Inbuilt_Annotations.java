/**
 * 
 */
package test;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * @author hemanth
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface hems{
	int value();
}

class Test{
	@hems(value = 89)
	public void exec() {
		System.out.println("hello");
	}
}

public class Built_Inbuilt_Annotations {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Test tst = new Test();
		Method m = tst.getClass().getMethod("exec");
		
		hems hs = m.getAnnotation(hems.class);
		System.out.println(hs.value());
	}

}
