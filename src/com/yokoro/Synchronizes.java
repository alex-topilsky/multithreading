package com.yokoro;

import com.yokoro.SimpleClasses.SimplerToDoer;

public class Synchronizes {
    void start() throws Exception {
        SimplerToDoer simplerToDoer = new SimplerToDoer();
        new Thread(simplerToDoer).start();
        new Thread(simplerToDoer).start();
    }
}
