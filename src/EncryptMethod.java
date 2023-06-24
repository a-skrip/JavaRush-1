import java.io.*;
import java.nio.file.Path;

public class EncryptMethod {
    public static void readEncryptAndRecording(Path sousePath, Path targetPath) {

        try (FileInputStream input = new FileInputStream(sousePath.toString());
             FileOutputStream output = new FileOutputStream(targetPath.toString());
             Reader reader = new InputStreamReader(input);
             Writer writer = new OutputStreamWriter(output)) {
            int read;
            int key = CharToCryptoChar.encryptionOrDecryptionKey();

            while ((read = reader.read()) > 0) {
                Character newChar = CharToCryptoChar.charToCryptoChar((char) read, key);
                writer.write(newChar);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Файл с тезультатом по адресу: " + targetPath + "\n\n\n");
    }
}
