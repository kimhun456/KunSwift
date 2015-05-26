package net.amicom.swift;

import java.io.File;

/**
 * Created by HyunJae on 15. 5. 26..
 */
public class SwiftThread extends Thread {


    ContainerDTO container;
    File file;

    SwiftThread(ContainerDTO container) {
        this.container = container;
    }

    SwiftThread(ContainerDTO container, File file) {
        this.container = container;
        this.file =file;
    }

    public void run() {

        // SWIFT서버와 연결하는 부분///

    }

}
