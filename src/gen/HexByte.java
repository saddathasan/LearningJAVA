/**
 *
 * Learning JAVA 
 * gen
 * HexByte.java
 *  
 */
package gen;

/**
 * @author dr.zola
 *
 * 6:36:52 AM 
 * Apr 22, 2018
 *
 */
public class HexByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char hex[] = {
				'0','1','2','3','4','5','6','7',
				'8','9','a','b','c','d','e','f'
		};
		
		byte b = (byte) 0xf1;
		
		System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
	}

}