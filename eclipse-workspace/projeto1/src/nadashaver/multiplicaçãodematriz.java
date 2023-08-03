package nadashaver;

import java.util.Arrays;

public class multiplicaçãodematriz {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};
        String value = "banana";

        int result = searchInArray(array, value);
        if (result == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println(result);
        }
    }

    public static int searchInArray(String[] array, String value) {
        int index = Arrays.asList(array).indexOf(value);
        return index;
    }
}
