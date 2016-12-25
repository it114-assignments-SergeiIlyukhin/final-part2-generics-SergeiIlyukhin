/**
 * 
 */
package section1;

/**
 * @author Sergei
 *
 */
public class MyGenericContainerTester {
	protected static MyGenericContainerInterface<String> c4String;
	protected static MyGenericContainerInterface<Integer> c4Integer;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("c4String Container contains:" + c4String);
		System.out.println("c4Integer Container contains:" + c4Integer);
	}

}
