import java.math.BigInteger;

public class Add_Two_Numbers_2 {
    public static void main(String[] args) {
        ListNode l2 = new ListNode(5, new ListNode(4, new ListNode(9)));
        ListNode l1 = new ListNode(5, new ListNode(6));
        addTwoNumbers(l1, l2);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        while (l1.next != null || l2.next != null) {
            if (l2.next != null) {
                val2.append(l2.val);
                l2 = l2.next;
            }
            if (l1.next != null) {
                val1.append(l1.val);
                l1 = l1.next;
            }
        }
        val1.append(l1.val);
        val2.append(l2.val);
        val1.reverse();
        val2.reverse();
        char[] chars = String.valueOf(new BigInteger(val1.toString()).add(new BigInteger(val2.toString()))).toCharArray();
        ListNode l5 = null;
        for (int i = 0; i < chars.length; i++) {
            l5 = new ListNode(Character.getNumericValue(chars[i]), l5);
        }
        return l5;
    }
}