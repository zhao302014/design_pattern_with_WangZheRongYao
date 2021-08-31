public class ThirdNode implements Node{
      Node node;
      public void parse(Context context){
            node =new ThreeNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}
