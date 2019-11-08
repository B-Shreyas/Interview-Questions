	
public class FindRepeatOnce {
	
	  
	 
	      
	public static int findSingle(int arr1[]) 
    { 
        
        int res = arr1[0]; 
        for (int i = 1; i < arr1.length; i++) 
            res = res ^ arr1[i]; 
      
        return res; 
    } 
  

    public static void main (String[] args) 
    { 
        int arr1[] = {2, 3, 5, 4, 5, 3, 4}; 
         
        System.out.println("Element occurring once is " + 
                            findSingle(arr1) + " "); 
    } 
    

    public static int find(int arr1[]) {
    	
    	for(int i=0;i<arr1.length;i++) {
    		for(int j=i;j<arr1.length;j++) {
    			
    		}
    		
    	}
   	 
    }
    
	} 
