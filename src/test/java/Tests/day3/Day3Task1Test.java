package Tests.day3;

import Tests.AbstractTest;
import day3.CityOfCountry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task1Test extends AbstractTest {

    @Test
    public void Moscow() {
        setInput("Warsaw\nStop\n");
        CityOfCountry.main(new String[0]);
        assertEquals("Poland" + System.lineSeparator(), getOutput(), "Warsaw");
    }

    @Test
    public void Milan() {
        setInput("Milan\nStop\n");
        CityOfCountry.main(new String[0]);
        assertEquals("Italy" + System.lineSeparator(), getOutput(), "Milan");
    }

    @Test
    public void London() {
        setInput("Lviv\nStop\n");
        CityOfCountry.main(new String[0]);
        assertEquals("Ukraine" + System.lineSeparator(), getOutput(), "Lviv");
    }

    @Test
    public void Munich() {
        setInput("Cracow\nStop\n");
        CityOfCountry.main(new String[0]);
        assertEquals("Poland" + System.lineSeparator(), getOutput(), "Cracow");
    }

    @Test
    public void Other() {
        setInput("New York\nStop\n");
        CityOfCountry.main(new String[0]);
        assertEquals("Another country" + System.lineSeparator(), getOutput(), "New York");
    }

}
