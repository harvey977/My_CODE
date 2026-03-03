import java.util.*;

class sttr_3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Udit");
        System.out.println(s);
        System.out.println("---------------------------");
        System.out.println(s.length());
        // capital letter
        System.out.println(s.toString().toUpperCase());
        // char at index 0
        System.out.println(s.charAt(3));
        // small letter
        System.out.println(s.toString().toLowerCase());
        // delete index - udt
        s.delete(2, 3);
        System.out.println(s);
        // add index - udeet
        s.insert(2, "ee");
        System.out.println(s);
    }
}
