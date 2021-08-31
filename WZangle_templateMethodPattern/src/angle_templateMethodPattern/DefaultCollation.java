package angle_templateMethodPattern;

import angle_templateMethodPattern.SortTemplate;

import java.io.File;
public  class DefaultCollation extends SortTemplate{
	  DefaultCollation(File file){
           super(file);
      }
      public  boolean isSort(){
           return false; 
      }
}
