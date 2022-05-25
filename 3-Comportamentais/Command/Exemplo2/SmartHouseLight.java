package org.marianaduarte.command;

public class SmartHouseLight {
    private boolean isOn = false;
    private double intensity = 50;
    public String name;

    public SmartHouseLight(String name){
        this.name = name;
    }

    public String getPowerstatus(){
        if(this.isOn){
            return "ON";
        }
        return "OFF";
    }

    public boolean turnLightOn(){
        this.isOn = true;
        System.out.println(this.name+" agora esta "+this.getPowerstatus());
        return  this.isOn;
    }

    public boolean turnLightOff(){
        this.isOn = false;
        System.out.println(this.name+" agora esta "+this.getPowerstatus());
        return  this.isOn;
    }

    public double increaseIntensity(){
        if(this.intensity >= 100) {
            return this.intensity;}
        this.intensity += 1;
        return this.intensity;
    }

    public double decreaseIntensity(){
        if(this.intensity <= 0) {
            return this.intensity;}
        this.intensity -= 1;
        return this.intensity;
    }
}
