public class LlIsPalindromeOrNot {
    
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {

            return true;

        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode newHead = reverse(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        while (second != null) {

            if (first.val != second.val) {

                reverse(newHead);
                return false;

            }
            first = first.next;
            second = second.next;
        }
        return true;
        
    }

    public ListNode reverse(ListNode head) {

        ListNode temp = head;
        ListNode previous = null;
        ListNode front;

        while (temp != null) {

            front = temp.next;
            temp.next = previous;
            previous = temp;
            temp = front;

        }
        return previous;  
    }

}
