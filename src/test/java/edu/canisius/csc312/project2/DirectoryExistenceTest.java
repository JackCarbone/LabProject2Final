package edu.canisius.csc312.project2;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class DirectoryExistenceTest {

    @Test
    public void testDirectoryExists() {
        // Specify the path to the directory to be tested
        String directoryPath = "/usercode/src/main/java/";

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        assertTrue("Directory exists", directory.exists());
    }
}
