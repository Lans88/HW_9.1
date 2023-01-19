import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw91.Radio;

public class RadioTest {
    @Test
    public void shouldeSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldeSetToMinStation() {
        Radio radio = new Radio();
        radio.setToMinStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMaxStation() {
        Radio radio = new Radio();
        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinVolume() {
        Radio radio = new Radio();
        radio.setToMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.plusVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToPlusVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.plusVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.minusVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinusVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldeSetToMinusVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
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
        radio.setCurrentRadioStation(0);
        radio.nextStation();
        int expected = 1;
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


}
