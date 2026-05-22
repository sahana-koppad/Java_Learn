package com.company.java.collection.set;
import java.util.TreeSet;
import java.util.*;

public class Treesetdemo {

    public static void main(String[] args) {

        // TreeSet is implemented using Red-Black Tree (Self-balancing BST)
        // It stores elements in SORTED ORDER automatically (based on compareTo or Comparator)

        TreeSet<Integer> set = new TreeSet<>();

        // =========================
        // 1. add()
        // =========================
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(30); // duplicate

        /*
         WHAT IT DOES:
         - Inserts element into TreeSet
         - Maintains sorted order automatically

         HOW IT WORKS INTERNALLY:
         - Compares new element with existing nodes using compareTo()
         - If result < 0 → go left
         - If result > 0 → go right
         - If result == 0 → duplicate → IGNORE (not inserted)
         - After insertion, tree is balanced using Red-Black Tree rules
        */

        System.out.println("TreeSet: " + set);

        // =========================
        // 2. size()
        // =========================
        System.out.println("Size: " + set.size());

        /*
         WHAT:
         - Returns number of elements in TreeSet

         HOW:
         - Just returns internal counter maintained by TreeSet
         - No traversal needed → O(1)
        */

        // =========================
        // 3. contains()
        // =========================
        System.out.println("Contains 20? " + set.contains(20));

        /*
         WHAT:
         - Checks if element exists

         HOW:
         - Starts from root of Red-Black Tree
         - Compares using compareTo()
         - Moves left/right like BST search
         - Time complexity: O(log n)
        */

        // =========================
        // 4. remove()
        // =========================
        set.remove(20);

        /*
         WHAT:
         - Deletes element from TreeSet

         HOW:
         - First search element using BST logic
         - Then remove node
         - Tree is rebalanced using rotations + recoloring (Red-Black Tree rules)
        */

        System.out.println("After remove: " + set);

        // =========================
        // 5. first()
        // =========================
        System.out.println("First: " + set.first());

        /*
         WHAT:
         - Returns smallest element

         HOW:
         - Go extreme left in tree (leftmost node)
        */

        // =========================
        // 6. last()
        // =========================
        System.out.println("Last: " + set.last());

        /*
         WHAT:
         - Returns largest element

         HOW:
         - Go extreme right in tree (rightmost node)
        */

        // =========================
        // 7. higher()
        // =========================
        System.out.println("Higher than 30: " + set.higher(30));

        /*
         WHAT:
         - Returns smallest element strictly > given value

         HOW:
         - Search in tree
         - While searching, track nearest greater node
        */

        // =========================
        // 8. lower()
        // =========================
        System.out.println("Lower than 30: " + set.lower(30));

        /*
         WHAT:
         - Returns largest element strictly < given value

         HOW:
         - BST traversal while tracking closest smaller value
        */

        // =========================
        // 9. ceiling()
        // =========================
        System.out.println("Ceiling of 25: " + set.ceiling(25));

        /*
         WHAT:
         - Returns element >= given value

         HOW:Lower than 30: 10

         - If exact match found → return it
         - Else track closest greater element while traversing tree
        */

        // =========================
        // 10. floor()
        // =========================
        System.out.println("Floor of 25: " + set.floor(25));

        /*
         WHAT:
         - Returns element <= given value

         HOW:
         - If exact match → return it
         - Else track closest smaller element
        */

        // =========================
        // 11. pollFirst()
        // =========================
        System.out.println("pollFirst: " + set.pollFirst());

        /*
         WHAT:
         - Removes and returns smallest element

         HOW:
         - Go to leftmost node
         - Remove it
         - Rebalance tree if needed
        */

        System.out.println("After pollFirst: " + set);

        // =========================
        // 12. pollLast()
        // =========================
        System.out.println("pollLast: " + set.pollLast());

        /*
         WHAT:
         - Removes and returns largest element

         HOW:
         - Go to rightmost node
         - Remove it
         - Rebalance tree if needed
        */

        System.out.println("After pollLast: " + set);

        // =========================
        // 13. iteration
        // =========================
        System.out.println("Iteration:");

        for (Integer val : set) {

            /*
             WHAT:
             - Iterates in sorted order

             HOW:
             - In-order traversal of Red-Black Tree
             - Left → Root → Right
            */

            System.out.print(val + " ");
        }

        System.out.println();

        // =========================
        // 14. descendingSet()
        // =========================
        System.out.println("Descending: " + set.descendingSet());

        /*
         WHAT:
         - Returns reverse sorted view

         HOW:
         - Traverses tree in reverse order (Right → Root → Left)
        */

        // =========================
        // 15. subSet()
        // =========================
        System.out.println("SubSet (10 to 50): " + set.subSet(10, 50));

        /*
         WHAT:
         - Returns elements between range

         HOW:
         - Uses tree traversal with boundary checks
         - Does NOT create new tree, only view
        */

        // =========================
        // 16. headSet()
        // =========================
        System.out.println("HeadSet (<40): " + set.headSet(40));

        /*
         WHAT:
         - All elements less than given value

         HOW:
         - Traverses left side of tree until limit
        */

        // =========================
        // 17. tailSet()
        // =========================
        System.out.println("TailSet (>=30): " + set.tailSet(30));

        /*
         WHAT:
         - All elements greater than or equal to value

         HOW:
         - Traverses right side starting from given node
        */

        // =========================
        // 18. clear()
        // =========================
        set.clear();

        /*
         WHAT:
         - Removes all elements

         HOW:
         - Clears root reference → garbage collector removes nodes
        */

        System.out.println("After clear: " + set);
    }
}
