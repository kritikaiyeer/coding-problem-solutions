// Given a graph and a source and a destination node find if there exists path
// between two of them.
import java.util.*;

public class GraphProblem1{
    
    public static boolean hasPath(Map<String, List<String>> graph,String source, String destination){
        if(source.equals(destination)){
            return true;
        }
        for(String neighbour: graph.get(source)){
            if(hasPath(graph, neighbour,destination)){
                return true;
            }
        }
        return false;
    }

     public static void main(String []args){
        Map<String, List<String>> graph = new HashMap<String, List<String>>();
        graph.put("a", new ArrayList<>(Arrays.asList("b", "c")));
        graph.put("b", new ArrayList<>(Arrays.asList("d")));
        graph.put("c", new ArrayList<>(Arrays.asList("e")));
        graph.put("d", new ArrayList<>(Arrays.asList("f")));
        graph.put("e", new ArrayList<>());
        graph.put("f", new ArrayList<>());
        
        System.out.print(hasPath(graph, "a","d"));

     }
}
