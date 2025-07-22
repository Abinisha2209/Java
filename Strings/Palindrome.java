import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        //Method 1 : Using StringBuilder
        
        String s1 =s.replaceAll("[^a-zA-Z]","").toLowerCase();
        StringBuilder rev = new StringBuilder(s1).reverse();
        if(s1.equals(rev.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
        //Method 2 : Using Two pointer approach
        
        String s2 = s.toLowerCase();
        int left=0,right=s.length()-1;
        boolean ispalindrome = true;
        while(left<right){
            // to remove non-letter characters
            while (left < right && !Character.isLetter(s2.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(s2.charAt(right))) {
                right--;
            } 
            // to compare characters
            if(s2.charAt(left)!=s2.charAt(right)){
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}