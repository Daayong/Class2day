import java.util.Scanner;

public class Class2day3 {

	public static void main(String[] args) {
		System.out.println("===Test3 Start===");
		//쇼핑몰의 총 주문 금액 입력
		//주문 금액이 30000원 이하면 배송비 3000원 추가 
		//주문 금액이 30000원 이상이면 무료 배송 
		
		//총 주문금액 출력 
		//ex) 주문금액 25000원 이면 최종 출력 28000원 
		//ex) 주문금액 35000원 이면 최종 출력 35000원
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 금액을 입력하세요");
		//총 주문금액 변수
		int total = sc.nextInt();
		
		if(total<=30000) {
			total = total +3000;	
		}
		
		System.out.println("총 결제금액 : " + total);
		
		System.out.println("===Test3 Finish===");
	}
}
