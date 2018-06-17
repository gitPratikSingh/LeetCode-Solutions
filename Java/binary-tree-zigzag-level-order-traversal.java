/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
            
        LinkedList<TreeNode> st = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
            return result;
        
        
        st.add(root);
        
        int flag = 0;
        while(st.isEmpty()==false){
            
            flag = flag==0?1:0;
            
            int size = st.size();
            List<Integer> temp = new ArrayList<>();
            
            while(size>0){
                
                TreeNode out = st.remove();
                temp.add(out.val);
                size--;
                
                if(out.left != null)
                    st.add(out.left);
                
                if(out.right != null)
                    st.add(out.right);
            }
            
            if(flag == 0){
                Collections.reverse(temp);
            }
            
            result.add(temp);
        }
        return result;
    }
}
