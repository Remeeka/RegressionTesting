package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {

        // Store original output
        PrintStream originalOut = System.out;

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call Main method
        Main.main(new String[]{});

        // Check output
        assertEquals(
                "Hello and welcome!",
                outContent.toString().trim()
        );

        // Restore standard output
        System.setOut(originalOut);
    }
}