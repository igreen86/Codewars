package trees;

import lombok.AllArgsConstructor;

import javax.management.Query;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.Objects.isNull;

public class isTreeEqualTask {
  @AllArgsConstructor
  static
//  static
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
  }
//    p         q
//    10        10
//  9    12   9    12

  static class TreeTask {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (isNull(p) && isNull(q)) {
        return true;
      }
      if (isNull(p) ^ isNull(q)) {
        return false;
      }

      if (p.val != q.val) {
        return false;
      } else {
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }
    }
  }

}

class Runner {
  private static final Logger log = Logger.getLogger("Runner.class");
  public static void main(String[] args) {
    isTreeEqualTask.TreeNode tree1 = new isTreeEqualTask.TreeNode(
            10,
            new isTreeEqualTask.TreeNode(9, null, null),
            new isTreeEqualTask.TreeNode(12, null, null)
    );

    isTreeEqualTask.TreeNode tree2 = new isTreeEqualTask.TreeNode(
            10,
            new isTreeEqualTask.TreeNode(9, null, null),
            new isTreeEqualTask.TreeNode(12, null, null)
    );

    isTreeEqualTask.TreeNode tree3 = null;

    isTreeEqualTask.TreeTask task = new isTreeEqualTask.TreeTask();
    Boolean isEqualTreeNode = task.isSameTree(tree1, tree2);
    log.info(String.valueOf(isEqualTreeNode));
  }
}
