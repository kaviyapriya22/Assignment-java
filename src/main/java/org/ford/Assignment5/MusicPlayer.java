package org.ford.Assignment5;

interface MusicPlayer {
    abstract void play(String fileName);

    default void stop(){
        System.out.println("music stopped");
    }


}
