import java.util.Scanner;

public class Class2day6 {
 public static void main(String[] args) {
	 System.out.println("===Test6 Start===");
	
	 /*
	 int num = 5; 
	 
	 if(num%2 !=0) {
		System.out.println("홀수"); 
	 }else {
		 System.out.println("짝수");
	 }
	 */
	 
	 
	 //kor,eng,math 입력
	 //총점 , 평균 계산
	 //평균이 60점 이상이면 합격 아니면 불합격 출력
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("국어 점수를 입력하세요");
	 int kor = sc.nextInt();
	 System.out.println("영어 점수를 입력하세요");
	 int eng = sc.nextInt();
	 System.out.println("수학 점수를 입력하세요");
	 int math = sc.nextInt();

	 //총점 계산 
	 int total = kor + eng + math;
	 
	 //평균 계산
	 double avg = total/3.0;

	 String result="불합격";
	 
	 
	if(avg>=60) {
		result="합격";
	}
	 
	System.out.println(result+"입니다");
	 
	 
	 
/*	 
	 if(avg>=60) {
		 System.out.println("합격입니다");
	 }else {
		 System.out.println("불합격입니다");
	 }
*/			 
	 
	 System.out.println("===Test6 Finish===");
 }
}
