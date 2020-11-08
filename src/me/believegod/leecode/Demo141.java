package me.believegod.leecode;

import me.believegod.leecode.support.ListNode;

/**
 * @ClassName Demo141
 * @Description TODO
 * @Author believeGod
 * @Date 2020/10/9 8:46
 * @Version 1.0
 */
public class Demo141 {

    /**
     * 判断单链表是否存在环，参考官网。两种答案，一种是简单的hashset另一种是快慢指针。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


}
