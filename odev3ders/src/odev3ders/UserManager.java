package odev3ders;


public class UserManager {
	public void login(User user) {
		System.out.println("Giri� yapt�: " + user.firstName );
	}
	
	public void addComment(Comment comment){
		System.out.println("Yorumunuz G�nderildi: " + comment.comment);
		
	}
}
