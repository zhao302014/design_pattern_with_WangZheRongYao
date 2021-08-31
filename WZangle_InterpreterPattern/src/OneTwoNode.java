public class OneTwoNode implements Node{
      Node one,twoThree;
      public void parse(Context context){
            one =new FirstNode();
            twoThree=new TwoThreeNode();
            one.parse(context);
            twoThree.parse(context);
      }
      public void execute(){
           one.execute();
           twoThree.execute();
     }
}