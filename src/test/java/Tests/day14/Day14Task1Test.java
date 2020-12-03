//package Tests.day14;
//
//import Tests.AbstractTest;
//import day14.Task1;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.io.File;
//
//class Day14Task1Test extends AbstractTest {
//
//    @Test
//    void sumDigits1() {
//        File file = new File("src/test/resources/D14T1_1.txt");
//        Task1.printSumDigits(file);
//        Assertions.assertEquals(10 + System.lineSeparator(), getOutput(), "Файл содержит: 1 1 1 1 1 1 1 1 1 1");
//    }
//
//    @Test
//    void sumDigits2() {
//        File file = new File("src/test/resources/D14T1_2.txt");
//        Task1.printSumDigits(file);
//        Assertions.assertEquals(-10 + System.lineSeparator(), getOutput(), "Файл содержит: -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
//    }
//}