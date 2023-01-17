package ru.netology.hw91;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int setToMinStation() {
        currentRadioStation = 0;
        return currentRadioStation;
    }

    public int setToMaxStation() {
        currentRadioStation = 9;
        return currentRadioStation;
    }

    public int setToMinVolume() {
        currentVolume = 0;
        return currentVolume;
    }

    public int setToMaxVolume() {
        currentVolume = 10;
        return currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        if (currentVolume < 0){
            currentVolume = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }
}
