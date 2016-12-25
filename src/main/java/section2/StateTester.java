package section2;

public class StateTester {
	
	
	
	public static void main(String[] args) {
		State<Capital, Governor> nj = new State<Capital, Governor>("NJ", new Capital("Trenton"), new Governor("Chris Cristie"));
		System.out.println("nj name:" + nj.getName() + ", capital name" + nj.getCapitalName() + ", governor name:" + nj.getGovernorName());
	}
}
