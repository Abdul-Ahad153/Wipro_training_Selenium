package Selenium_day_01;
/*What are Java Keywords?
Java keywords are reserved words that have special meaning to the Java compiler.
You CANNOT use them as variable names, method names, or class names.

Think of keywords like traffic signs. Each has a specific purpose, and you can’t ignore or misuse them.

some of the most commonly used keywords 
int     float     class     public     static     void
if      else      while     for        return     new
try     catch     throw     throws     finally
this    super     import    package    interface
abstract  final   extends   implements


access modifiers : public , private , protected
class related : class, interface, extends, implements, abstract, final
data types : int , boolean, float , char , long , double etc
control flow : if, else , switch , case , default , while , for , do etc
exceptional handling : try , catch , finally , throw etc
object keywords : new , this , super , return , instanceof etc
*/

import java.util.Scanner ;
public class java_keywords {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a : ");
	int a = sc.nextInt();
	System.out.println("Enter the value of b : ");
	int b = sc.nextInt();
	int sum = a + b;
	System.out.println("Sum = "+ sum);
//	sc.close();
	
}
}
/* 
 keywords used are 
 class - defines a class 
 public - access modifier 
 static - means it belongs to that particular class ( no object needed )
 void - means no return value 
 scanner - it is a class name used to take user input  
 new - Creates a new Scanner object to read input
 int - Declares integer variables (a, b, sum)
 */
