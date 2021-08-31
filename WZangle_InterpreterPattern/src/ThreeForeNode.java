public class ThreeForeNode implements Node{
      Node three,foreFive;
      public void parse(Context context){
    	    three =new ThirdNode();
    	    foreFive=new ForeFiveNode();
    	    three.parse(context);
    	    foreFive.parse(context);
      }
      public void execute(){
    	  three.execute();
    	  foreFive.execute();
     }
}
