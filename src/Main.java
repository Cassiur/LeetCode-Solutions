/**
 * @author Refty
 * @date 2025/8/16
 */
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev =  dummy;
        ListNode curr =  head;
        for(int i = 0; i < n; i++){
            curr = curr.next;
        }
        while(curr != null){
            prev = prev.next;
            curr = curr.next;
        }
        if(prev.next.next != null){
            prev.next =prev.next.next;
        }else{
            prev.next = curr;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}