/**
 *
 * Learning JAVA 
 * gen
 * ByteShift.java
 *  
 */
package gen;

/**
 * @author dr.zola
 *
 * 5:33:47 AM 
 * Apr 22, 2018
 *
 */
public class ByteShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 64, b;
		int i; 
		
		i = a << 2;
		b = (byte) (a << 2); 
		
		System.out.println("original value of a = "+a);
		System.out.println("i and b = "+ i + "  "+b);
		

	}

}
