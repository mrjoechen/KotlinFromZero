package tailrecursive

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020-01-11 17:51
 * @Created by chenqiao
 */


fun main() {


    val MAX_NODE_COUNT = 10

    val head = ListNode(0)

    var p = head

    for (i in 1..MAX_NODE_COUNT){
        p.next = ListNode(i)
        p = p.next!!
    }

    println(findListNode(head, 5))



}


data class ListNode(val value: Int){
    var next: ListNode? = null
}

tailrec fun findListNode(head: ListNode?, value: Int):ListNode?{
    head?:return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

//非尾递归
tailrec fun factorial(i: Long): Long{
    if (i == 0L) return 1
    return i * (i - 1)
}


data class TreeNode(val value: Int){
    var leftNode: TreeNode? = null
    var rightNode: TreeNode? = null
}


//非尾递归
tailrec fun findTreeNode(root: TreeNode?, value: Int): TreeNode?{
    root?:return null
    if (root.value == value) return root
    return findTreeNode(root.leftNode, value)?: findTreeNode(root.rightNode, value)
}