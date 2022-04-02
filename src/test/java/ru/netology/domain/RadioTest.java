package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    void setter() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setterBorder() {

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setterBorder2() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {

        radio.setCurrentStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationBorder() {

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {

        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStationBorder() {

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {

        radio.currentVolume = 5;

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorder() {

        radio.currentVolume = 10;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {

        radio.currentVolume = 5;

        radio.volumeDown();

        int expected = 4;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownBorder() {

        radio.currentVolume = 0;

        radio.volumeDown();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
}