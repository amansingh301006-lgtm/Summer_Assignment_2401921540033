class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        
        ListNode back = head;
        ListNode front = head;

        while (front != null && front.next != null) {
            back = back.next;
            front = front.next.next;
        }

    
        ListNode prev = null;
        while (back != null) {
            ListNode nextNode = back.next;
            back.next = prev;
            prev = back;
            back = nextNode;
        }

        ListNode first = head;
        ListNode last = prev;
        while (last!= null) {
            if (first.val != last.val) {
                return false;
            }
            first = first.next;
            last = last.next;
        }

        return true;
    }
}
