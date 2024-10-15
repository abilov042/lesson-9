import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//
//        s = s.trim().replaceAll("\\s+", " ");
//
//        System.out.println(s);


//        Scanner scanner = new Scanner(System.in);
//
//        String number = scanner.nextLine();
//        int digit = scanner.nextInt();
//        char[] numbers = number.toCharArray();
//        int inMind = 0;
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            if(numbers[i] != '9'){
//                numbers[i] = (char) (numbers[i] + digit);
//            }
//            if(inMind != 0){
//
//            }
//
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();



        // 1 2 3  result + = 123

//        int result = 0;
//        int a = 1;
//
//        for(int i = s.length() - 1; i >= 0; i--){
//            result+= (s.charAt(i) - 48) * a; // 3, 20 + 3, 100 + 23
//            a= a * 10;
//        }
//
//        System.out.println(result);



        while (true){

            String text = """
                    1) encode etmek ucun:
                    2) decode etmek ucun:
                    3) cixis ucun:
                    """;

            System.out.println(text);


            int n = scanner.nextInt();


            int key = 0;
            String password = "";
            if(n != 3){
                System.out.println("Acar reqemi daxil edin: ");

                key = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Parolu daxil edin: ");
                password = scanner.nextLine();
            }



            switch (n){
                case 1:
                    System.out.println(encode(key, password));break;
                case 2:
                    System.out.println(decode(key, password));break;
                case 3: return;
            }
        }

    }

    private static String encode(int key, String text){

        String encodedText = "";

        for (int i = 0; i < text.length(); i++){
            encodedText += (char)(text.charAt(i) + key);
        }

        return encodedText;
    }

    private static String decode(int key, String text){

        String encodedText = "";

        for (int i = 0; i < text.length(); i++){
            encodedText += (char)(text.charAt(i) - key);
        }

        return encodedText;
    }

}