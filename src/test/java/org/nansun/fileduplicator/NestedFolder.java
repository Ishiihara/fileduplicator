package org.nansun.fileduplicator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class NestedFolder {

  @Test
  public void test1() {
    System.out.println("Find duplicate in a dir link whose original is in the same folder");
    Path dir = Paths.get(Config.ROOT_DIR + "/symbolicLinkDir/link");
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
    System.out.println("Find duplicate in a dir link whose original is its ancestor.");
    Path dir = Paths.get(Config.ROOT_DIR + "/symbolicLinkDir/original2/level2/link2Original2");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

  @Test
  public void test3() {
    System.out.println("Find duplicate in a dir that has links and their originals.");
    Path dir = Paths.get(Config.ROOT_DIR + "/symbolicLinkDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir);
    obj.findDupByFile(dir, "SHA-512", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

}
