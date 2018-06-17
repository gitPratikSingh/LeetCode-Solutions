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
    
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<TreeNode> st = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
            return 0;
        
        root.val = 0;
        st.add(root);
        
        int flag = 1;
        int level = 0;
        while(st.isEmpty()==false){
            
            int size = st.size();
            int left = Integer.MAX_VALUE;
            int right = Integer.MIN_VALUE;
            
            while(size>0){
                
                TreeNode out = st.remove();
                size--;
                
                left = left>out.val? out.val:left;
                right = right<out.val? out.val:right;
                
                if(out.left != null){
                    st.add(out.left);
                    out.left.val = out.val*2;        
                }
                
                if(out.right != null){
                    st.add(out.right);
                    out.right.val = out.val*2 + 1;  
                }
                
            }
            
            int width = right - left + 1;
                    
            if(width > flag){
                flag = width;
            }
            
            level++;
        }
        
        return flag;
    }
}
