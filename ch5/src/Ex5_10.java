

import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		String[][] word = {
				{"chair", "의자"} //word[0][0], word[0][1]
				,{"computer" , "컴퓨터"}//word[1][0], word[1][1]
				,{"integer","정수"}//word[2][0], word[2][1]
			};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<word.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, word[i][0]);
								// %s 문자열 출력 지시자  chair ->문자열 
			String tmp = sc.nextLine();
			
			if(tmp.equals(word[i][1])) {
				System.out.printf("정답입니다.","%n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다 .%n%n", word[i][1]);
			}
		}
	}

}
