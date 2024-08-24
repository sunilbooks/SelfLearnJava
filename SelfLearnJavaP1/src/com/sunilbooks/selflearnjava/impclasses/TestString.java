package com.sunilbooks.selflearnjava.impclasses;

public class TestString {

    /**
     * Tests string concatenation methods such as using the plus operator and the
     * {@code concat()} method. It also demonstrates the use of the
     * {@code substring()} method.
     */
    public static void testConcatingString() {

        String firstName = "Nayna";
        String lastName = "Sahu";
        String name = firstName + lastName;
        name = firstName.concat(lastName);
        System.out.println(name);

        name = "Nayna Sahu";
        System.out.println(name.substring(6)); // Sahu
        System.out.println(name.substring(0, 6)); // Nayna
    }

    /**
     * Tests various key methods of the {@code String} class, including
     * {@code length()}, {@code charAt()}, {@code indexOf()}, {@code lastIndexOf()},
     * {@code replace()}, {@code toLowerCase()}, {@code toUpperCase()},
     * {@code startsWith()}, {@code endsWith()}, and {@code substring()}.
     */
    public static void testKeyMethods() {

        String n = "Vijay Dinanth Chouhan";

        System.out.println("String Length: " + n.length());
        System.out.println("7th character: " + n.charAt(6));
        System.out.println("Index Of Dina: " + n.indexOf("Dina"));
        System.out.println("First position of i: " + n.indexOf("i"));
        System.out.println("Last position of i: " + n.lastIndexOf("i"));
        System.out.println("a is replaced by b : " + n.replace("a", "b"));
        System.out.println("Chota vijay: " + n.toLowerCase());
        System.out.println("Bada vijay: " + n.toUpperCase());
        System.out.println("Starts With Vijay: " + n.startsWith("Vijay"));
        System.out.println("Ends with han: " + n.endsWith("han"));
        System.out.println("Dad's name: " + n.substring(6));
    }

    /**
     * Tests the creation of strings using both string literals and the {@code new}
     * keyword. It also demonstrates the difference between {@code ==} and
     * {@code equals()} for string comparison.
     */
    public static void testCreateStrings() {

        // Literals
        String s1 = "SUNRAYS";
        String s2 = "SUNRAYS";

        boolean result = (s1 == s2);
        System.out.println("s1 == s2 : " + result);

        String s3 = new String("SUNRAYS");
        String s4 = new String("SUNRAYS");

        result = (s3 == s4);
        System.out.println("s3 == s4 : " + result);

        result = s3.equals(s4);
        System.out.println("s3.equals(s4): " + result);

        char[] chars = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        String s5 = new String(chars);
    }
}
