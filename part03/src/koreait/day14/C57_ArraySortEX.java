package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEX {

	//�迭�� ����� ���� ���� �����ϰ� ���� �����غ���.
	public static void main(String[] args) {
		int[] arr = {34,77,19,56,45,9};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = 0;
					temp = arr[j];
					arr[j] =arr[i];
					arr[i] = temp;
				}
				
			}
		
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}