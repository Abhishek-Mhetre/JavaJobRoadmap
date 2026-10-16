package Day03;

public class String_Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String text = "madam";
           String rev = "";
           
           for(int i = text.length() - 1; i >= 0; i--) {
        	   rev = rev + text.charAt(i);
           }
           if(text.equals(rev)) {
        	   System.out.println("Palindrome");
           }else {
			System.out.println("Not Palindrome");
		}
	}

}
