/**
 * 
 */
package polymorphism;

/**
 * @author hemanth
 *
 *
 *3. Polymorphism:- 

Create an abstract class called Book. Include a String field for the book's title and 
a double field for the book's price. Within the class, include a constructor that requires
 the book title and two get methods: one that returns the title and one that returns 
 the price. Also include an abstract method named setPrice(). Create two child classes of Book: 
 Fiction and NonFiction. Within the constructors for the Fiction and NonFiction classes, 
 call setPrice so all Fiction Books cost $24.99 and all Non Fiction Books cost $37.99. 
 A main class Challenge creates an arraylist of Book variables to store references to 
 objects of each concrete class. For each book, display the string representation as shown below.

input:-
Title of fiction book:
Harry Potter
Title of non fiction book:
Calculus

output:-
Title-Harry Potter Cost-$24.99
Title-Calculus Cost-$37.99
 */
public abstract class Book {

	/**
	 * 
	 */
	
	String title;
	double price;
	
	public Book(String title,double price) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	 public String getTitle() {
		return title;
	}
	 
	 public abstract void setPrice(double price);

}
