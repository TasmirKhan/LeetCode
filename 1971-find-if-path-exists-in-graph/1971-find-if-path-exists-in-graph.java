class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
         Map<Integer,List<Integer> > graph = new HashMap<>();
         for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
         }

         Set<Integer> visited = new HashSet<>();
         return dfs(s, d, graph, visited);
    }

    private boolean dfs(int s, int d, Map<Integer, List<Integer>> graph, Set<Integer> visited){
        if(s == d){ return true;}
        visited.add(s);
        for(int neighbor : graph.getOrDefault(s, new ArrayList<>())){
            if(!visited.contains(neighbor)){
                if(dfs(neighbor, d, graph, visited)){
                    return true;
                }
            }
        }

        return false;
    }
}