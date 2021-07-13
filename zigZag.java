class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> bfs = new ArrayList<>();
        if(root == null) return bfs;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentLevel = new LinkedList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode current = q.poll();
                if(leftToRight){
                    currentLevel.add(current.val);                
                }
                else{
                    currentLevel.add(0,current.val);               
                }                
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }                
            }
            bfs.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return bfs;
    }
}
