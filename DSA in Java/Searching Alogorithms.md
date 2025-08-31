Searching algorithms in Java are methods used to find a specific element within a data structure, such as an array or a list. They are broadly categorized into sequential and interval searches.

#### 1.  Sequential Search:

**Linear Search:**  This algorithm traverses the data structure sequentially, comparing each element with the target element until a match is found or the end of the structure is reached.
###### When to use
- Unsorted arrays
- Small input size
- No extra space or preprocessing needed
###### Example

   ```
   int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) return i;
    }
    return -1;
}
```

###### Time Complexity
- **Best Case:** O(1) (element at first index)
- **Worst Case:** O(n) (element not found or at last)
- **Average Case:** O(n)

#### 2.Interval Search:
   These algorithms are designed for sorted data structures and are generally more efficient than linear search.
##### Binary Search :
 This algorithm repeatedly divides the search space in half. It compares the target element with the middle element of the current search space. If they match, the element is found. If the target is smaller, the search continues in the left half; if larger, in the right half
######  When to Use:
- Array is sorted
- Fastest general-purpose search
###### Example
```
int binarySearch(int[] arr, int key) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid;
        else if (arr[mid] < key) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}

```
###### Time Complexity:
- **Best Case:** O(1) (mid element is key)
- **Worst Case:** O(log n)
- **Average Case:** O(log n)
##### Ternary Search
###### When to Use:
- When array is **unimodal** (single peak or valley)
- Searching for maximum/minimum in such arrays
###### Example
```
int ternarySearch(int[] arr, int key, int low, int high) {
    if (low > high) return -1;

    int mid1 = low + (high - low) / 3;
    int mid2 = high - (high - low) / 3;

    if (arr[mid1] == key) return mid1;
    if (arr[mid2] == key) return mid2;

    if (key < arr[mid1]) return ternarySearch(arr, key, low, mid1 - 1);
    else if (key > arr[mid2]) return ternarySearch(arr, key, mid2 + 1, high);
    else return ternarySearch(arr, key, mid1 + 1, mid2 - 1);
}

```
###### Time Complexity:
- **Best Case:** O(1)
- **Worst Case:** O(log n)
- **Average Case:** O(log n)
##### Jump Search
###### When to Use:
- Sorted arrays
- Data stored in external memory or memory-constrained environments
###### Example
```
int jumpSearch(int[] arr, int key) {
    int n = arr.length;
    int step = (int)Math.sqrt(n);
    int prev = 0;

    while (arr[Math.min(step, n) - 1] < key) {
        prev = step;
        step += (int)Math.sqrt(n);
        if (prev >= n) return -1;
    }

    while (prev < Math.min(step, n)) {
        if (arr[prev] == key) return prev;
        prev++;
    }
    return -1;
}

```

###### Time Complexity:
- **Best Case:** O(1)
- **Worst Case:** O(√n)
- **Average Case:** O(√n)
#### **Two-Pointer Technique**

###### When to Use:
- Sorted arrays, pair/triplet problems
###### Example
```
boolean twoPointerSum(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    return false;
}

```
###### Time Complexity:
- **Best Case:** O(1) (first pair matches)
- **Worst Case:** O(n)
- **Average Case:** O(n)