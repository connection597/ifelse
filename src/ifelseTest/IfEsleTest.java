package ifelseTest;

import java.util.Scanner;

public class IfEsleTest {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in); //scanner객체 생성
		int score= sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else  {
			System.out.println("F");
		}

	}

}
