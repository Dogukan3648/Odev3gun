package odev3ders;


public class Main {

	public static void main(String[] args) {
		Student student = new Student(3, "Doğukan", "Bozkır", "sdasdasdasas","dogukan123");
		Instructor instructor = new Instructor(6, "Engin","Demiroğ", "saşdalsşdasdalsşd", "11223311","Java");
		
		UserManager userManager = new UserManager();
		
		User[] users = new User[] {student,instructor};
		
		for(User user : users) {
			userManager.login(user);	
		}
		StudentManager studentManager = new StudentManager();
		studentManager.addComment(new Comment(1,3,5, "Ödevi Yaptım!"));
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.releaseNewCourse(new Course(2,"Java","Engin",0));
		instructorManager.addComment(new Comment(2,4,6,"Afferin Çocuklar!"));
	}

}
