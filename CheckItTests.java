import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CheckItTests {

    @Test
    public void predicateTrue(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = true;
        boolean b = false;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P is true", outContent.toString().trim());
        System.setOut(System.out);
    }

    @Test
    public void predicateFalse(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = false;
        boolean b = true;
        boolean c = false;
        CheckIt.checkIt(a,b,c);
        assertEquals("P isn't true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void clauseTrue(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = true;
        boolean b = true;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P is true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void clauseFalse(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = false;
        boolean b = false;
        boolean c = false;
        CheckIt.checkIt(a,b,c);
        assertEquals("P isn't true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void CACCTrue(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = true;
        boolean b = true;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P is true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void CACCFalse(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = false;
        boolean b = false;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P isn't true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void RACCPairOne(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = true;
        boolean b = true;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P is true", outContent.toString().trim());
        System.setOut(System.out);

    }

    @Test
    public void RACCPairTwo(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean a = false;
        boolean b = true;
        boolean c = true;
        CheckIt.checkIt(a,b,c);
        assertEquals("P is true", outContent.toString().trim());
        System.setOut(System.out);

    }






}
