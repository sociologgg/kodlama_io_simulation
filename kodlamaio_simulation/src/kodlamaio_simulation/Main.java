package kodlamaio_simulation;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Alim Örnek");
		student1.setLocation("İstanbul");
		student1.setUniversity("Boğaziçi Üniversitesi");
		student1.setUserType("Öğrenci");
		
		System.out.println(student1.getName());
		
		Course course1 = new Course();

		course1.courseName = "Yazılım Geliştirici Geliştirme Kampı (C# + Angular)";
		course1.constructor = "Engin Demiroğ";
		course1.period = "2 month";
		course1.price = 0;
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1, course1);
		
		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		
		
		Instructor instructor1 = new Instructor(1 ,"Engin Demiroğ", "Eğitmen", "Yazılım Geliştirici ", "Ankara");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1, course1);

		
		
	
		
	
		
		Course course2= new Course("Proglamlamaya Giriş için Temel Kurs","Engin Demiroğ","4 month",0);
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
			
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.RollCall(course2);
		
	}

}
