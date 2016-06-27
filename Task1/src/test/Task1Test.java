package test;

import java.util.ArrayList;
import java.util.List;

public class Task1Test {
  private static final long MEGABYTE = 1024L * 1024L;

  public static long bytesToMegabytes(long bytes) {
	  return bytes / MEGABYTE;
  }

  public static void main(String[] args) {
    List<Person> list = new ArrayList<Person>();
    for (int i = 0; i <= 100000; i++) {
    	Person person = new Person(i, "Thomas"+i, "Anderson"+i, 20+(i/1000));
    	list.add(person);
    	System.out.println(i + ": " + person);
    }

    Runtime runtime = Runtime.getRuntime();

    //runtime.gc();
    
    // Calculate the used memory
    long memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: "
        + bytesToMegabytes(memory));
  }
}
