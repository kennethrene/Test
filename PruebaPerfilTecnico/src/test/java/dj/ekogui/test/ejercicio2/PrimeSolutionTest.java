package dj.ekogui.test.ejercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PrimeSolution.class})
public class PrimeSolutionTest {

    private BufferedReader mockReader;
    private ByteArrayOutputStream outContent;

    @Before
    public void setupMock() throws Exception {
        this.mockReader = PowerMockito.mock(BufferedReader.class);
        PowerMockito.whenNew(BufferedReader.class).withAnyArguments().thenReturn(this.mockReader);

        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.outContent));
    }

    @Test
    public void getPrimesOnePrimeValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("4", "6", "8", "10", "127");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 1, lines.length);
        Assert.assertEquals("First line doesn't match", "127", lines[0].trim());
    }

    @Test
    public void getPrimesTwoPrimesValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("1", "7", "6", "10", "127");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 3, lines.length);
        Assert.assertEquals("First line doesn't match", "7", lines[0].trim());
        Assert.assertEquals("Second line doesn't match", "7", lines[1].trim());
        Assert.assertEquals("Third line doesn't match", "7 127", lines[2].trim());
    }

    @Test
    public void getPrimesThreePrimesValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("1", "2", "3", "4", "5");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 3, lines.length);
        Assert.assertEquals("First line doesn't match", "2", lines[0].trim());
        Assert.assertEquals("Second line doesn't match", "2 3", lines[1].trim());
        Assert.assertEquals("Third line doesn't match", "2 3 5", lines[2].trim());
    }

    @Test
    public void getPrimesFourPrimesValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("73", "191", "181", "2", "8");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 4, lines.length);
        Assert.assertEquals("First line doesn't match", "73", lines[0].trim());
        Assert.assertEquals("Second line doesn't match", "73 191", lines[1].trim());
        Assert.assertEquals("Third line doesn't match", "73 191 181", lines[2].trim());
        Assert.assertEquals("Fourth line doesn't match", "73 191 181 2", lines[3].trim());
    }

    @Test
    public void getPrimesFivePrimesValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("2", "5", "11", "17", "19");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 4, lines.length);
        Assert.assertEquals("First line doesn't match", "2", lines[0].trim());
        Assert.assertEquals("Second line doesn't match", "2 5", lines[1].trim());
        Assert.assertEquals("Third line doesn't match", "2 5 11", lines[2].trim());
        Assert.assertEquals("Fourth line doesn't match", "2 5 11 17 19", lines[3].trim());
    }

    @Test
    public void getPrimesNoPrimesValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("1", "4", "6", "8", "10");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 1, lines.length);
        Assert.assertTrue(lines[0].isEmpty());
    }

    @Test
    public void getPrimesDuplicatesPrimeValidTest() throws Exception {
        when(this.mockReader.readLine()).thenReturn("2", "2", "127", "10", "127");

        PrimeSolution.main(new String[]{});

        String[] lines = this.outContent.toString().trim().split("\r\n");
        Assert.assertEquals("Number of lines expected is invalid", 4, lines.length);
        Assert.assertEquals("First line doesn't match", "2", lines[0].trim());
        Assert.assertEquals("Second line doesn't match", "2 2", lines[1].trim());
        Assert.assertEquals("Third line doesn't match", "2 2 127", lines[2].trim());
        Assert.assertEquals("Fourth line doesn't match", "2 2 127 127", lines[3].trim());
    }

}
