package angle_templateMethodPattern;

import angle_templateMethodPattern.DefaultCollation;
import angle_templateMethodPattern.NameSorting;
import angle_templateMethodPattern.SortTemplate;

import java.io.File;
public class Application{
     public static void main(String args[]) {
         File file=new File("HeroName.txt");
         SortTemplate  template=new NameSorting(file);
         System.out.println("�����Ӣ��Ϊ��");
         System.out.println("������������");
         System.out.println("����������");
         template.showAllWords();
         System.out.println("�����������������������������������������������������������������");
         template=new DefaultCollation(file);
         System.out.println("��Ĭ������");
         template.showAllWords();
     }
}

