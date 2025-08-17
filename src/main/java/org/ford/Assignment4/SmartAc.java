package org.ford.Assignment4;

import javax.management.remote.SubjectDelegationPermission;

public class SmartAc extends SmartDevice implements VoiceControl {

    public SmartAc(String name) {
        super(name);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("SmartAc controlByVoice : " + command);
    }

    @Override
    public void turnOn(){
        System.out.println("Turning on the "+ " "+super.getName());
    }
}
