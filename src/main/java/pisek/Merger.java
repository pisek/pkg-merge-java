package pisek;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Merger {

    private static final String MERGED_FILENAME = "merged.pkg";

    public static void main(String[] args) throws Exception {

        Path dir = Path.of(args[0]);

        File outFile = resolveOutFile(args, dir);

        Files.walk(dir)
                .filter(path -> path.toString().toLowerCase().endsWith(".pkg"))
                .sorted()
                .forEach(f -> {
                    try (FileOutputStream out = new FileOutputStream(outFile, true)) {
                        System.out.println("merging " + f.getFileName());
                        Files.copy(f, out);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

    }

    private static File resolveOutFile(String[] args, Path dir) {
        File outFile = dir.resolve(MERGED_FILENAME).toFile();
        if (args.length > 1) {
            outFile = new File(args[1]);
            if (outFile.isDirectory()) {
                outFile = outFile.toPath().resolve(MERGED_FILENAME).toFile();
            }
        }
        return outFile;
    }

}
