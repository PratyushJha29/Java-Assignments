
public class StringBuilderToolkit {

    static String reverse(String text) {
        if (text == null)
            return null;

        return new StringBuilder(text).reverse().toString();
    }

    static String repeat(String text, int count) {
        if (text == null || count < 0)
            return null;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++)
            result.append(text);

        return result.toString();
    }

    static String joinWords(String[] words, String separator) {
        if (words == null || separator == null)
            return null;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if (i < words.length - 1)
                result.append(separator);
        }

        return result.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder result = new StringBuilder(text);
        result.deleteCharAt(index);

        return result.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder result = new StringBuilder(text);
        result.setCharAt(index, replacement);

        return result.toString();
    }

    static String buildNumberedList(String[] items) {
        if (items == null)
            return null;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            result.append(i + 1);
            result.append(". ");
            result.append(items[i]);
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Java"));
        System.out.println(repeat("Hi", 3));
        System.out.println(joinWords(new String[]{"Java", "Python", "C++"}, ", "));
        System.out.println(removeCharacterAt("Java", 1));
        System.out.println(replaceCharacterAt("Java", 1, 'o'));
        System.out.println(buildNumberedList(new String[]{"Java", "Python", "C++"}));

        StringBuilder builder = new StringBuilder("Hello");
        String text = builder.toString();

        builder.append(" World");

        System.out.println(text);
        System.out.println(builder);
    }
}


