package org.example.facade;

public class FacadeClient {
    public static void main(String[] args) {
        FacadeOperation facadeOperation = new FacadeOperation();

        facadeOperation.videoFileOperation();

        facadeOperation.codeFactoryOperation();

        facadeOperation.audioOperation();
    }
}
