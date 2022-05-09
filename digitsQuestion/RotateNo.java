/*Rotate the number by given place
 * input: 12345
 * n=4
 * output: 23451
 * number rotate by 4 places
 * */

package digitsQuestion;
import java.util.*;
public class RotateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		
		//to finding no of digits 
		int temp=n;
		int nod=0;
		
		while(temp>0) {
			temp= temp/10;
			nod++;
		}
		
		k= k% nod;
		if(k<0) {
			k= k+nod;
		}
		
		int mul=1;
		int div=1;
		
		for(int i=1; i<=nod; i++) {
			if(i<=k) {
				div= div*10;
				
			}else {
				mul = mul * 10;
			}
		}
		int que= n/div;
		int rem = n%div;
		//int rotate=0;
		int  rotate = 1;
		rotate= rotate * mul +que;
		
		System.out.println(rotate);
		sc.close();

	}

}
