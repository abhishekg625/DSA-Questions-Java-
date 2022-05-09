package strings;
//remove special character from the string
public class RemSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "#a@b%h!i>s@h(e)k&";
		
		String special= str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(special);

	}

}
// replace all will replace these special characters with the blank space