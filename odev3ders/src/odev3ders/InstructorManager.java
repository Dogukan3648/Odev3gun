package odev3ders;

public class InstructorManager extends UserManager {
	public void releaseNewCourse(Course course) {
		System.out.println("Yeni kurs yayınlandı" + course.name);
	}
}
