package org.example.facade;

import org.example.facade.multipleSystem.AudioMixer;
import org.example.facade.multipleSystem.CodeFactory;
import org.example.facade.multipleSystem.VideoFile;

public class FacadeOperation {
    private AudioMixer audioMixer;
    private CodeFactory codeFactory;
    private VideoFile videoFile;

    public FacadeOperation() {
        this.audioMixer = new AudioMixer();
        this.codeFactory = new CodeFactory();
        this.videoFile = new VideoFile();
    }

    public void audioOperation() {
        audioMixer.audioMixer();
    }

    public void codeFactoryOperation() {
        codeFactory.codeFactory();
    }

    public void videoFileOperation() {
        videoFile.videoFile();
    }
}
