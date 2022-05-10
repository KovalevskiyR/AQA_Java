package Lesson8.Solution2;

public class Solution2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Roma", "380662013655");
        phonebook.add("Roma", "380662011656");
        phonebook.add("Lena", "38066233333333");
        phonebook.add("Igor", "380622222222222");
        phonebook.get("Roma");
//        Alternate Solution with Google multimap
        AlternatePhonebook alt_phonebook = new AlternatePhonebook();
        alt_phonebook.add("Roma", "380662013655");
        alt_phonebook.add("Roma", "380662011656");
        alt_phonebook.add("Lena", "38066233333333");
        alt_phonebook.add("Igor", "380622222222222");
        alt_phonebook.get("Roma");
    }
}
