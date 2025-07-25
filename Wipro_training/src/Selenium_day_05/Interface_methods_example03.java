package Selenium_day_05;

interface Exam{
	void startExam(String subject);
	default void  examRules(){
		System.out.println("No cheating , answer in order , auto submit ");
	}
	static void examCenter() {
		System.out.println("Center: Online Portal - Room 101");

	}
}

class MathExam implements Exam{
	public void startExam(String subject) {
		System.out.println("today's exam is " + subject);
	}
	public void examRules() {
		System.out.println("No cheating , -1/2 negative marking , auto submit");

	}
}
class ScienceExam implements Exam{
	public void startExam(String subject) {
		System.out.println("today's exam is " + subject);

	}
	
	public void examRules() {
		System.out.println("No cheating , no negative marking , auto submit");

	}
}
public class Interface_methods_example03 {
	public static void main(String[] args) {
		MathExam mathExam = new MathExam();
		mathExam.startExam("Maths");
		mathExam.examRules();
		Exam.examCenter();
		
		ScienceExam scienceExam = new ScienceExam();
		scienceExam.startExam("Science");
		scienceExam.examRules();
		Exam.examCenter();
	}

}
