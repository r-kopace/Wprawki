package manipulacje;

public class Str1 {
    public static void main(String[] args) {
        System.out.println("Ala ma kota");
        String str = "Ala ma kota";
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length()-1;i++){
            if(i%2==0)
              sb.append(Character.toUpperCase(str.charAt(i)));
            else
              sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
