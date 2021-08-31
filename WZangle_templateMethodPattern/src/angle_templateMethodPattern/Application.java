package angle_templateMethodPattern;

import angle_templateMethodPattern.DefaultCollation;
import angle_templateMethodPattern.NameSorting;
import angle_templateMethodPattern.SortTemplate;

import java.io.File;
public class Application{
     public static void main(String args[]) {
         File file=new File("HeroName.txt");
         SortTemplate  template=new NameSorting(file);
         System.out.println("以五个英雄为例");
         System.out.println("★★★★★★★★★★★");
         System.out.println("①名称排序：");
         template.showAllWords();
         System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
         template=new DefaultCollation(file);
         System.out.println("②默认排序：");
         template.showAllWords();
     }
}

