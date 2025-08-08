# TextEditorProject
Simple Java Text Editor with Undo/Redo using Doubly Linked List. Console-based, memory-efficient, and beginner-friendly.

# 📝 Text Editor with Undo/Redo Functionality

A simple text editor built in **Java** that supports basic text editing with **Undo** and **Redo** functionality.  
The project uses a **custom Doubly Linked List** to manage the history of text states, allowing users to revert or reapply changes efficiently.

---

## 📌 Features

- ✍️ **Text Writing**: Append new text to the current content.
- ↩️ **Undo Operation**: Revert to the previous state.
- ↪️ **Redo Operation**: Reapply the last undone change.
- 🧠 **History Tracking**: Maintains a complete history of all text versions.

---

## 🧱 Implementation Details

### 1. 🧮 Data Structure – `DoubleLinkedList.java`

Custom implementation of a doubly linked list that:

- Stores each version of the text as a node.
- Supports efficient addition and removal from both ends.
- Enables quick navigation through historical states.
- Provides **O(1)** complexity for add/remove operations at the ends.

---

### 2. ⚙️ Text Editor Core – `TextEditor.java`

This class:

- Maintains the **current text state**.
- Manages two internal lists:
  - history: stores the sequence of text changes.
  - redo: stores states that have been undone.
- Implements:
  - write(): Appends new text and updates history.
  - undo(): Reverts to the previous state.
  - redo(): Reapplies the most recent undone change.

---

### 3. 🖥️ Console Interface – `Main.java`

Simple user interface for interacting with the editor:

- Add new text (supports multi-word input).
- Undo the last change.
- Redo a previously undone change.
- View the current text after each operation.

---
 

