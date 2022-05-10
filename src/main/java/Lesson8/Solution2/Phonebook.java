package Lesson8.Solution2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<String>> pb;

    public Phonebook(){
        this.pb = new HashMap<>();
    }

    public void add(String name, String phone){
        ArrayList<String> book = pb.getOrDefault(name, new ArrayList<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void get(String name){
        System.out.println(name+ "|" + pb.get(name));
    }
}
