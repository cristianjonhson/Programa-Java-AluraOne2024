public class CamelCaseDetector {
    public static void main(String[] args) {
        // Ejemplos de cadenas a verificar
        String[] testStrings = {"camelCase", "CamelCase", "camelcase", "thisIsCamelCase", "this_is_snake_case"};

        for (String test : testStrings) {
            if (isCamelCase(test)) {
                System.out.println(test + " sigue la sintaxis camelCase");
            } else {
                System.out.println(test + " NO sigue la sintaxis camelCase");
            }
        }
    }

    public static boolean isCamelCase(String str) {
        // Comprobar que la cadena no esté vacía y empiece con una letra minúscula
        if (str == null || str.isEmpty() || !Character.isLowerCase(str.charAt(0))) {
            return false;
        }
        // Expresión regular para verificar el patrón camelCase
        // La cadena debe tener al menos una letra en mayúscula después de la primera palabra
        return str.matches("[a-z]+([A-Z][a-z]*)*");
    }
}
