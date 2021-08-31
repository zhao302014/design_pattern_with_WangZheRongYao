public class ForthNode implements Node{
      Node node;
      public void parse(Context context){
            node =new ForeNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}
