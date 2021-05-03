package odev3ders;


public class UserManager {
	public void login(User user) {
		System.out.println("Giriþ yaptý: " + user.firstName );
	}
	
	public void addComment(Comment comment){
		System.out.println("Yorumunuz Gönderildi: " + comment.comment);
		
	}
}
