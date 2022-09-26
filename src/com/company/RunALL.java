package com.company;

import java.util.concurrent.CyclicBarrier;

public class RunALL {
    public static void main(String[] args) {
        Linear.main(args);
        Branched.main(args);
        cyclic.main(args);
    }
}
