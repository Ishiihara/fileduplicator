package org.nansun.fileduplicator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class LargeFileFolder {

  @Test
  public void test1() {
    System.out.println("Calculate hash using first 1024 Bytes");
    Path dir = Paths.get(Config.ROOT_DIR + "/largeFileDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 1024);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

  @Test
  public void test2() {
    System.out.println("Calculate hash using first 1024000000 Bytes (about 1Gb)");
    Path dir = Paths.get(Config.ROOT_DIR + "/largeFileDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 1024000000);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

  @Test
  public void test3() {
    System.out.println("Calculate hash using complete file");
    Path dir = Paths.get(Config.ROOT_DIR + "/largeFileDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

}
