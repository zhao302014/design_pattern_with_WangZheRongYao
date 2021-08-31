package angle_factoryPattern;

import angle_factoryPattern.Hero;

public class Shooter extends Hero{
    String part1="          ÓÝ¼§Æ¤·ô£º";
    String part2="          Ù¤ÂÞÆ¤·ô£º";
    String part3="          ºóôàÆ¤·ô£º";
    String part4="          ......";
    public Shooter(String name,String [] a,String [] b,String [] c){
       this.name=name;
       for(int i=0;i<=a.length-1;i++){
           part1=part1+a[i]+'¡¢';
       }
       for(int j=0;j<=b.length-1;j++){
           part2=part2+b[j]+'¡¢';
       }
       for(int k=0;k<=c.length-1;k++){
           part3=part3+c[k]+'¡¢';
       }
       constitute=part1+'\n'+part2+'\n'+part3+'\n'+part4;
   } 
}

