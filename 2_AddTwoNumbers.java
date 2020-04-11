
public class AddTwoNumbersLL {
	private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode l3 = new ListNode(0), head = l3;
        int carry = 0; boolean started = false;
        
        while(l1!=null && l2!=null) {
        	ListNode temp = new ListNode(0);

        	temp.val = (l1.val+ l2.val+carry)%10;
        	carry = (l1.val+ l2.val+carry)/10;
        	
        	l1 = l1.next;
        	l2 = l2.next;
        	
        	if(!started) {
        		l3 = temp;
                started = true;
                head = l3;
        	}
        	else {
        		l3.next = temp;
        		l3 = l3.next;
        	}
        }
        
        if(l1==null) {
        	while(l2!=null) {
        		ListNode temp = new ListNode(0);
        		temp.val = (l2.val+carry)%10;
        		carry = (l2.val+carry)/10;
        		l2 = l2.next;
        		l3.next = temp;
        		l3 = l3.next;
        	}
        }
        else {
        	while(l1!=null) {
        		ListNode temp = new ListNode(0);
        		temp.val = (l1.val+carry)%10;
        		carry = (l1.val+carry)/10;
        		l1 = l1.next;
        		l3.next = temp;
        		l3 = l3.next;
        }
        }
        
        if (carry != 0)
        {
            ListNode temp = new ListNode(carry);
            l3.next = temp;
            temp.next = null;
        }
        else{
        l3.next = null;
        }
        return head;
}
    
}
