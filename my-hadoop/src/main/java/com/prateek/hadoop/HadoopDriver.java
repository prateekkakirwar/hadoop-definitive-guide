package com.prateek.hadoop;

import org.apache.hadoop.util.ProgramDriver;

import com.prateek.hadoop.*;

/**
 * A description of an example program based on its class and a 
 * human-readable description.
 */
public class HadoopDriver {
  
  public static void main(String argv[]){
    int exitCode = -1;
    ProgramDriver pgd = new ProgramDriver();
    try {
   
      pgd.addClass("MaxTemperature", MaxTemperature.class, 
                "A map/reduce program that counts # of movies for each year");
     
      
      pgd.driver(argv);
    }
    catch(Throwable e){
      e.printStackTrace();
    }
    
    System.exit(exitCode);
  }
}
	

