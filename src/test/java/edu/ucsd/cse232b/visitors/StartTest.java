package edu.ucsd.cse232b.visitors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StartTest {

    // TODO: make tests check if output is correct
    @Test
    void visible1() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/visible1.txt", "testfiles/visible1.xml"});
    }

    @Test
    void visible2() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/visible2.txt", "testfiles/visible2.xml"});
    }

    @Test
    void visible3() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/visible3.txt", "testfiles/visible3.xml"});
    }

    @Test
    @DisplayName("Find all persons in the play")
    void ex1() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/ex1.txt", "testfiles/ex1.xml"});
    }

    @Test
    @DisplayName("Find the scenes in which CAESAR speaks")
    void ex2() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/ex2.txt", "testfiles/ex2.xml"});
    }

    @Test
    @DisplayName("Find the acts containing some scene in which both CAESAR and BRUTUS speak")
    void ex3() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/ex3.txt", "testfiles/ex3.xml"});
    }

    @Test
    @DisplayName("Find the acts containing some scene in which both CAESAR and BRUTUS speak v2")
    void ex4() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/ex4.txt", "testfiles/ex4.xml"});
    }

    @Test
    @DisplayName("Find the acts in which CAESAR no longer appears")
    void ex5() throws Exception {
        edu.ucsd.cse232b.visitors.main.start(new String[]{"testfiles/ex5.txt", "testfiles/ex5.xml"});
    }


}