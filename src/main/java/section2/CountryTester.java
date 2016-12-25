package section2;

public class CountryTester {

	public static void main(String[] args) {
		Country<Capital> us = new Country<Captial>("USA", new Capital("Washington D.C."));
		System.out.println("us name" + us.getName() + ", captial name:" + us.getCapitalName());
		
		Country<Capital> turkey = new Country<Capital>("Turkey", new Capital("Ankara"));
		System.out.println("Turkey name:"+ us.getName() +", capital name:"+us.getCapitalName());

	}
}

