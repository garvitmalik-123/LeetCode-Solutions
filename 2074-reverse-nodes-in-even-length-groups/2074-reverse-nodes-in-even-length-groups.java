class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode prev = head;
        int groupSize = 2;

        while (prev.next != null) {
            ListNode curr = prev.next;
            int count = 0;

            while (curr != null && count < groupSize) {
                curr = curr.next;
                count++;
            }
            if (count % 2 == 0) {

                ListNode groupStart = prev.next;
                ListNode groupEnd = prev;

                for (int i = 0; i < count; i++) {
                    groupEnd = groupEnd.next;
                }

                ListNode nextGroup = groupEnd.next;
                ListNode p = groupStart;
                ListNode q = nextGroup;

                for (int i = 0; i < count; i++) {
                    ListNode temp = p.next;
                    p.next = q;
                    q = p;
                    p = temp;
                }
                prev.next = q;
                prev = groupStart;

            } else {
                for (int i = 0; i < count; i++) {
                    prev = prev.next;
                }
            }

            groupSize++;
        }

        return head;
    }
}