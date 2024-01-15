package pisek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Merger {

    private static final String MERGED_FILENAME = "merged.pkg";

    public static void main(String[] args) throws Exception {

        Path dir = Path.of(args[0]);
        Files.walk(dir)
                .filter(path -> path.toString().endsWith(".pkg"))
                .sorted()
                .forEach(f -> {
                    try (FileOutputStream out = new FileOutputStream(dir.resolve(MERGED_FILENAME).toFile(), true)) {
                        System.out.println("merging " + f.getFileName());
                        Files.copy(f, out);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

    }

}
