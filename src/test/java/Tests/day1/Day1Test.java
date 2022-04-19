package Tests.day1;

import Tests.AbstractTest;
import day1.Task1;
import day1.Task2;
import day1.Task3;
import day1.Task4;
import day1.Task5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test extends AbstractTest {

    @Test
    public void Task1() {
        final String resultString = "JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA ";
        Task1.main(new String[0]);
        assertEquals(resultString, getOutput(), "The number of repetitions of the word \"JAVA\" is not equal to ten lines");
    }

    @Test
    public void Task2() {
        final String resultString = "JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA ";
        Task2.main(new String[0]);
        assertEquals(resultString, getOutput(), "The number of repetitions of the word \"JAVA\" is not equal to ten lines");
    }

    @Test
    public void Task3() {
        final String resultString = "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator();
        Task3.main(new String[0]);
        assertEquals(resultString, getOutput(), "The number of repetitions of the word \"JAVA\" is not equal to ten lines");
    }

    @Test
    public void Task4() {
        final String resultString =
                "Olympic games 1980 year" + System.lineSeparator() +
                        "Olympic games 1984 year" + System.lineSeparator() +
                        "Olympic games 1988 year" + System.lineSeparator() +
                        "Olympic games 1992 year" + System.lineSeparator() +
                        "Olympic games 1996 year" + System.lineSeparator() +
                        "Olympic games 2000 year" + System.lineSeparator() +
                        "Olympic games 2004 year" + System.lineSeparator() +
                        "Olympic games 2008 year" + System.lineSeparator() +
                        "Olympic games 2012 year" + System.lineSeparator() +
                        "Olympic games 2016 year" + System.lineSeparator() +
                        "Olympic games 2020 year" + System.lineSeparator();
        Task4.main(new String[0]);
        assertEquals(resultString, getOutput(), "Incorrect number of lines or an error in the text");
    }

    @Test
    public void Task5() {
        final String resultString =
                "Olympic games 1980 year" + System.lineSeparator() +
                        "Olympic games 1984 year" + System.lineSeparator() +
                        "Olympic games 1988 year" + System.lineSeparator() +
                        "Olympic games 1992 year" + System.lineSeparator() +
                        "Olympic games 1996 year" + System.lineSeparator() +
                        "Olympic games 2000 year" + System.lineSeparator() +
                        "Olympic games 2004 year" + System.lineSeparator() +
                        "Olympic games 2008 year" + System.lineSeparator() +
                        "Olympic games 2012 year" + System.lineSeparator() +
                        "Olympic games 2016 year" + System.lineSeparator() +
                        "Olympic games 2020 year" + System.lineSeparator();
        Task5.main(new String[0]);
        assertEquals(resultString, getOutput(), "Incorrect number of lines or an error in the text");
    }

}
