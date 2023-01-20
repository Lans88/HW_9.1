import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw91.Radio;

public class RadioTestParametrs {
    Radio radio = new Radio(25);
    @Test
    public void shouldeSetRadioStation(){
        radio.setCurrentRadioStation(20);
        int expected = 20;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioStationOverMax(){
        radio.setCurrentRadioStation(28);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioStationOverMin(){
        radio.setCurrentRadioStation(-7);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioPrev(){
        radio.setCurrentRadioStation(18);
        radio.prevStation();
        int expected = 17;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioPrevMin(){
        radio.setCurrentRadioStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioPrevOverMin(){
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        int expected = 24;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioNext(){
        radio.setCurrentRadioStation(21);
        radio.nextStation();
        int expected = 22;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioNextMax(){
        radio.setCurrentRadioStation(23);
        radio.nextStation();
        int expected = 24;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldeSetRadioPrevOverMax(){
        radio.setCurrentRadioStation(24);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
