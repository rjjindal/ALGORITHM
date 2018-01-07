import java.util.*;

class Main{
  public static void main (String[] args)
     {
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();

         while(t-->0){
             int N = in.nextInt();
             int M = in.nextInt();

             Stack<Character> cherryStack = new Stack<>();
             for (int j = 0; j < N; j++)
             {
                 String cake = in.next();
                 char c[] = cake.toCharArray();
                 for (char item: c)
                 {
                     cherryStack.push(item);
                 }
             }
             char prev = cherryStack.pop();
             int cost = 0;
             while (!cherryStack.isEmpty())
             {
                 char cur = cherryStack.pop();
                 while(cur==prev)
                 {
                     if(cur=='R')
                     {
                         cost = cost + 5;
                         cur = 'G';
                     }
                     else
                     {
                         cost = cost + 3;
                         cur = 'R';
                     }
                 }
                 prev = cur;
             }

             System.out.println(cost);
         }
     }
}
