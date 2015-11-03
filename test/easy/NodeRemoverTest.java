package easy;

public class NodeRemoverTest {

    public static void main(String[] args) {
        NodeRemover.Solution s = new NodeRemover().new Solution();
        NodeRemover.ListNode head = new NodeRemover.ListNode(1);
        NodeRemover.ListNode second = new NodeRemover.ListNode(2);
        NodeRemover.ListNode third = new NodeRemover.ListNode(3);
        NodeRemover.ListNode fourth = new NodeRemover.ListNode(1);
        head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println("Before: " + head);
        head = s.removeElements(head, 1);
        System.out.println("After: " + head);
    }
}
