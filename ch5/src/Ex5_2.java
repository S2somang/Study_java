

public class Ex5_2 {
	public static void main(String[] args) {
		int sum =0; // 총점을 저장하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100,88,100,100,90};
		
		/*
		sum+= score[0];
		sum+= score[1};
		sum+= score[2];
		sum+= score[3];
		sum+= score[4];
		*/
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //배열에 저장된 값들을 모두 더함 
		}
		
		average = sum/(float)score.length; //ㄱㅖ산결과를 float타입으로 얻기위해 형변환
		System.out.println(sum);
		System.out.println(average);
	}
}
