public class FifthNode implements Node{
      Node node;
      public void parse(Context context){
            node =new FiveNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}