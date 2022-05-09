/*
 *           *
 *          **
 *         ***
 *        ****
 */

package patterns;
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.println();
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
