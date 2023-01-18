import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw91.Radio;

public class RadioTest {
    Radio radio = new Radio(30, 0, 29);
    @Test
    public void shouldeSetRadioStation() {
        radio.currentRadioStation = 5;
        int expected = 5;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldeSetVolume() {
        radio.currentVolume = 2;
        int expected = 2;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetToMinStation(){
        radio.setToMinStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToMaxStation(){
        radio.setToMaxStation();
        int expected = 29;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToMinVolume(){
        radio.setToMinVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToMaxVolume(){
        radio.setToMaxVolume();
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToPlusVolume(){
        radio.currentVolume = 78;
        radio.plusVolume();
        int expected = 79;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToPlusVolumeMax(){
        radio.currentVolume = 100;
        radio.plusVolume();
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToPlusVolumeOverMax(){
        radio.currentVolume = 102;
        radio.plusVolume();
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetToMinusVolume(){
        radio.currentVolume = 100;
        radio.minusVolume();
        int expected = 99;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToMinusVolumeMin(){
        radio.currentVolume = 1;
        radio.minusVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToMinusVolumeOverMin(){
        radio.currentVolume = -2;
        radio.minusVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetToPrevStationMin(){
        radio.currentRadioStation = 0;
        radio.prevStation();
        int expected = 29;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToPrevStation(){
        radio.currentRadioStation = 15;
        radio.prevStation();
        int expected = 14;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToNextStation(){
        radio.currentRadioStation = 0;
        radio.nextStation();
        int expected = 1;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldeSetToNextStationMax(){
        radio.currentRadioStation = 29;
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);

    }


}
