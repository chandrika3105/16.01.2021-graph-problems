'''BFS CODDE'''

class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> ar = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int u = q.poll();
            ar.add(u);
            for(int s: adj.get(u)){
                if(!vis[s]){
                    vis[s] = true;
                    q.add(s);
                }
            }
        }
        return ar;
    }
}
