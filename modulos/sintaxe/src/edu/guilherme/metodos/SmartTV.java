package edu.guilherme.metodos;

public class SmartTV {

    boolean isOn = false;
    int channel = 1;
    int volume = 10;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        channel = 1;
        volume = 10;
    }

    public void raiseVolume() {
        volume++;
    }

    public void lowerVolume() {
        volume--;
    }

    public void raiseChannel() {
        channel++;
    }

    public void lowerChannel() {
        channel--;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

}
