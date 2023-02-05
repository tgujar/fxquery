package edu.ucsd.cse232b.visitors;

import org.junit.jupiter.api.Test;

class StartTest {
  @Test
  void simple() throws Exception {
    edu.ucsd.cse232b.visitors.main.start(new String[] {"testfiles/simple.txt","testfiles/simple.xml"});
  }
}