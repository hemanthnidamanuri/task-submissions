package java_prac;



public class ConditionalLoops {
	
	public void number_series() {
		/*1Write a java program to print the following
		series using while loop and for loop
		1,2,4,7,11,16,22…. For a given number n.*/

		//Using  for loop 
		int n = 25;
		int i;
		for (i = 1; i <=n; i++) {
			int num = (i*(i-1)/2+1);
			System.out.print(num+",");
		}
		System.out.println(" ");
		int j=1;
		//using while loop for sequence
		do {
			System.out.print((int)(j*(j-1)/2+1)+",");
			j++;
		} while (j<=n);
		
		/*output of program  = 1,2,4,11,16,22,......*/
	}

	
	public void alphabet_series() {
		/*Write a java program to print all the 
		 * alphabets using while loop and for loop.
		 */

		//using for loop.
		char ch  = 'a';
		System.out.println("Using For loop:");
		for (int i = 0; i < 26; i++) {
			System.out.print(ch++);
		}
		//using while loop
		System.out.println("using while loop:");
		char alph = 'a';
		do {
			System.out.print(alph);
			alph++;
		} while (alph<='z'); 
			//output : a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z.
	}
	
	public void start_sequence() {
		
		/*Write a java program to print the following pattern
		 *Input n = 3
		 */
		
//		*****
//		*
//		*****
//		**********
//		**
//		**********
//		***************
//		***
//		***************


		int n = 3;
		//Using for loop
		for(int i =1;i<=n;i++) {
			int ul = i*5;
			for(int j = 0;j<ul;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			for(int l =1;l<=ul;l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//Using while loop
		//output :
		
//		*****
//		*
//		*****
//		**********
//		**
//		**********
//		***************
//		***
//		***************
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalLoops cl = new ConditionalLoops();
//		cl.alphabet_series();
//		cl.number_series();
		cl.start_sequence();

	}

}
