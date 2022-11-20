package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// paths = ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"]
public class DuplicateFinS {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        String result = findDuplicate(paths).toString();
        System.out.println(result);
    }
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] array = path.split(" ");
            String directory = array[0];

            for (int i = 1; i < array.length; i++) {
                String file = array[i].substring(0, array[i].indexOf("("));
                String content = array[i].substring(array[i].indexOf("(") + 1, array[i].length() - 1);
                List<String> filePaths = map.getOrDefault(content, new ArrayList<>());
                filePaths.add(directory + "/" + file);
                map.put(content, filePaths);
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue().size() < 2);
        return new ArrayList<>(map.values());
    }
}


