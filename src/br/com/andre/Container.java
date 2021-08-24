package br.com.andre;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Software> softwares;
    private boolean running;

    public Container() {
        this.softwares = new ArrayList<>();
        this.running = false;
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    public void stop(){
        this.running = false;
    }

    public void run(){
        this.running = true;
    }

    public int getSoftwaresSize() {
        int size = 0;
        if (this.running) {
            for (Software software: this.softwares){
                size += software.getSize();
            }
        }
        return size;
    }
}
