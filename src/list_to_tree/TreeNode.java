package list_to_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 dw
 * @创建时间 2020/4/22
 * @描述
 */
public class TreeNode {

    private Integer id;
    private Integer parentId;
    private String name;
    List<TreeNode> children;

    TreeNode(){
        children = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
