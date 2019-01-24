/**
 * 
 */
package polymorphism;

/**
 * @author hemanth
 *
 */
public class NonFiction extends Book{
	
	/**
	 * 
	 */

	public NonFiction(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
		this.setPrice(price);
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

}
