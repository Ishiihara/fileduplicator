package org.nansun.fileduplicator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class DiffHashAlgo {

  @Test
  public void test1() {
    System.out.println("Calculate hash using SHA-512 algorithm on flatDir");
    Path dir = Paths.get(Config.ROOT_DIR + "/flatDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

  @Test
  public void test2() {
    System.out.println("Calculate hash using SHA-1 algorithm on flatDir");
    Path dir = Paths.get(Config.ROOT_DIR + "/flatDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-1", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

  @Test
  public void test3() {
    System.out.println("Calculate hash using MD5 algorithm on flatDir");
    Path dir = Paths.get(Config.ROOT_DIR + "/flatDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "MD5", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

}
