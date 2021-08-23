
class Solution {
    public int minDepth(TreeNode root) {
        int min = 0;
        if(root == null) return min;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);        
        while(!q.isEmpty()){
            min++;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left == null && current.right == null){                
                    return min;
                }
                if(current.left !=null)
                    q.offer(current.left);
                if(current.right != null)
                    q.offer(current.right);
        }
    }
        return min;
    }
}
