package com.practice.git;

public class SumofNnumbers {
	
	public static int getSum(int a) {
		int sum = 0;
		for(int i=0;i<=a;i++) {
			 sum = sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumofNnumbers.getSum(10));
	}

}
