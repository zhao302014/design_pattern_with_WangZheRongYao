public class TwoThreeNode implements Node{
      Node two,threeFore;
      public void parse(Context context){
    	    two =new TwiceNode();
    	    threeFore=new ThreeForeNode();
            two.parse(context);
            threeFore.parse(context);
      }
      public void execute(){
    	  two.execute();
    	  threeFore.execute();
     }
}