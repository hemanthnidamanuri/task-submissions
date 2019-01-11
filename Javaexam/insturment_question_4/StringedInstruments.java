/**
 * 
 */
package java_exam;



/**
 * @author hemanth
 * 
 * .Create an abstract class, called Instrument which has a property of 
 * name and an abstract method play. Now define a sub-class called 
 * StringedInstrument(abstract class) of parent class Instrument class and adds 
 * an extra field called numberOfStrings. Add two more classes that implement 
 * the functionality of a StringedIntrument, called ElectricGuitar and ElectricBassGuitar accordingly. 
 * Finally, create a new class called Execution that contains a single main method
 *
 */

 abstract class Instruement {

	String name;
	
	abstract void play();
 }
 
 
public abstract class StringedInstruments extends Instruement {
	String numberOfStrings;
}

class ElectricGuitar extends StringedInstruments {

	@Override
	void play() {
		// TODO Auto-generated method stub
		name = "classirock_electricguitar";
		numberOfStrings = "5";
		System.out.println("playing electricGuitar");
	}
	
}

class ElectricBassGuitar extends StringedInstruments{

	@Override
	void play() {
		// TODO Auto-generated method stub
		name  = "rocknroll_electricbassguitar";
		numberOfStrings = "10";
		System.out.println("playing ElectricBassGuitar");
	}
	
}