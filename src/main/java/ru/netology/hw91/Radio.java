package ru.netology.hw91;

public class Radio {
    public int minRadioStation;
    public int maxRadioStation;
    public int amountRadioStation;
    public int currentRadioStation;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentVolume = minVolume;

    public Radio(int amountRadioStation, int minRadioStation, int maxRadioStation){
        this.amountRadioStation = amountRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public int setToMinStation() {
        currentRadioStation = minRadioStation;
        return currentRadioStation;
    }

    public int setToMaxStation() {
        currentRadioStation = maxRadioStation;
        return currentRadioStation;
    }

    public int setToMinVolume() {
        return currentVolume;
    }

    public int setToMaxVolume() {
        currentVolume = maxVolume;
        return currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void minusVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume < minVolume){
            currentVolume = minVolume;
        }
    }

    public void prevStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation -= 1;
        }
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
    }

    public void nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }
}
