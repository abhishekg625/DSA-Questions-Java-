/*
 *        *
 *        **
 *        ***
 *        ****
 *        ***
 *        **
 *        *
 */
package patterns;
public class pattern3 {
	public static void printpattern(int n)
	{
		for(int i=1; i<=n;i++)
		{
			for(int j =1; j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		printpattern(n);
//		for(int i = 1; i<n; i++)
//		{ for(int j=1; j<=i; j++)
//		{
//			System.out.println("*");
//		}
//			System.out.println();
//		}
//		for(int i=1; i<n;i++)
//		{
//			for(int j=n-1; j>=i; j--)
//			{
//				System.out.println("*");
//			}
//		}

	}

}
