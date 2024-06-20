package edu.guilherme.metodos;

public class SmartControl {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.turnOn();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.raiseVolume();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.lowerVolume();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.raiseChannel();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.lowerChannel();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.changeChannel(13);

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.turnOff();

        System.out.println(smartTV.isOn ? "TV LIGADA!": "TV DESLIGADA!");
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);
    }
}
