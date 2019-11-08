
public class FindSum {
	
	public static void main(String [] arg) {
		
		int arr1 []= {1,4,2,3,7,-1,6,0,5};
		
		int sum=6;
		
		SumEqualToPairNo(arr1 ,sum);
	}
	public static void SumEqualToPairNo(int arr1 [], int sum) {
		
		int count=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i;j<arr1.length;j++) {
				
				if(arr1[i]+arr1[j]==sum) {
					
					count++;
					System.out.println(" first no"+arr1[i]+"second no "+arr1[j]);
				}
			}
		}
		System.out.println("the count of sum equal to pair no is : "+count);
		
	}

}
