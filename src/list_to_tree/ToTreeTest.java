package list_to_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @创建人 dw
 * @创建时间 2020/4/22
 * @描述
 */
public class ToTreeTest {

    public static void main(String[] args) {

        List<TreeNode> treeNodes = new ArrayList<>();
        TreeNode treeNode1 = new TreeNode();
        treeNode1.setId(1);
        treeNode1.setParentId(0);
        treeNode1.setName("1");

        TreeNode treeNode2 = new TreeNode();
        treeNode2.setId(2);
        treeNode2.setParentId(0);
        treeNode2.setName("2");
        TreeNode treeNode3 = new TreeNode();
        treeNode3.setId(3);
        treeNode3.setParentId(1);
        treeNode3.setName("3");
        TreeNode treeNode4 = new TreeNode();
        treeNode4.setId(4);
        treeNode4.setParentId(2);
        treeNode4.setName("4");
        TreeNode treeNode5 = new TreeNode();
        treeNode5.setId(5);
        treeNode5.setParentId(0);
        treeNode5.setName("5");
        TreeNode treeNode6 = new TreeNode();
        treeNode6.setId(6);
        treeNode6.setParentId(3);
        treeNode6.setName("6");
        treeNodes.add(treeNode1);
        treeNodes.add(treeNode2);
        treeNodes.add(treeNode3);
        treeNodes.add(treeNode4);
        treeNodes.add(treeNode5);
        treeNodes.add(treeNode6);

        List<TreeNode> treeNodeList = rebuildList2Tree(treeNodes);
        System.out.println(treeNodeList.toString());
    }

    /**
     * 使用递归方法建树
     *
     * @param treeNodes
     * @return
     */
    private static List<TreeNode> rebuildList2Tree(List<TreeNode> treeNodes) {
        boolean existRootNode = false;
        List<TreeNode> newTree = new ArrayList<>();//初始化一个新的列表
        for (TreeNode treeNode : treeNodes) {
            if (isRootNode(treeNode, treeNodes)) {//选择根节点数据开始找儿子
                existRootNode = true;
                newTree.add(findChildren(treeNode, treeNodes));
            }
        }
        if(!existRootNode){//也可能大家都是根节点
            return treeNodes;
        }
        return newTree;
    }

    /**
     * 判断节点是否是根节点
     * @param checkNode
     * @param treeNodes
     * @return
     */
    private static boolean isRootNode(TreeNode checkNode, List<TreeNode> treeNodes) {
        for (TreeNode treeNode : treeNodes) {
            if (checkNode.getParentId().equals(treeNode.getId())) {//判断checkNode是不是有爸爸
                return  false;
            }
        }
        return true;
    }


    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    private static TreeNode findChildren(TreeNode parentNode, List<TreeNode> treeNodes) {
        List<TreeNode> children = parentNode.getChildren();
        for (TreeNode it : treeNodes) {
            if (parentNode.getId().equals(it.getParentId())) {//找儿子，判断parentNode是不是有儿子
                children.add(findChildren(it, treeNodes));
            }
        }
        return parentNode;
    }
}
