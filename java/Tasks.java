package java_prac;


public class Tasks {
	
	public void exe_1() {
		//POST-INCREMENT OPERATION PROGRAM
		/* x value will be incremented with one value, its a post increment operation it initialize
		 *  variable first and increment with one*/
		//Declared a variable x as 10 for post increment operation
		int x = 10;
		x++;
//		System.out.println(x);
		//output of this program is one 
	}
	
	public void exe_2() {
		/*equal assignment operation first initialize
		 *  three Integer variables with value later
		 *  assign variable with another check the operation*/
		//Declared and initialize variables with values
		int a = 10,b=20,c=30;
		b=a;
		c=b;
//		System.out.println(c);
//		int a=b=c=10;
//		System.out.println(c);
//		int a,b,c;
		a=b=c=10;
//		System.out.println(c);
		
	}
	
	private void exe_3() {
		// TODO Auto-generated method stub
		//Intializing a character a
		char ch = 'a';
		//incrementing a character
		ch++;
//		System.out.println(ch);
		/* output of this program will be  = b
		 * because its use character alphabet values its
		 * will print next alphabet automatically.
		 * its increment of character will be next alphabet
		 */
	}
	
	public void exe_4() {
		//intializing a value double of10.5 
		double d = 10.5;
		d++;// incrementing a double with one its add 1 to 10.5
//		System.out.println(d);// output = 11.5
		/*double value will be incremented with one 
		 * it will become 11.5
		 */
	}
	
	public void exe_5() {
		//declaring a boolean flag with true
		boolean b = true;
		b++;//trying to increment a boolean
		
		/*it will throw java.lang.Error :unresolved compilation
		 * error. type mismatch : cannot convert from boolean
		 * int.because boolean is datatype with  1 bit it will 
		 * have only true either false we cannot perform any arthematic operation.
		 * it will used for true or false codition.
		 */
	}
	
	public void exe_6() {
		//intiallizing a byte with value 20
		byte b = 20;
		/*duplicate a local varaiable b and type mismatch
		 * cannot convert fron int to b
		 */
		byte b = b+1;
		/*duplicate  local variable b
		 * but mismatch error will be solved
		 */
		byte b = (byte) (b+1);
		System.out.println(b);
		/*two type of complition errors will be seen here 
		 * first one is duplicate local variable there must
		 * be no declaring varauable that alredy declared.
		 * second one is typemismatch from into to byte beacuse
		 * intially in integer datatypes its intially all declared as int 
		 * if u perfrom any increment arthematic operations it will show error
		 * we have to exploicit cast of byte it will tell to java to ignore 
		 * bits that wont fit, theyv will be cut even if it changes the value of a number.
		 */
	}
	
	public void exe_7() {
		//intializing two byte variables 
		byte a = 10;
		byte b = 20;
		/*adding two byte varaibles to byte c 
		 * it will show typemismatch cast error tells
		 * us to explixit cast to byte
		 */
		byte c = a+b;
		/*adding two byte varaibls with explixit cast ,
		 * but complier will show duplicate local c variable.
		 */
		byte c = (byte)(a+b);
//		System.out.println(c);
		/*duplate local variable c and cast error of type converison
		 * we have to explicity cast the byte to resolve the issue.
		 */
	}
	
	public void exe_8() {
		//divideing a value with zero and printing the output
		System.out.println(10/0);
		System.out.println(10/0.0);
		/*java complier throw java.lang.Arithmeticexception
		 * value cannot be divide with zero in both cases.
		 */
	}
	
	public void exe_9() {
		System.out.println('a'+'b'); // output = 195
		System.out.println('a'+1); // output  = 98
		System.out.println('a'+1.2);  //output = 98.2
		/* IN first println statement we are adding two character a and b 
		 * it will add its ascii values, ascii value of a  = 097 and b = 098
		 * ...in second println statement it woll print ascii value of = 97 +1
		 * its gives output of 98
		 * in third println statement it will add asscii value of a with  1.2
		 * gives output 98.2 
		 */
	}
	
	public void exe_10() {
		//intiliazing string ashok
		String a = "ashok";
		//intialinzing three int varaible with values.
		int b=10,c=20,d=30;
		/*adding all three int values and trying to assign in string varaible
		 */
		a = b+c+d;
		//adding all int values and assigning in a int varaiable
		a = a+b+c;
		/*adding a string varaible with int values. it show cast error 
		 * cannot convert from string to int
		 */
		b = a+c+d;
		/*in first co[pliation error we cant store it in int beacuse string is immuatble it cannothanhge
		 * as well as we assiging int to string instead on concatinating
		 * in second compilation error tha string will concatinate with int values but 
		 * it cant store in a a int its cast error.
		 */

	}
	
	public void exe_11() {
		System.out.println(10<10.5);//output = true
		System.out.println('a'>100.5);//output = false
		System.out.println('b'>'a');//output = true
		System.out.println(true>false);//compilation error 
		/* in first three print statements it operation works suceswsfully output
		 * will five true or false for condition case
		 * but in third scenario > operator cannot done on true or false 
		 * it cant determin the value and throw and compliation error.
		 */
	}
	
	public void exe_12() {
		//all four print statements are condition based.
		System.out.println(10 == 20);//output  = false
		System.out.println('a' == 'b');//output = false
		System.out.println('a' == 97.0);//output = true
		System.out.println(false==false);//output true
		/* In first print statement condition failes beacuse 10
		 * is not equal to 20.
		 * In second print condition failes because a  is not euqal to b
		 * in third print statement the condition will be true beacuse the asscci
		 * value of a  is 97 97==97.0 the condition is true.
		 * in final fourth print condition statement we campring 
		 * false with false it true bot values atre same.
		 */
	}
	
	public void exe_13() {
		//instanciated thread object t1
		Thread t1 = new Thread();
		//instancuated another thread object t2
		Thread t2 = new Thread();
		Thread t3 = t1; // assigning t1 object to newly created thread varaible t3
		System.out.println(t3); // output = Thread[Thread-0,5,main]
		System.out.println(t1);// output = Thread[Thread-0,5,main]
		System.out.println(t2);// output = Thread[Thread-1,5,main]
		System.out.println(t1==t2);//comparing t1 object with t2 gives flase
		System.out.println(t1==t3);//comparing the t1 with t3 gives true 
		/* we created two sepreated thred objects t1 and t2 both will have seperated thred values 
		 * if we compare it will give false,but in third we jaust instancited thread we assign the t1 
		 * value to the t3 vraiable if we compare both  have same value condition staisfied and it will
		 * print true.
		 */
	}
	
	public void exe_14() {
		System.out.println(true&false); // output  = false
		System.out.println(true|false); // output  = true
		System.out.println(true^false); // output = true
		/*in first we performed a bitwise and on and gate table 1 & 0 = false
		 * in or gate table 1 | 0 or true | false  = true 
		 * in third bitwise xor or in xor gate  1 ^ 0 = true.
		 */
	}
	
	public void exe_15() {
		System.out.println(4&5); // output  = 4
		System.out.println(4|5); // output = 5
		System.out.println(4^5); // output  = 1
		/* binaruy value of  4 = 0100
		 * binary value  of 5  = 0101
		 *       bitwise and (&)=
		 * ------------------------------
		 *                       0100 = 4
		 * -------------------------------
		 * binaruy value of  4 = 0100
		 * binary value  of 5  = 0101
		 *       bitwise or (|)=
		 * ------------------------------
		 *                       0101 = 5
		 * -------------------------------
		 * binaruy value of  4 = 0100
		 * binary value  of 5  = 0101
		 *       bitwise xor (&)=
		 * ------------------------------
		 *                       0001 = 1
		 * -------------------------------
		 */               
	}
	
	public void exe_16() {
		System.out.println(~true); // compilation error
		System.out.println(~4); // output = -5
		/*it will given java.lang.Error negation operators
		 * is undefined for boolean types
		 * for second print statement it will give -5 negation will applied.
		 */
	}
	
	public void exe_17() {
		System.out.println(!false); // output  = true
		System.out.println(!4); //copilation error
		/*in first statement not operator will sucessfully apply on boolean case
		 * where as it cant apply to integer , it shows ! operator undefined for type
		 * int
		 */
	}
	
	public void exe_18() {
		int x = 10, y = 15;
		if (++x < 10 || ++y > 15) {
			x++;
		} else {
			y++;

		}
		System.out.println(x+"----"+y); // output (12,16)
		int x = 'a';//compilation error 
		System.out.println(x); // output  = 12
		/* In if condition we have do a logical or operation in this case
		 * either one of the statements must be true.
		 * in if +++x = 11 < 10 condition failes another side ++y  = 16 > 15 
		 * condition true, it will enter into if condition perform 
		 * increment operation on x giving final value 12
		 * and y  = 16
		 * compilation errors is creating a local duplicate varaiable.
		 */
	}
	
	public void exe_18A() {
		int x = 10, y = 15;
		if (++x < 10 && ++y > 15) {
			x++;
		} else {
			System.out.println("ok");
			y++;

		}
		System.out.println(x+"----"+y); // output (11,16)
//		int x = 'a';//compilation error 
		System.out.println(x); // output   = 11
		/* In if condition we have do a logical and operation in this case
		 * both  of the statements must be true.
		 * in if +++x = 11 < 10 condition failes another side ++y  = 16 > 15 
		 * condition true, but it doenst enter into if condition it will execute else 
		 * sytatement
		 * compilation errors is creating a local duplicate varaiable.
		 */
	}
	
	public void exe_18B() {
		int x = 10, y = 15;
		if (++x < 10 & ++y > 15) {
			x++;
		} else {
			System.out.println("ok");
			y++;

		}
		System.out.println(x+"----"+y); // output (11,17)
//		int x = 'a';//compilation error 
		System.out.println(x); // output  = 11
		/* Bitwise and in if condition it will take the 
		 * boolean values in if condition and operates
		 * bitwise and operation in above it has true and false 
		 * it give flase so else state executed.
		 */
	}
	
	public void exe_18C() {
		int x = 10, y = 15;
		if (++x < 10 | ++y > 15) {
			x++;
		} else {
			System.out.println("ok");
			y++;

		}
		
		System.out.println(x+"----"+y); // output (12,16)
//		int x = 'a';//compilation error 
		System.out.println(x); // output  = 11
		/*bitwise or operatori in above if condition 
		 * it will take resultant boolean values and on them
		 * bitwise or operation swil perform true and false in or 
		 */
	}
	
	public void exe_19() {
		int x = 130;//intialinzing a integer varaible 
		byte b = (byte) x; //explicit type casting int to byte
		System.out.println(b); //output  = -126
		/* byte memory has range o f -128 to 127 but int value 130 when we typecaste 
		 * it it will cut of the memory and print the bits.
		 */
	}
	
	public void exe_20() {
		int x = 150;
		short s = (short)x;
		byte b = (byte) x;
		System.out.println(s); // output = 150
		System.out.println(b); // output = -106
		/*short ranges for -32,768 to 32,767, the int x value is 150 
		 * is with in range of shorand by explicity castying short error and with
		 * in range it will print as same
		 * but comming to byte casting it  int value is exceeds the byte range 
		 * so by explicitly typecasting it will reduce the memory seize and
		 * value inside will change by bit mani
		 */
	}
	
	public void exe_21() {
		double d = 130.456;
		int x = (int) d;
		System.out.println(x);//output  = 130
		byte b = (byte) d;
		System.out.println(b); //output = -126
		/*when we type caste a double to int it will remove decimal values
		 * and it will print.
		 * in byte scenarion it same but exceeding memory rangeit will give a another value.
		 */
	}
	
	public void exe_22() {
		int x = (10>20) ? 30:((40>50)?60:70);
		System.out.println(x); // output  = 70
		/* in above statement we done multiple ternary operations
		 * we checked with 10 > 20 if condition succes it store 30 else
		 * it will lead to another statement in that we compared 40 > 50 condition
		 * failes it store the values of 70.
		 */
	}
	
	public static int m1(int i) {
		/* we created static methos so there is no need to instance the class
		 * we declared method m1 with return type int 
		 * so the method must return a integer value to the calling 
		 * method with parameter int i
		 */
		System.out.println(i);
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tasks tsk = new Tasks();
//		tsk.exe_1();
//		tsk.exe_2();
//		tsk.exe_3();
//		tsk.exe_4();
//		tsk.exe_5();
//		tsk.exe_6();
//		tsk.exe_7();
//		tsk.exe_8();
//		tsk.exe_9();
//		tsk.exe_10();
//		tsk.exe_11();
//		tsk.exe_12();
//		tsk.exe_13();
//		tsk.exe_14();
//		tsk.exe_15();
//		tsk.exe_16();
//		tsk.exe_17();
//		tsk.exe_18();
//		tsk.exe_18A();
//		tsk.exe_18B();
		tsk.exe_18C();
//		tsk.exe_19();
//		tsk.exe_20();
//		tsk.exe_21();
//		tsk.exe_22();
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));

	}

}
