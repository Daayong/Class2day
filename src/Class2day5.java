import java.util.Scanner;

public class Class2day5 {

	public static void main(String [] args) {
		System.out.println("===Test5 Start==="); 
		
		Scanner sc = new Scanner(System.in);
		
		//회원 가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		System.out.println("ID를 입력하세요");
		//ID 입력 후 저장
		
		int id2 = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int pw2 = sc.nextInt();
		
		//로그인이 성공하면 -로그인 성공 출력
		if(id==id2 && pw==pw2) {
			
			System.out.println("로그인 성공");
		}
		
		
		
		System.out.println("===Test5 Finish===");
				
		
	}
}
