package odev3ders;

public class InstructorManager extends UserManager {
	public void releaseNewCourse(Course course) {
		System.out.println("Yeni kurs yay�nland�" + course.name);
	}
}
