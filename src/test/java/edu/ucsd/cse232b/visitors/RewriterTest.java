package edu.ucsd.cse232b.visitors;

import org.junit.jupiter.api.Test;

public class RewriterTest {
    @Test
    void ex1() throws Exception {
        edu.ucsd.cse232b.rewriter.main.main(new String[]{"rewriter_tests/ex1.txt", "rewriter_tests/ex1_output.txt"});
    }

    @Test
    void ex2() throws Exception {
        edu.ucsd.cse232b.rewriter.main.main(new String[]{"rewriter_tests/ex2.txt", "rewriter_tests/ex2_output.txt"});
    }

}
