---

---

- Non- linear hierarchical Data Structure
- Nodes connected by edges
- A tree is **acyclic**, has a **single root**, and every node has **one parent (except the root)**.

Tree Terminologies 

1.Node
A **node** is the **basic unit** of a tree that holds:
- A value
- References to its  child nodes
```
class Node{
	int data;
	Node left;
	Node right;
}
```

2.Root Node
- Only one root node in a tree
- Topmost Node, No parent

3.Parent Node
- A node is called parent, if it has one or more childs
- Every node has exactly one parent[execpt root]
-
4.Child Node
- A node is called child, if it is derived from another node
- A node can have many children

5.Sibling
- Nodes that have same parent
6.Leaf Node
- No children
- End point of a tree
7.Internal Node
- Any node that is not a leaf node(atleast one child)
8.Height
  - Height of a Node =  Number of edges on the longest path from that node **to a leaf**.
  - Height of a Tree = Height of Root Node
  - Formula
```
   height = 1 + max(height of left, height of right)
```
   Example
```
        1         ← Height = 2
       / \
      2   3       ← Height = 1
     / \
    4   5         ← Height = 0 (Leaf Nodes)
```
   
   Implementation
```
int height(Node node) {
    if (node == null)
        return -1;  // Or 0, based on convention
    return 1 + Math.max(height(node.left), height(node.right));
}
```

Depth
- The **depth** of a node = number of edges from the **root** to that node.
 Example
```
        1         ← Depth = 0
       / \
      2   3       ← Depth = 1
     / \
    4   5         ← Depth = 2
```

Level
- The **level** of a node = depth + 1
Example
```
Level 1 →        1
                / \
Level 2 →      2   3
              / \
Level 3 →    4   5
```

Subtree
- Any node with its descendants is a **subtree**.
- Every node is a root of its own **subtree**.

Edge
- A connection between a **parent and a child**.
- In a tree with **n nodes**, there are always **(n - 1) edges**.

Path
- Route from one node to another

Types of trees

|S.No|Tree Type|Definition|Child Constraint|Real-World Applications / Usage|Balanced?|
|---|---|---|---|---|---|
|1|**General Tree**|Any tree where a node can have **any number of children**|Unlimited|File systems, organization charts|❌|
|2|**N-ary Tree**|Tree where each node has **at most N children**|≤ N|Parsing expressions, game trees|❌|
|3|**Binary Tree**|Each node has **at most 2 children** (left and right)|≤ 2|Foundation for many specialized trees|❌|
|4|**Full Binary Tree**|Each node has **0 or 2 children**|0 or 2|Expression trees, logical circuits|❌|
|5|**Complete Binary Tree**|All levels are filled except possibly the last, filled **left to right**|≤ 2|Heaps, scheduling algorithms|✅ (Mostly)|
|6|**Perfect Binary Tree**|All internal nodes have 2 children & all leaves at the **same level**|Exactly 2|Ideal tree models, theory|✅|
|7|**Balanced Binary Tree**|Height difference of left & right subtrees of every node is ≤ 1|≤ 2|Ensures better time complexity for operations|✅|
|8|**Skewed Tree**|Each node has **only one child**, forming a straight line|Exactly 1|Worst case for unbalanced trees|❌|
|9|**Degenerate Tree**|Another name for skewed tree (like a linked list)|1 per node|Worst-case BSTs|❌|
|10|**Binary Search Tree (BST)**|Binary Tree with values: `Left < Root < Right`|≤ 2|Fast lookup, insertion, deletion|❌|
|11|**AVL Tree**|Self-balancing BST with balance factor -1, 0, +1|≤ 2|Faster than unbalanced BST|✅ (Strict)|
|12|**Red-Black Tree**|Self-balancing BST using color properties (Red/Black rules)|≤ 2|Java TreeMap, Linux, C++ STL map/set|✅|
|13|**Heap (Min/Max)**|Complete Binary Tree where parent ≥ or ≤ children|≤ 2|Priority queues, heapsort, Dijkstra's algorithm|✅|
|14|**Trie (Prefix Tree)**|Multi-way tree for storing strings using character paths|Varies (e.g., 26 for a-z)|Auto-complete, spell check, T9 prediction|✅|
|15|**Ternary Tree**|Each node has at most **3 children**|≤ 3|Ternary search trees|❌|
|16|**Segment Tree**|Binary tree used for range query problems|≤ 2|Range sum/min/max in competitive programming|✅|
|17|**Fenwick Tree (BIT)**|Binary indexed tree for prefix sum problems|Array-based|Efficient prefix/range sum operations|✅|
|18|**B Tree**|Balanced M-ary search tree used in DBMS|Many|Disk storage, DB indexes (MySQL, PostgreSQL)|✅|
|19|**B+ Tree**|Like B Tree but data only in **leaf nodes**, used in DBMS|Many|Range queries in file systems and databases|✅|
|20|**Suffix Tree**|Compressed Trie for storing all suffixes of a string|Depends on input|String matching, bioinformatics|✅|

