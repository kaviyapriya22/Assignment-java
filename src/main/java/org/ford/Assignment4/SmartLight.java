package org.ford.Assignment4;

public class SmartLight extends SmartDevice implements VoiceControl {

    public SmartLight(String name) {
        super(name);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart  Light  controlByVoice : " + command);
    }

    @Override
    public void turnOn(){
        System.out.println("Turning on the "+ " "+super.getName());
    }
}
