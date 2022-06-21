package koreait.day06;

public class C32_Arraymaniqulation {

	public static void main(String[] args) {
		// 배열요소 삽입/삭제
		int[]test = {11,22,33,44,55,66,77};
		for(int i=0; i<test.length;i++) 
			System.out.print(test[i]+"\t");		
		System.out.println();
		System.out.println("\n------------------------------------------------");
		// 인덱스k에 삽입할 때
		int k =2;
		for (int i = test.length-2; i >=k ; i--) {
//		for (int i = 2; i < test.length-1; i++) {
			test[i+1] = test[i];
		test[k]=23;
		}	for(int i=0; i<test.length;i++) {
			System.out.print(test[i]+"\t");
		}	System.out.println("\n------------------------------------------------");
		// 데이터삭제
		int[]test2 = {11,22,33,44,55,66,77};
		System.out.println();
		for(int i=0; i<test2.length;i++) {
			System.out.print(test2[i]+"\t");
		}
		System.out.println("\n------------------------------------------------");
		for (int i = k+1; i < test2.length; i++) {
			test2[i-1] = test2[i];
		}System.out.println();
		for(int i=0; i<test2.length-1;i++) {
			System.out.print(test2[i]+"\t");
		}

	}

}
