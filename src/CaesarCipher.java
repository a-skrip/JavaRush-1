import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

    public static void caesarCipher(Path sousePath, Path targetPath) {
        try (
                FileInputStream input = new FileInputStream(sousePath.toString());
                FileOutputStream output = new FileOutputStream(targetPath.toString());
                Reader reader = new InputStreamReader(input);
                Writer writer = new OutputStreamWriter(output)
        ) {
            int read;

            List<Character> variantsOfDecryption = new ArrayList<>();
            while ((read = reader.read()) > 0) {
                variantsOfDecryption.add((char) read);
            }
            for (int i = 0; i < CharToCryptoChar.alfabet.size(); i++) {
                for (Character res : variantsOfDecryption) {
                    Character resultChar = CharToCryptoChar.charToCryptoChar(res, i);
                    writer.write(resultChar);
                }
                writer.write("\n\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Файл с тезультатом по адресу: " + targetPath + "\n\n\n");
    }
}
