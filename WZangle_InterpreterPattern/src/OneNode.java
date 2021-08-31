public class OneNode implements Node{
      String [] word={"Zhong","","","",""};
      String token; 
      boolean boo;
      public void parse(Context context){
             token=context.nextToken();
             int i=0;
             for(i=0;i<word.length;i++){
                if(token.equalsIgnoreCase(word[i])){
                    boo=true;
                    break;
                }
             }
             if(i==word.length)
                boo=false;
      }
      public void execute(){
            if(boo){
                if(token.equalsIgnoreCase(word[0]))
                   System.out.print("жа"); 
            }       
     }
}