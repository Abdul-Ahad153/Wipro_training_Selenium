package Selenium_day_08;

public class Wrapper_Class {
	public static void main(String[] args) {
		int a = 20;
		Integer wrapper_A = a ; // this is called auto boxing
		System.out.println("Auto boxed integer : " + wrapper_A);
		
		Integer wrapper_B = 30 ;
		int b = wrapper_B ; // this is called unboxing 
		System.out.println("Unboxed int : " + wrapper_B);
		
		Integer x = Integer.valueOf(100);
        int y = x.intValue();
        System.out.println("ValueOf and intValue: " + y);
	}

}
