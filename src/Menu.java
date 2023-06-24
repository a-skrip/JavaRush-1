import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringJoiner;

public class Menu {

    public static void decoderMenu() {

        String hello = "Здравствуй мой милый друг! \nБудь добр, введи номер пункта меню который необходим тебе: ";
        String menuItem1 = "1. Зашифровать";
        String menuItem2 = "2. Расшифровать";
        String menuItem3 = "3. Ломануть шифровку методом грубой силы (BruteForce) ";
        String choice = "Ты выбрал: ";
        StringJoiner joiner = new StringJoiner("\n");
        joiner.add(hello);
        joiner.add(menuItem1);
        joiner.add(menuItem2);
        joiner.add(menuItem3);

        int userChoice = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(joiner);
            try { switch (scanner.nextLine()) {
                    case "1":
                        System.out.println(choice + menuItem1 + " - Укажи путь к файлу: ");
                        Scanner scanner1 = new Scanner(System.in);
                        Path sourcePath = Path.of(scanner1.nextLine());
                        Path targetPath = FileUtility.createResultFile(sourcePath);
                        EncryptMethod.readEncryptAndRecording(sourcePath, targetPath);

                        break;
                    case "2":
                        System.out.println(choice + menuItem2 + " - Укажи путь к файлу: ");
                        Scanner scanner2 = new Scanner(System.in);
                        Path sourcePath2 = Path.of(scanner2.nextLine());
                        Path targetPath2 = FileUtility.createResultFile(sourcePath2);
                        DecryptMethod.readDecryptAndRecording(sourcePath2, targetPath2);

                        break;
                    case "3":
                        System.out.println(choice + menuItem3 + " - Укажи путь к файлу: ");
                        Scanner scanner3 = new Scanner(System.in);
                        Path sourcePath3 = Path.of(scanner3.nextLine());
                        Path targetPath3 = FileUtility.createResultFile(sourcePath3);
                        System.out.println(choice + menuItem3 + " - Хакаем......... \n");
                        CaesarCipher.caesarCipher(sourcePath3, targetPath3);


                        break;
                    default:
                        System.out.println("Введи НОМЕР!!! пункта меню\n");
//
                }
            } catch (Exception e) {
                System.out.println("Произошла ошибка: Путь указан не корректно! \n");
            }

        }
    }


}

