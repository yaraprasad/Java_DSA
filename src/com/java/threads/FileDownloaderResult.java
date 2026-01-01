package com.java.threads;

public class FileDownloaderResult {
    public static void main(String[] args) {

        FileDownloader file1 = new FileDownloader("File1.jpg");
        FileDownloader file2 = new FileDownloader("File2.jpg");
        FileDownloader file3 = new FileDownloader("File3.jpg");

        file1.start();
        file2.start();
        file3.start();
    }
}
