## Types
#### 1. **Start-End Pointers**
Compare characters from both ends of the string.

| Problem Pattern                          | Use Two Pointers When..                                                       |
| ---------------------------------------- | ----------------------------------------------------------------------------- |
| **Palindrome checking**                  | You want to check if a string is the same when reversed                       |
| **Valid palindrome with k changes**      | You can skip at most one character (e.g. LC 680)                              |
| **Substring/window scanning**            | You move start and end pointers to track characters                           |
| **Removing duplicates**                  | To **remove adjacent duplicates** or simplify a string (stack + two pointers) |
| **Compressing strings**                  | Use two pointers to scan ahead while keeping track of frequency               |
| **Pattern scanning (e.g. ABC in order)** | You move both pointers to validate character sequences                        |
##### Basic logic

```
int left=0; //start pointer
int right = str.length()-1; //end pointer

while(left<right){
 //perform the logic
 if() // condition check and return answer
 // to move the pointers
 if(//to increase) left++;
 else right--; 
}
```