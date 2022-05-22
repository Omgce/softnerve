package com.op;

public class Leader_array {
	
	public void printLeader(int arr[],int len) {
		
		for(int i=0;i<len;i++) {
			int j;
			for(j=i+1;j<len;j++) {
				if(arr[i]<=arr[j]) {
					break;
				}
				
			}
			if(j==len) {
			System.out.print(arr[i]+" ");	
			}
		}
	}
	
	public static void main(String[] args) {
		Leader_array la=new Leader_array();
		int arr[]=new int[]{7, 10, 4, 10, 6, 5, 2};
		int n=arr.length;
		la.printLeader(arr,n);
	}

}
