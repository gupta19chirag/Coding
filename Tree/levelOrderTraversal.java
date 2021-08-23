class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {         
        List<List<Integer>> bfs = new ArrayList<>();
        if(root == null) return bfs;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                currentLevel.add(current.val);
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
            
            bfs.add(currentLevel);
        }
        return bfs;
    }
}
