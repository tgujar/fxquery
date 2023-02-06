package edu.ucsd.cse232b.visitors;

import org.junit.jupiter.api.Test;

class StartTest {
  @Test
  void visible1() throws Exception {
    edu.ucsd.cse232b.visitors.main.start(new String[] {"testfiles/visible1.txt","testfiles/visible1.xml"});
  }

  @Test
  void visible2() throws Exception {
    edu.ucsd.cse232b.visitors.main.start(new String[] {"testfiles/visible2.txt","testfiles/visible2.xml"});
  }

  @Test
  void visible3() throws Exception {
    edu.ucsd.cse232b.visitors.main.start(new String[] {"testfiles/visible3.txt","testfiles/visible3.xml"});
  }
}