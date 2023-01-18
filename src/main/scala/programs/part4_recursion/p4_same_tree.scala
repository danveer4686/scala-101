package programs.part4_recursion

object p4_same_tree extends App {
  class TreeNode(var value: Int = 0, var left: TreeNode = null, var right: TreeNode = null)
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p==null && q==null) return true
    if (p==null || q==null) return false
    if (p.value != q.value) return false
    isSameTree(p.left,q.left) && isSameTree(p.right,q.right)
  }

}
