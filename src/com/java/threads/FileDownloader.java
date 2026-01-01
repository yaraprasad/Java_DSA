package com.java.threads;

public class FileDownloader extends  Thread{

    private String fileName;

    public FileDownloader(String fileName){
        this.fileName=fileName;
    }

    @Override
    public void run() {
        try{
            System.out.println("Starting download of "+fileName);
            Thread.sleep(2000);
            System.out.println("Download completed for "+fileName);
        }catch (InterruptedException e){
            System.out.println("Download interrupted for "+fileName);
        }
    }
}
