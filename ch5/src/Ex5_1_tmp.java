


import java.lang.reflect.Array;
import java.util.Arrays; //ctrl +shift +o

public class Ex5_1_tmp {
	public static void main(String[] args) {
	//	int[] score; // 1. 배열score를 선언 (참조 변수)
	//	score = new int [5]; 2. 배열의 생성(int 저장공간5개)
		
		int[] score = new int[5]; //배열의 선언과 생성을 동시에 
		score[3] = 100;
		
		
		System.out.println("score[0] ="+score[0]);
		System.out.println("score[1] ="+score[1]);
		System.out.println("score[2] ="+score[2]);
		System.out.println("score[3] ="+score[3]);
		System.out.println("score[4] ="+score[4]);
		
		
		int value = score[3];
		System.out.println("value= "+ value);
		
		//--------------
		int[] arr = new int[9]; //길이가 5일 int 배열 arr을 생성
		System.out.println("arr.leght = " + arr.length);
		
		/*for(int i =0; i<10; i++) { //indet범위를 벗어나서 에러
			System.out.println("arr["+i+"]= "+ arr[i]);
		}*/
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
	at ch05.Ex5_1_tmp.main(Ex5_1_tmp.java:27) 
		 */
		for(int i =0; i< arr.length; i++) {
			System.out.println("arr["+i+"]= "+ arr[i]);
		}
		
		
		int[] iArr = {100,95,80,70,60}; // 길이가 5dls int배열 
		for(int i =0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
			
		}
		
		System.out.println(Arrays.toString(iArr));
		
		
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i =0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]); //0~2
		}
		
		// 012345
		String str = "ABCDE"; //str.lenght() = 5
		char ch = str.charAt(0); 
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		String str4 = str.substring(1, str.length()); //1~4 끝은 안들어감
		
		System.out.println(ch); //A
		System.out.println(str2); //BCD
		System.out.println(str3); //BCDE
		System.out.println(str4); //BCDE
		
		
		int[] arr1d = {0,4,1,2,3}; //1차원 배열 
		System.out.println(Arrays.toString(arr1d));
		
		Arrays.sort(arr1d);
		System.out.println(Arrays.toString(arr1d));
		
		
		int[][] arr2d = {{11,12},{21,22}};// 2차원 배열 
		
		System.out.println(Arrays.toString(arr1d));
		System.out.println(Arrays.deepToString(arr2d));
		
		String[][] str2d = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2d2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(str2d == str2d2); //참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2d, str2d2));
		
		//배열 복사 
		int[] arr22 = Arrays.copyOf(arr1d, arr1d.length);
		System.out.println(Arrays.toString(arr22));
		int[] arr23 = Arrays.copyOf(arr1d, 7);
		System.out.println(Arrays.toString(arr23));
		
		int[] arr24 = Arrays.copyOfRange(arr1d, 2,4);
		System.out.println(Arrays.toString(arr24));
		
	}
}
