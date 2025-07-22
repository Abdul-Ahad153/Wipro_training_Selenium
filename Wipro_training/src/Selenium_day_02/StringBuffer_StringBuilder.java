package Selenium_day_02;

public class StringBuffer_StringBuilder {
	  public static void main(String[] args) {
	        // StringBuffer 
	        System.out.println("Using StringBuffer:");
	        StringBuffer sbf = new StringBuffer("Hello");

	        sbf.append(" Ahad");
	        System.out.println("append(): " + sbf);

	        sbf.insert(5, " Bro");
	        System.out.println("insert(): " + sbf);

	        sbf.replace(6, 9, "Bhai");
	        System.out.println("replace(): " + sbf);

	        sbf.delete(0, 5);
	        System.out.println("delete(): " + sbf);

	        sbf.reverse();
	        System.out.println("reverse(): " + sbf);

	        // StringBuilder 
	        System.out.println("\nUsing StringBuilder:");
	        StringBuilder sbl = new StringBuilder("Welcome");

	        sbl.append(" Maverick");
	        System.out.println("append(): " + sbl);

	        sbl.insert(7, " Back");
	        System.out.println("insert(): " + sbl);

	        sbl.replace(8, 12, "Again");
	        System.out.println("replace(): " + sbl);

	        sbl.delete(0, 7);
	        System.out.println("delete(): " + sbl);

	        sbl.reverse();
	        System.out.println("reverse(): " + sbl);
	    }

}
