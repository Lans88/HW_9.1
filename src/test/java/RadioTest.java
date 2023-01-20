import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw91.Radio;

public class RadioTest {
    @Test
    public void shouldeSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(16);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(230);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldeSetToPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.plusVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToPlusVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.plusVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.minusVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinusVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}
