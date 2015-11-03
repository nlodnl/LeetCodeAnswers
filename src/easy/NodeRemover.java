package easy;

import java.util.List;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 */

public class NodeRemover {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return val + " --> " + next;
        }
    }

    public class Solution {
        private static final int IRRELEVANT_VAL = -1;

        public ListNode removeElements(ListNode head, int val) {
            ListNode tracker = new ListNode(IRRELEVANT_VAL);
            tracker.next = head;

            ListNode currentNode = tracker;

            while (currentNode.next != null) {
                if (nextNodeMatches(currentNode, val)) {
                    removeNextNode(currentNode);
                } else {
                    currentNode = currentNode.next;
                }
            }
            return tracker.next;
        }
    }

    private static void removeNextNode(ListNode nodeBeforeMatch) {
        nodeBeforeMatch.next = nodeBeforeMatch.next.next;
    }

    private static boolean nextNodeMatches(ListNode currentNode, int val) {
        return currentNode.next.val == val;
    }
}
