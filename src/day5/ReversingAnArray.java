package day5;

import java.util.Arrays;

public class ReversingAnArray {

	public static void main(String[] args) {
		
		int a[] = {10, 45, 23, 76, 35, 90, 35};
		System.out.println("My array is: " + Arrays.toString(a));
		int size = a.length;
		for(int i=0; i<size/2; i++) {
			int temp = a[i];
			a[i] = a[a.length -i-1];
			a[size -i -1] = temp;
		}
		System.out.println("Reversed array:");
		System.out.println(Arrays.toString(a));
	}

}
