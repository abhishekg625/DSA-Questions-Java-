package sorting;

public class bubbleSort {

	public static void main(String[] args) {
		//int arr[] = {22,44,11,23,45,65};
		//Scanner sc = 
		//int temp = 0;
//		for(int i= 0; i<6; i++)
//		{
//			int flag = 0;
//			for(int j =0; j<6-i; j++)
//			{
//				if(arr[j] > arr[j+1])
//				{
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag =1;
//					}
//			}
//		
//			if(flag == 0)
//			{
//				break;
//			}
//			}
//			for(int i =0; i<6; i++)
//			{
//				System.out.println("bubble sort = " +arr[i]);
//				
//			}
//		
//		
		

	    //int arr[] = {2,6,1,9,4,3,5,7};
	    int arr[]= {1,2,0,0,1,2,1,0};
	    
	    for(int i=0; i<6; i++){
	        int flag =0;
	        
	        for(int j=0; j<6-i; j++){
	            if(arr[j]> arr[j+1]){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                flag=1;
	                
	            }
	            
	        }
	        if(flag==0){
	            break;
	        }
	        
	        
	    }
	    for(int i=0; i<6; i++){
	        System.out.print(arr[i]+" ");
	    }

	}

}
