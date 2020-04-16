public class RemoveNthNodeFromLast {
	private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode left=head, right=head;
		 	while(n>0) {
		 		right = right.next;
		 		n--;
		 	}
		 	while(right!=null && right.next!=null) {
		 		right = right.next;
		 		left = left.next;
		 	}
		 	
		 	if(left == head && right==null) {
		 		head = head.next;
		 	}
		 	else {
		 		left.next = left.next.next;
		 	}
		 		
			return head; 
    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
