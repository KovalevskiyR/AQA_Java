package Lesson8.Solution2;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class AlternatePhonebook {
    private Multimap<String, String> pb;

    public AlternatePhonebook() {
        this.pb = ArrayListMultimap.create();
    }

    public void add(String name, String phone) {
        pb.put(name, phone);
    }

    public void get(String name) {
        System.out.println(name + "|" + pb.get(name));
    }
}

