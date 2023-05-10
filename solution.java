public class AlternateStrings {
    public static String alternate(String[] strings) {
        int maxLength = 0;
        for (String s : strings) {
            maxLength = Math.max(maxLength, s.length());  // Longitud máxima de las cadenas
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (String s : strings) {
                if (i < s.length()) {
                    result.append(s.charAt(i));
                } else {
                    result.append(" ");  // Espacio si la cadena es más corta
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(alternate(new String[]{"abc", "123", "xyz"}));  // Salida: "a1xb2yc3z"
        System.out.println(alternate(new String[]{"abc", "1"}));  // Salida: "a1b c "
        System.out.println(alternate(new String[]{"abcd", "12", "x"}));  // Salida: "a1xb2 c d "
        System.out.println(alternate(new String[]{"ab", "1234"}));  // Salida: "a1b2 3 4"
    }
}
