package 培训期间_excercise.Array;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

class BFSTest {

  @Test
  @DisplayName("Should find the target node when it is reachable")
  void mainWhenTargetNodeIsReachable() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    String[] args = {};
    BFS.main(args);

    String expectedOutput = "get the target." + System.lineSeparator();
    assertEquals(expectedOutput, outContent.toString());
  }

  @Test
  @DisplayName("Should print 'Target node not found!' when the target node is not reachable")
  void mainWhenTargetNodeIsNotReachable() {
    int[][] graph =
        new int[][]{
            {1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0}
        };

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    BFS.bfs(graph, 0, 3);

    String expectedOutput = "Target node not found!" + System.lineSeparator();
    assertEquals(expectedOutput, outputStream.toString());
  }
}