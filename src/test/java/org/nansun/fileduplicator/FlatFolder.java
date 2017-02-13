package org.nansun.fileduplicator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class FlatFolder {

  @Test
  public void test() {
    Path dir = Paths.get(Config.ROOT_DIR + "/flatDir");
    FindDupFiles obj = new FindDupFiles();
    obj.findDupByName(dir.toAbsolutePath());
    obj.findDupByFile(dir.toAbsolutePath(), "SHA-512", 0);

    System.out.println("Group by file name");
    obj.printResults(obj.getMap2name());
    System.out.println("Group by file content");
    obj.printResults(obj.getMap2file());
  }

}
