public class ForeFiveNode implements Node{
      Node fore,five;
      public void parse(Context context){
    	    fore =new ForthNode();
    	    five=new FifthNode();
    	    fore.parse(context);
            five.parse(context);
      }
      public void execute(){
    	  fore.execute();
    	  five.execute();
     }
}

