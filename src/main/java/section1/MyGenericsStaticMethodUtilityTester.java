/**
 * 
 */
package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergei
 *
 */
public class MyGenericsStaticMethodUtilityTester<T> {
	protected List<String> strings;
	protected List<Integer> integers;
	public String s1 = "element_1";
	public Integer i1 = 1234;
	
	public List<Integer> add2collection1(){
	List<String> s = new ArrayList<String>();
	s.add(new String(s1));
	String putsizeofString = Collections.max(s);
	System.out.println("adding String "+ s +", now string.size" + putsizeofString);
	
	List<Integer> i = new ArrayList<Integer>();
	i.add(new Integer(i1));
	Integer putsizeofInteger = Collections.max(i);
	System.out.println("adding Integer "+ i +", now integer.size" + putsizeofInteger);
	return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
