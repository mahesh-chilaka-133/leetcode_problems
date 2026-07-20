import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(ListNode list: lists) {
            if (list != null) {
                pq.offer(list);

            }
        }

        ListNode  dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(!pq.isEmpty()) {

            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;

            if(node.next != null) {
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }
}