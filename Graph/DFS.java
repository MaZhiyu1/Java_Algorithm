import java.util.HashSet;
import java.util.Stack;

public class DFS {

    public static void dfs(Node node){
        if(node==null) return;
        Stack<Node>stack=new Stack<>();
        HashSet<Node>set=new HashSet<>();

        stack.push(node);
        set.add(node);
        System.out.print(node.value+" ");
        while(!stack.isEmpty()){
            Node cur = stack.pop();
            for(Node next : cur.nodes){
                if(!set.contains(next)){
                    stack.push(cur);
                    stack.push(next);
                    set.add(next);
                    System.out.print(next.value);
                    break;
                }
            }

        }


    }
}
