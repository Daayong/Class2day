import java.util.Scanner;

public class Class2day8 {
 public static void main(String [] args) {
	System.out.println("===Test8 Start===");
	
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
	 
	 //합격 기준
	 //평균이 60점 이상
	 //과목당 40점 이상 
	 
	/*
	 if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
		 System.out.println("합격입니다.");
		 
	 }else{
		 System.out.println("불합격입니다.");
	 }
	 */
	 

	 if(avg>=60) {
		 if(kor>40 && eng>40 && math>40) {
			 System.out.println("합격입니다.");
		 }else {
			 System.out.println("불합격입니다.");
		 }
	 }else {
		 System.out.println("불합격입니다.");
	 }
	 
	 
	 
	 
	 
	 System.out.println("===Test8 Finish===");
 }
}
