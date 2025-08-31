Two Pointers is a technique where we use two variables (usually indices) to scan an array or string **efficiently**.

## Types

#### 1. Start-End Pointers (Opposite Ends)
Start with two pointers — one at the beginning and one at the end. Adjust them based on logic.
###### Use Case
- Array is sorted
- Need to find **pair of elements** satisfying a condition (e.g., target sum, max area)
###### How It Works
Two pointers reduce **O(N²)** brute force to **O(N)** or **O(N log N)** by:
- **Skipping unnecessary comparisons**
- **Moving pointers smartly** toward a goal (like sum, palindrome, etc.)
- Avoiding extra space (unlike hash maps in some cases)

###### When to use 

| Problem Pattern             | Use Two Pointers When..                                                                   |
| --------------------------- | ----------------------------------------------------------------------------------------- |
| **Sorted array problems**   | You need to find **pairs/triplets** with specific sums or differences                     |
| **Removing elements**       | You want to **remove duplicates** or **move zeroes**, while maintaining order             |
| **Finding max/min range**   | Problems like **Container With Most Water**, **Trapping Rain Water**                      |
| **Binary search variation** | You must **search for a target efficiently** (Two Sum in sorted array)                    |
| **Partitioning arrays**     | Split array into parts with certain conditions (e.g. k-sum, even-odd, negatives-positive) |
|  **Merging arrays**         | You're combining **two sorted arrays**                                                    |

###### Basic logic
```
int left=0; //start pointer
int right = arr.length-1; //end pointer

while(left<right){
 //perform the logic
 if() // condition check and return answer
 // to move the pointers
 if(//to increase) left++;
 else right--; 
}

```

