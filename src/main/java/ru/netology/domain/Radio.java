package ru.netology.domain;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }
    // Переключение станций
    public void nextStation() {
        if (getCurrentStation() < 9) {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (getCurrentStation() > 0) {
            setCurrentStation(currentStation - 1);
        }
    }
    // Громкость
    public int currentVolume;

        public void increaseVolume() {

            if (currentVolume < 10) {
                currentVolume += 1;
            }
            return;
        }

        public void volumeDown() {

            if (currentVolume > 0) {
                currentVolume -= 1;
            }
            return;
        }
}