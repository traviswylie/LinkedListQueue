# Programming Assignment 5

This repository is used as a way to provide to students
a starting point for CSC 220 Programming Assignment 5.

For this assignment you will implement a queue class using generics; the queue should be implemented by a linked list (only single links are needed). 
You must include `enqueue`, `dequeue`, `isEmpty` and `toString` methods, as specified in the `Queue` interface given in the starter code. 
The `toString` method should return a String object of the toString representations of all the items stored in the queue, 
with the head item leftmost in the string and the tail item rightmost;
each item's toString representation is to be followed by a newline character `\n`.

The starting point code distributed in this repository lays out the package structure of the project.  **Do not** change the package and class names nor any method signatures already provided.

Note that there are some simple JUnit tests provided to test the class as it is used to store several `Integer` objects.  
You will need to also provide several of your own tests; be sure to test your queue class on storing at least one other type of objects, such as `String`, or even something more complicated, such as `ArrayList<Integer>`.
As with Programming Assignment 4, you should write tests for "boundary" conditions, such as dequeuing on an empty queue and how your implementation handles enqueuing a null data item.

Your score will be based on the following rubric:

| Item | Possible score |
|------|---------------:|
| Good programming practices, including naming and indentation conventions, as well as proper use of access modifiers such as `private` and `protected`, are followed | 3 |
| **Every** file **AND** every method has an appropriate header comment | 2 |
| Package and class structure of original code is preserved, including the `Queue` interface | 2 |
| Your class implements the `Queue` interface correctly | 1 |
| Your implementation uses a linked list | 2 |
| The `enqueue` method works correctly | 2 |
| The `dequeue` method works correctly | 2 |
| The `toString` method works correctly | 2 |
| The `isEmpty` method works correctly | 2 |
| At least 4 extra tests of the of the enqueue and dequeue methods on `Integer` data, including special "boundary" cases. | 2 |
| At least 10 extra tests of the of the enqueue and dequeue methods on some other data type, including special "boundary" cases. | 5 |
| Total | 25|

Programming Assignment 5 is due Wednesday, May 8, at class time.  For this assignment you will have your own individual repository, so you can create several branches, if you wish, but only the **master** branch will be graded.
You will turn the assignment in by pushing all changes to your repository to GitHub. **Note Well:** any changes after the deadline will be ignored.
