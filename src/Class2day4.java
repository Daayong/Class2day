import java.util.Scanner;

public class Class2day4 {

	public static void main(String [] args){
	
	System.out.println("===Test4 Start===");
	//10대 유무 판별
	//나이가 10보다 크고, 20 미만 
	//나이를 입력받기
	//10대면 청소년 출력하고 종료
	//아니면 그냥 종료 
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("나이를 입력하세요");
	
	int age = sc.nextInt();
	

	/*
	 * if(10<=age){
	 * 	if(age<20){
	 * 		System.out.println("10대 입니다.");
	 * 	}
	 * }
	 * */

	if(10<=age && age<20) {
	
		System.out.println("10대 입니다.");
		
	}
	
	System.out.println("===Test4 Finish===");

	}
	
}
