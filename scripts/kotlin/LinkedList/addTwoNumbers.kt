
/*
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
  val stack1 = LinkedList<Int>()
  val stack2 = LinkedList<Int>()
  var curr1 = l1
  var curr2 = l2
  while (curr1 != null || curr2 != null) {
    if (curr1 != null) stack1.push(curr1.`val`)
    if (curr2 != null) stack2.push(curr2.`val`)
    curr1 = curr1?.next
    curr2 = curr2?.next
  }
        
  var mem = 0
  val initNum = stack1.pop() + stack2.pop()
  if (initNum > 9) mem = 1
  var head = ListNode(initNum % 10)
        
  while (stack1.isNotEmpty() && stack2.isNotEmpty()) {
    val s = stack1.pop() + stack2.pop() + mem
    if (s > 9) mem = 1
    else mem = 0
    val newNode = ListNode(s % 10)
    newNode.next = head
    head = newNode
  }
        
  while (stack1.isNotEmpty()) {
    val s = stack1.pop() + mem
    if (s > 9) mem = 1
    else mem = 0
    val newNode = ListNode(s % 10)
    newNode.next = head
    head = newNode
  }
        
  while (stack2.isNotEmpty()) {
    val s = stack2.pop() + mem
    if (s > 9) mem = 1
    else mem = 0
    val newNode = ListNode(s % 10)
    newNode.next = head
    head = newNode
  }
        
  if (mem != 0) {
    val newNode = ListNode(1)
    newNode.next = head
    head = newNode
  }
  return head
}
