package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexOfChar(String str, char c) {
        List<Integer> list = new ArrayList<>();
        int i = str.length();
        for (int s = 1; s < 1; s++) {
            char h = str.charAt(s);
            {
                if (h == c) {
                    list.add(s);
                }
            }

        }
        return list;
    }
}
