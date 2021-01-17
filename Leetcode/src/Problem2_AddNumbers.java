
public class Problem2_AddNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//Base case
		if(l1==null && l2==null) return new ListNode(0);



		ListNode dummyhead= new ListNode(0);

		ListNode curr=dummyhead;
		int carry=0;


		while(l1!=null || l2!=null)
		{
			int val1= l1!=null?l1.val:0;
			int val2= l2!=null?l2.val:0;

			int res=val1+val2+carry;
			carry=res/10;
			curr.next=new ListNode(res%10);
			curr=curr.next;
			if(l1!=null) l1=l1.next;
			if(l2!=null) l2=l2.next;

		}

		if(carry>0) curr.next=new ListNode(carry);

		return dummyhead.next;


	}
	
	
	
	
}
