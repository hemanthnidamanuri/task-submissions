/**
 * 
 */
package java_exam;

/**
 * @author hemanth
 * 
 * Count number of vowels in a String ”Mississippi” and remove the vowels form the string 
 * 
 *
 */
public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Mississippi";
		
		countingandremoving(word);
		
	}
	private static void countingandremoving(String word) {
		// TODO Auto-generated method stub
		char[] ww = word.toCharArray();
		int count = 0;
		for (int j = 0; j < ww.length; j++) {
			if(ww[j]=='a' || ww[j]=='e' || ww[j]=='i' || ww[j]=='o' || ww[j]=='u') {
				count++;
				word = word.replace(String.valueOf(ww[j]), "");
			}
		}
		System.out.println("count of vowels in word are="+count+","+"after removing vowels = "+word);
		
	}

}
