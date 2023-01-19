package ru.netology.hw91;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
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
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

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
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
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
