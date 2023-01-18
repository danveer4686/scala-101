package programs.part4_recursion

object p4_invert_binary_tree extends App {
  class TreeNode(var value: Int = 0, var left: TreeNode = null, var right: TreeNode = null)
  def invertTree(root: TreeNode): TreeNode = {
    if (root==null) return null
    else {
      val temp = root.left
      root.left = invertTree(root.right)
      root.right = invertTree(temp)
    }
    root
  }

  def invertBinaryTree(root:TreeNode):TreeNode = {
    if (root==null) return null
    else {
      val temp = root.left
      root.left = invertBinaryTree(root.right)
      root.right = invertBinaryTree(temp)
    }
    root
  }

}
