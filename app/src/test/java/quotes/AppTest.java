/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void appHasAuthor() throws FileNotFoundException {
        App.returnSomething(5);
        assertTrue(App.returnSomething(6).equals("Author: Louis Armstrong Quote: What we play is life."));

    }
}