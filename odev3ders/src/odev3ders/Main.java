package odev3ders;


public class Main {

	public static void main(String[] args) {
		Student student = new Student(3, "Do�ukan", "Bozk�r", "sdasdasdasas","dogukan123");
		Instructor instructor = new Instructor(6, "Engin","Demiro�", "sa�dals�dasdals�d", "11223311","Java");
		
		UserManager userManager = new UserManager();
		
		User[] users = new User[] {student,instructor};
		
		for(User user : users) {
			userManager.login(user);	
		}
		StudentManager studentManager = new StudentManager();
		studentManager.addComment(new Comment(1,3,5, "�devi Yapt�m!"));
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.releaseNewCourse(new Course(2,"Java","Engin",0));
		instructorManager.addComment(new Comment(2,4,6,"Afferin �ocuklar!"));
	}

}
