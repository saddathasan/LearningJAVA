/**
 *
 * Learning JAVA 
 * gen
 * Ternary.java
 *  
 */
package gen;

/**
 * @author dr.zola
 *
 * 5:50:38 PM 
 * Apr 23, 2018
 *
 */
public class Ternary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, k;
		
		i = 12; 
		k = i < 0 ? -i : i;  //get absolute value of i
		System.out.println("Absolute value of ");
		System.out.println(i + " is " + k);

		i = -12; 
		k = i < 0 ? -i : i;  //get absolute value of i
		System.out.println("Absolute value of ");
		System.out.println(i + " is " + k);
	}

}
