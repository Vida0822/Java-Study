package ch5_재귀알고리즘;

import java.util.Scanner;

/**
 * @author HEEMIN
 * @date 2023. 9. 17.-오후 8:00:18
 *	@subject 재귀호출 - 유클리드 호제법 
 * @content 


 */
public class Ex02 {
	
	static int gcd(int x, int y) {
		if(y==0)
			return x ; 
		else 
			return gcd(y,x%y) ; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("두 정수의 최대공약수를 구합니다");
		
		System.out.print("정수를 입력하세요: "); int x = sc.nextInt(); 
		System.out.print("정수를 입력하세요: "); int y = sc.nextInt(); 
		
		System.out.println("최대 공약수는 "+gcd(x,y)+"입니다.");
				
	} // main 

} // class 
