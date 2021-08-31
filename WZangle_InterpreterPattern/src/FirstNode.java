public class FirstNode implements Node{
      Node node;
      public void parse(Context context){
            node =new OneNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}