import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void hasPaperload(){
        assertEquals(100, printer.getPaperload());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(5,2);
        assertEquals(90, printer.getPaperload());
        assertEquals(40, printer.getToner());
    }

    @Test
    public void willNotPrintIfNotEnoughPaper(){
        printer.print(25,5);
        assertEquals(100, printer.getPaperload());
    }

    @Test
    public void canRefillPaperload(){
        printer.refillPaperload(5);
        assertEquals(105, printer.getPaperload());
    }

}
