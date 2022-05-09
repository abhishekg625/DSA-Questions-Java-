package sorting;

public class sellectionSort {

	public static void main(String[] args) {
		int a[] = {3,6,2,33};
		int temp =0; 
				int min ;
		
		for(int i = 0; i<a.length-1 ; i++)
			
		{
			min = i;
			
			for(int j =i+1; j<a.length;j++)
			{
				if(a[j]<a[min])
				
					a[min] = j;
				temp = a[min];
			a[min]= a[i];
			a[i]= temp;
		}}
			
		for(int i = 0; i<a.length; i++)
	{
		System.out.println(a[i]+ "");
	}
	
}}
