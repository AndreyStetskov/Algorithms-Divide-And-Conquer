public class Sort {
    public static void sort(String string) {
        int [] symbol = new int[string.length()];

        toNumberInArray(symbol, string);

        sortByShell(symbol);

        System.out.println(backToString(symbol));
    }

    private static void toNumberInArray(int[] array, String string) {
        for (int i = 0; i < string.length(); i++) {
            array[i] = ((int) string.charAt(i));
        }
    }

    private static StringBuilder backToString(int[] array) {
        StringBuilder newString = new StringBuilder();
        for (int i : array) {
            newString.append(String.valueOf((char) i).toUpperCase());
        }

        return newString;
    }

    private static void sortByShell(int[] array) {
        int step = array.length / 2;
        while (step > 0) {
            for (int i = 0; i < array.length - step; i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step]){
                    int temporary = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temporary;
                    j--;
                }
            }
            step /= 2;
        }
    }
}
