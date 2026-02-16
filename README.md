# 🎵 Doubly Linked List Implementation: Music Player

A Java implementation of a **Doubly Linked List** data structure, simulated as a Music Player playlist. This project demonstrates the efficiency of bidirectional traversal and tail pointers.

## 🚀 Features
* **Bidirectional Navigation:** Traverse the list forward (`next`) and backward (`prev`).
* **Tail Optimization:** Keeps track of the last node to allow **O(1)** insertion at the end, avoiding the classic O(n) traversal cost.
* **Music Player Logic:** Simulates real-world usage with `playNext()` and `playPrev()` functionalities with boundary checks.

## 🛠️ Data Structure Analysis

### Why Doubly Linked List?
In a standard Singly Linked List, you can only move in one direction. If you miss a node or need to go back (like a "Previous Song" button), you are stuck. A Doubly Linked List solves this by storing two references in each node:
1.  `next`: Points to the next node.
2.  `prev`: Points to the previous node.

### Time Complexity (Big O)

| Operation | Complexity | Explanation |
| :--- | :--- | :--- |
| **Access (Index)** | $O(n)$ | You still have to traverse from Head or Tail to find a specific index. |
| **Search** | $O(n)$ | You must check nodes one by one to find a value. |
| **Insertion (At End)** | **$O(1)$** | Thanks to the `tail` pointer, we append immediately without traversing. |
| **Insertion (At Beginning)**| **$O(1)$** | Just update the `head` pointer. |
| **Deletion (Head/Tail)** | **$O(1)$** | Unlinking the first or last node is instant. |

## 💡 When to Use (and When Not to)

### ✅ Use Cases (Pros)
* **Music/Video Players:** When you need Next/Previous functionality.
* **Browser History:** Navigating Back and Forward in web pages.
* **Undo/Redo Operations:** Moving back and forth between states.
* **Text Editors:** The cursor needs to move left and right efficiently.

### ❌ Limitations (Cons)
* **Memory Overhead:** Each node requires extra memory for the `prev` pointer (2x references compared to Singly Linked List).
* **Complexity:** Logic for insertion and deletion is slightly more complex as you must manage two pointers carefully to avoid broken links.

## 💻 Code Snippet (Node Structure)
```java
public class DLNode {
    int data;
    DLNode next; // Pointer to the next node
    DLNode prev; // Pointer to the previous node
}