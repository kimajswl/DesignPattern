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

    public void operation() {
        audioMixer.audioMixer();
        codeFactory.codeFactory();
        videoFile.videoFile();
    }
}
