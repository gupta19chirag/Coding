class Solution {
    public int maxDepth(TreeNode root) {
        int max = 0;
        if(root == null) return max;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);        
        while(!q.isEmpty()){
            max++;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();                
                if(current.left !=null)
                    q.offer(current.left);
                if(current.right != null)
                    q.offer(current.right);
        }
    }
        return max;
    }
}
