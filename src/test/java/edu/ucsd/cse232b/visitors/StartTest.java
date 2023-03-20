package edu.ucsd.cse232b.visitors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StartTest {

    // TODO: make tests check if output is correct
    @Test
    void visible1() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex1.txt", "testfiles/visible1.xml"});
    }

    @Test
    void visible2() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/visible2.txt", "testfiles/visible2.xml"});
    }

    @Test
    void visible3() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/visible3.txt", "testfiles/visible3.xml"});
    }

    @Test
    @DisplayName("Test 1")
    void ex1() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex1.txt", "testfiles/ex1.xml"});
    }

    @Test
    @DisplayName("Test 2")
    void ex2() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex2.txt", "testfiles/ex2.xml"});
    }

    @Test
    @DisplayName("Test 3")
    void ex3() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex3.txt", "testfiles/ex3.xml"});
    }

    @Test
    @DisplayName("Test 4")
    void ex4() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex4.txt", "testfiles/ex4.xml"});
    }

    @Test
    @DisplayName("Test 5")
    void ex5() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex5.txt", "testfiles/ex5.xml"});
    }

    @Test
    @DisplayName("Test 6")
    void ex6() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex6.txt", "testfiles/ex6.xml"});
    }

    @Test
    @DisplayName("Test 7")
    void ex7() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex7.txt", "testfiles/ex7.xml"});
    }
    @Test
    @DisplayName("Test 8")
    void ex8() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex8.txt", "testfiles/ex8.xml"});
    }

    @Test
    @DisplayName("Test 9")
    void ex9() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex9.txt", "testfiles/ex9.xml"});
    }

    @Test
    @DisplayName("Test 10")
    void ex10() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex10.txt", "testfiles/ex10.xml"});
    }

    @Test
    @DisplayName("Test 11")
    void ex11() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex11.txt", "testfiles/ex11.xml"});
    }

    @Test
    @DisplayName("Test 12")
    void ex12() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/ex12.txt", "testfiles/ex12.xml"});
    }



    @Test
    @DisplayName("Test 13")
    void xq1() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/xq1.txt", "testfiles/xq1.xml"});
    }



    @Test
    @DisplayName("Test 14")
    void xq2() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/xq2.txt", "testfiles/xq2.xml"});
    }


    @Test
    @DisplayName("Test 15")
    void xq3() throws Exception {
        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/xq3.txt", "testfiles/xq3.xml"});
    }

//    @Test
//    @DisplayName("Test 16")
//    void xq4() throws Exception {
//        edu.ucsd.cse232b.visitors.main.startxq(new String[]{"testfiles/xq4.txt", "testfiles/xq4.xml"});
//    }


}