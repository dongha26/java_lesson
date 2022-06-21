
package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEX2 {

	//문자열 배열에 저장된 값을 직접 정렬(오름차순)
	public static void main(String[] args) {
		String[] names = {"제니","다현","나연","신비","은하","모모"};
		
		for (int i = 0; i < names.length-1; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp = names[i];
					names[i]= names[j];
					
					names[j] = temp;
				}
				
			}
		
		}
		System.out.println(Arrays.toString(names));
		
		
	}

}