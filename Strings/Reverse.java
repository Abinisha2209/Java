import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        //Using StringBuilder
        
        StringBuilder rev1 = new StringBuilder(s);
        System.out.println(rev1.reverse().toString());
        
        // or Using a loop (less efficient)
        
        String rev2 = new String();
        for(int i=s.length()-1;i>=0;i--){
            rev2 += s.charAt(i);
        }
        System.out.println(rev2);
        
        //or Using char[] array, two-pointer approach (preferred)
        
        char [] arr = s.toCharArray(); //to convert string to char array
        int left=0,right=s.length()-1;
        while(left<right){      
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String rev3 = new String(arr); //to convert char array to string
            System.out.println(rev3);
    }
}













