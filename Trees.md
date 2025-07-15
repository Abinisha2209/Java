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