package lesson4.homework4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElementPhoneBook(String surname, String phone_number) {
        HashSet<String> phone_numbers;
        if (phoneBook.containsKey(surname)) {
            phone_numbers = phoneBook.get(surname);
        }
        else {
            phone_numbers = new HashSet<>();
        }
        phone_numbers.add(phone_number.replaceAll(" ",""));
        phoneBook.put(surname,phone_numbers);
    }

    public Set<String> getPhonesByName (String name){
        return phoneBook.get(name);
    }
}
