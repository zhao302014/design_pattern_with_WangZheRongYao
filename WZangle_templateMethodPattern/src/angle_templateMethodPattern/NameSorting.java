package angle_templateMethodPattern;

import java.util.*;
import java.io.*;

public  class NameSorting extends SortTemplate{
	  NameSorting(File file){
           super(file);
      }
      public  void sort(String [] word){
           Arrays.sort(word); 
      }
}
