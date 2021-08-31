public class TwiceNode implements Node{
      Node node;
      public void parse(Context context){
            node =new TwoNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}