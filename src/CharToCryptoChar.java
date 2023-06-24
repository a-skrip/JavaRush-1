import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CharToCryptoChar {
    static ArrayList<Character> alfabet = new ArrayList<>();

    static {
        Collections.addAll(alfabet, 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н',
                'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
                'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
                '.', ',', '"', ':', '-', '!', '?', ' ');
    }

    public static Character charToCryptoChar(Character characterIn, Integer integerKey) {

        char cryptoChar;
        int indexOfSource = alfabet.indexOf(characterIn);
        int indexOfTarget = indexOfSource + integerKey;
        if (indexOfSource == -1) {
            return characterIn;
        } else if (indexOfTarget < 0) {
            indexOfTarget = (alfabet.size()) + indexOfTarget;
            cryptoChar = alfabet.get(indexOfTarget);
        } else {
            indexOfTarget = indexOfTarget % alfabet.size();
            cryptoChar = alfabet.get(indexOfTarget);
        }
        return cryptoChar;


    }

    public static int encryptionOrDecryptionKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи ключ (число от 1 до 74) :   \n");
        int value = scanner.nextInt();
        System.out.println();
        return value;
    }
}

