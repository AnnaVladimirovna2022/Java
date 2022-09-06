package lesson4.homework4;

public class Main {
    public static void main(String[] args) {
        WordsArray wordsArray = new WordsArray(createWordsArray());
        wordsArray.doWordsArray();
        System.out.println("------------------------");
        doPhonebook();
    }
    private static String[] createWordsArray() {
        String [] strings = new String[13];
        strings[0] = "Sonya";
        strings[1] = "Nina";
        strings[2] = "Polina";
        strings[3] = "Zoya";
        strings[4] = "Mama";
        strings[5] = "Sonya";
        strings[6] = "Nina";
        strings[7] = "Mama";
        strings[8] = "Nina";
        strings[9] = "Dad";
        strings[10] = "Zina";
        strings[11] = "Dad";
        strings[12] = "Katya";
        return strings;
    }

    private static void doPhonebook() {
        Phonebook phoneBook = new Phonebook();
        phoneBook.addElementPhoneBook("Novikov","89361552526");
        phoneBook.addElementPhoneBook("Novikov","89487886363");
        phoneBook.addElementPhoneBook("Novikov","89669141411");

        phoneBook.addElementPhoneBook("Semenov","89323661512");
        phoneBook.addElementPhoneBook("Semenov","89488889912");
        phoneBook.addElementPhoneBook("Semenov","89154881111");

        phoneBook.addElementPhoneBook("Smirnov","89147889966");
        phoneBook.addElementPhoneBook("Smirnov","86552112020");

        System.out.println("Novikov: " + phoneBook.getPhonesByName("Novikov"));
        System.out.println("Semenov: " + phoneBook.getPhonesByName("Semenov"));
        System.out.println("Smirnov: " + phoneBook.getPhonesByName("Smirnov"));
        System.out.println("Alekseev: " + phoneBook.getPhonesByName("Alekseev"));
        System.out.println("Fedorov: " + phoneBook.getPhonesByName("Fedorov"));
    }
}
