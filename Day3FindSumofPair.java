/* find all pair of element from an array sum is equal is to given number
 * we have number
 * 
 */
package main1;

public class Day3FindSumofPair {
	public static void main(String[] args) {
		
		int arr[]= {3,10,10,8,7,13,15,5};
		int numbers=20;
		
		if(arr.length<2) {
			System.out.println("Array Shouls contain at last two number's");
		}else {
			
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					int temp=arr[i]+arr[j];
					if(temp==numbers) 
						System.out.println("Pairs of the"+arr[i]+"and"+" is "+arr[j]);
					
				}
			}
		}
		
	}

}
