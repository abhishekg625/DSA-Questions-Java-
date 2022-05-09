//check if array element is multiple of given number?

package arrays;
import java.util.Scanner;
public class ArrayMultiElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] ar = new int[5];
		for(int i=0; i<ar.length; i++)
		{
			ar[i]= sc.nextInt();
			}
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i]*ar[j] ==n /*&& i!=j*/)
				{
					System.out.println("multiplied elemnt" +ar[i]+""+ar[j]);
					break;
				}
			}
		}
		sc.close();
		
		

	}

}
