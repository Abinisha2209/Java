1.Reverse Array

Optimised Approach - Two pointer
``` 
class Solution {
    public int[] reverseArray(int arr[]) {
        int size = arr.length;
        int left=0,right=size-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;

    }
}
```

2.Reverse Array at the given index

Using Array List

```
public class Solution 
{
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr, int m)
    {
        int left=m+1,right = arr.size()-1;
        while(left<right){
                int temp= arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
            return arr;
        }
}
```

3.Factorial of large numbers

Using BigInteger

```
import java.math.BigInteger;
class Solution {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> fact = new ArrayList<>();
        BigInteger num=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        for(char c:num.toString().toCharArray()){
            fact.add(c-'0');
        }
            
        return fact;
    }
}
```
 

