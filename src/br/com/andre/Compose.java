package br.com.andre;

import java.util.ArrayList;
import java.util.List;

public class Compose {
    private List<Container> containers;

    public Compose() {
        containers = new ArrayList<>();
    }

    public void addContainer(Container container){
        containers.add(container);
    }

    public void run(){
        containers.forEach((Container::run));
    }

    public int getTamanhoTempoReal(){
        int totalSize = 0;
        for (Container container: containers){
            totalSize += container.getSoftwaresSize();
        }
        return totalSize;
    }
}
