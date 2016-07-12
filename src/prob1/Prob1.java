package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();
		int total = 0;
		System.out.println(inputNumber);
		/* 여기에 구현 코드를 작성 합니다. */
//		if (inputNumber % 2 == 0) {
			/* 짝수이면 */
			for (int i = inputNumber; i >= 0; i -= 2) {
				total += i;
			}
//
//		} else {
//			/* 홀수이면 */
//			for (int i = inputNumber; i >= 0; i -= 2) {
//				total += i;
//			}
//		}

		System.out.println("입력 값 : " + inputNumber + " 결과 값 " + total);
		scanner.close();
	}

}
