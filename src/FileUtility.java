import java.nio.file.Path;

public class FileUtility {

    public static Path createResultFile(Path pathToSourceFile) {
        Path parent = pathToSourceFile.getParent();
        Path result = Path.of(parent.toString(), "result.txt");
        return result;
    }
}
