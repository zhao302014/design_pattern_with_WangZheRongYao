public class FiveNode implements Node{
      String [] word={"","","","","Le"};
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
                if(token.equalsIgnoreCase(word[4]))
                   System.out.print("��"); 
            }
            else{
                System.out.print("������~~~ʲô��û����ѩҩn�ѩ�");
            }        
     }
}
