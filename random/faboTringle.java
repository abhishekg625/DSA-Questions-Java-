package random;

class faboTringle { 
    
    
	// split string program
		public static void main(String a[]){
		 String s = "Hello I'm good,right?";
		 String[] tokens = s.split("[!?. ,_'@]", 0);
		 System.out.println(tokens.length);
		 int i=0;
		 while(i<tokens.length){
		  System.out.println(tokens[i]);
		  i++;
		 }
		}
		}