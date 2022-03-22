package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setter() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        int expected = 5;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setterBorder() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setterBorder2() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        cond.nextStation();

        int expected = 6;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationBorder() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);

        cond.nextStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        cond.prevStation();

        int expected = 4;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStationBorder() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);

        cond.prevStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio cond = new Radio();

        cond.currentVolume = 5;

        cond.increaseVolume();

        int expected = 6;
        int actual = cond.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorder() {
        Radio cond = new Radio();

        cond.currentVolume = 10;

        cond.increaseVolume();

        int expected = 10;
        int actual = cond.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {
        Radio cond = new Radio();

        cond.currentVolume = 5;

        cond.volumeDown();

        int expected = 4;
        int actual = cond.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownBorder() {
        Radio cond = new Radio();

        cond.currentVolume = 0;

        cond.volumeDown();

        int expected = 0;
        int actual = cond.currentVolume;

        assertEquals(expected, actual);
    }
}