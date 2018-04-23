/**
 *
 * Learning JAVA 
 * gen
 * MultByTwo.java
 *  
 */
package gen;

/**
 * @author dr.zola
 *
 * 5:41:06 AM 
 * Apr 22, 2018
 *
 */
public class MultByTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0xFFFFFFE; 
		
		for (int i = 0; i < 4; i++) {
			num = num << 1; 
			System.out.println(num);
		}

	}

}
