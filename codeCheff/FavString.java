package codeCheff;
import java.util.*;
public class FavString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
		    int s = sc.nextInt();
		    String str = sc.next();
		    char[] ch = str.toCharArray();
		    
		    int flag = 0;
		    for(int i=0;i<ch.length-3;i++)
            {
                if(ch[i]=='c' && ch[i+1]=='o' && ch[i+2]=='d' && ch[i+3]=='e')
                {
                    flag = 1;
                    break;
                }
                else if(ch[i]=='c' && ch[i+1]=='h' && ch[i+2]=='e' && ch[i+3]=='f')
                {
                    flag = 0;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println("WA");
            }
            else{
                System.out.println("AC");
            }
		    n--;
		}
		
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();
//		for (int i=0;i<T;i++){
//		    int N=sc.nextInt();
//		    sc.nextLine();
//		    String S=sc.nextLine();
//		    int a=S.indexOf("code");
//		    int b=S.indexOf("chef");
//		    if(a<b){
//		        System.out.println("AC");
//		    }else{
//		        System.out.println("WA");
//		    }  
//		}

	}

}
