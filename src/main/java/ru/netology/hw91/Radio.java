package ru.netology.hw91;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;


    public Radio(){
        maxStation = 9;

    }
    public Radio(int amountRadioStation){
        maxStation = amountRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void plusVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 100;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        } else {
            currentVolume = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void nextStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }
}
