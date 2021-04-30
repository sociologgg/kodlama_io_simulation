package kodlamaio_simulation;




public class Course {
	// Constructor 1
	public Course() {
		System.out.println("Course constructor is running");
		
		
		
	}
	// Constructor 2
	public Course(String courseName, String constructor, String period, int price) {
		
		this.courseName = courseName;
		this.constructor = constructor;
		this.period = period;
		this.price = price;
		
		
		
		
	}
	
	
	String period;
	String courseName;
	int price;
	String constructor;
}
