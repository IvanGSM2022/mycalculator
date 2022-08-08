import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите выражение типа 1 + 2, " +
                    "где вместо + также могут быть - , *, /");
            String inputtext = scanner.nextLine();
            System.out.println(calc(inputtext));
        }
    }

    public static String calc(String input) throws IOException {
        String[] inputexpr = input.split(" ");

        Operations operation = Operations.ADD;
        for (int i = 0; i < inputexpr.length; i++) {
            String text1 = inputexpr[i].trim();
            inputexpr[i] = text1;
        }

        if (inputexpr.length > 3 || inputexpr.length < 3) {
            Exceptions exception = Exceptions.INCORRECT_INPUT;
            throw new IOException("IO: " + exception + " Этот ввод содержит " +
                    "больше либо меньше трех слов, считая оператор");
        } else {

            // Тогда выявляем, что за оператор стоит посередине
            if (inputexpr[1].compareTo("+") == 0) {
                operation = Operations.ADD;
            } else if (inputexpr[1].compareTo("-") == 0) {
                operation = Operations.SUBSTRACT;
            } else if (inputexpr[1].compareTo("*") == 0) {
                operation = Operations.MULTIPLY;
            } else if (inputexpr[1].compareTo("/") == 0) {
                operation = Operations.DEVIDE;
            } else {
                Exceptions exception = Exceptions.INCORRECT_OPERATION;
                throw new IOException(exception + ": Посередине не стоит ни одного из операторов " +
                        "+, -, *, /");
                // Смотрим что стоит слева и справа
            }
        }
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        dictionary.put(1, "I");
        dictionary.put(2, "II");
        dictionary.put(3, "III");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(6, "VI");
        dictionary.put(7, "VII");
        dictionary.put(8, "VIII");
        dictionary.put(9, "IX");
        dictionary.put(10, "X");
        dictionary.put(11, "XI");
        dictionary.put(12, "XII");
        dictionary.put(13, "XIII");
        dictionary.put(14, "XIV");
        dictionary.put(15, "XV");
        dictionary.put(16, "XVI");
        dictionary.put(17, "XVII");
        dictionary.put(18, "XVIII");
        dictionary.put(19, "XIX");
        dictionary.put(20, "XX");
        dictionary.put(21, "XXI");
        dictionary.put(22, "XXII");
        dictionary.put(23, "XXIII");
        dictionary.put(24, "XXIV");
        dictionary.put(25, "XXV");
        dictionary.put(26, "XXVI");
        dictionary.put(27, "XXVII");
        dictionary.put(28, "XXVIII");
        dictionary.put(29, "XXIX");
        dictionary.put(30, "XXX");
        dictionary.put(31, "XXXI");
        dictionary.put(32, "XXXII");
        dictionary.put(33, "XXXIII");
        dictionary.put(34, "XXXIV");
        dictionary.put(35, "XXXV");
        dictionary.put(36, "XXXVI");
        dictionary.put(37, "XXXVII");
        dictionary.put(38, "XXXVIII");
        dictionary.put(39, "XXXIX");
        dictionary.put(40, "XL");
        dictionary.put(41, "XLI");
        dictionary.put(42, "XLII");
        dictionary.put(43, "XLIII");
        dictionary.put(44, "XLIV");
        dictionary.put(45, "XLV");
        dictionary.put(46, "XLVI");
        dictionary.put(47, "XLVII");
        dictionary.put(48, "XLVIII");
        dictionary.put(49, "XLIX");
        dictionary.put(50, "L");
        dictionary.put(51, "LI");
        dictionary.put(52, "LII");
        dictionary.put(53, "LIII");
        dictionary.put(54, "LIV");
        dictionary.put(55, "LV");
        dictionary.put(56, "LVI");
        dictionary.put(57, "LVII");
        dictionary.put(58, "LVIII");
        dictionary.put(59, "LIX");
        dictionary.put(60, "LX");
        dictionary.put(61, "LXI");
        dictionary.put(62, "LXII");
        dictionary.put(63, "LXIII");
        dictionary.put(64, "LXIV");
        dictionary.put(65, "LXV");
        dictionary.put(66, "LXVI");
        dictionary.put(67, "LXVII");
        dictionary.put(68, "LXVIII");
        dictionary.put(69, "LXIX");
        dictionary.put(70, "LXX");
        dictionary.put(71, "LXXI");
        dictionary.put(72, "LXXII");
        dictionary.put(73, "LXXIII");
        dictionary.put(74, "LXXIV");
        dictionary.put(75, "LXXV");
        dictionary.put(76, "LXXVI");
        dictionary.put(77, "LXXVII");
        dictionary.put(78, "LXXVIII");
        dictionary.put(79, "LXXIX");
        dictionary.put(80, "LXXX");
        dictionary.put(81, "LXXXI");
        dictionary.put(82, "LXXXII");
        dictionary.put(83, "LXXXIII");
        dictionary.put(84, "LXXXIV");
        dictionary.put(85, "LXXXV");
        dictionary.put(86, "LXXXVI");
        dictionary.put(87, "LXXXVII");
        dictionary.put(88, "LXXXVIII");
        dictionary.put(89, "LXXXIX");
        dictionary.put(90, "XC");
        dictionary.put(91, "XCI");
        dictionary.put(92, "XCII");
        dictionary.put(93, "XCIII");
        dictionary.put(94, "XCIV");
        dictionary.put(95, "XCV");
        dictionary.put(96, "XCVI");
        dictionary.put(97, "XCVII");
        dictionary.put(98, "XCVIII");
        dictionary.put(99, "XCIX");
        dictionary.put(100, "C");

        boolean leftIsInt = false;
        int leftint = 0;
        for (int i = 0; i < 11; i++) {
            String comparetoint = Integer.toString(i);
            if (comparetoint.equals(inputexpr[0])) {
                leftIsInt = true;
                leftint = i;
            }
        }
        boolean leftIsRome = false;
        for (int j = 1; j < 11; j++) {
            String comparetoint = Integer.toString(j);
            String firstvalueOfInput = inputexpr[0].substring(0, 1);
            if (((dictionary.get(j)).substring(0, 1)).equalsIgnoreCase(firstvalueOfInput)) {
                leftIsRome = true;
            }
        }

        boolean rightIsInt = false;
        int rightint = 0;
        for (int i = 0; i < 11; i++) {
            String comparetoint = Integer.toString(i);
            if (comparetoint.equals(inputexpr[2])) {
                rightIsInt = true;
                rightint = i;
            }
        }
        boolean rightIsRome = false;
        for (int j = 1; j < 11; j++) {
            String comparetoint = Integer.toString(j);
            String firstvalueOfInput = inputexpr[2].substring(0, 1);
            if (((dictionary.get(j)).substring(0, 1)).equalsIgnoreCase(firstvalueOfInput)) {
                rightIsRome = true;
            }
        }
        if ((leftIsRome & rightIsInt) || (rightIsRome & leftIsInt)) {
            throw new IOException(Exceptions.ARE_OF_DIFFERENT_TYPES+": Введены " +
                    "разные типы чисел");
        }

        int intResult = 0;
        String Result = new String();
        if (leftIsInt & rightIsInt) {
            if (leftint > 10 || rightint > 10) {
                throw new IOException(Exceptions.GRATER_THEN_10 + ": Как минимум одно из чисел больше 10");
            }
            if (leftint < 1 || rightint < 1) {
                throw new IOException(Exceptions.LESS_THEN_1 + ": Как минимум одно из чисел меньше 1");
            }
            System.out.println("leftisint + someoutput");
            switch (operation) {
                case ADD:
                    intResult = leftint + rightint;
                    break;
                case SUBSTRACT:
                    intResult = leftint - rightint;
                    break;
                case MULTIPLY:
                    intResult = leftint * rightint;
                    break;
                case DEVIDE:
                    intResult = leftint / rightint;
                    break;
            }
            Result = Integer.toString(intResult);
        }

        if (leftIsRome & rightIsRome) {
            leftint = RomeToArabic(inputexpr[0]);
            rightint = RomeToArabic(inputexpr[2]);
            if (leftint > 10 || rightint > 10) {
                throw new IOException(Exceptions.GRATER_THEN_10 + ": Как минимум одно из чисел больше 10");
            }
            if (leftint < 1 || rightint < 1) {
                throw new IOException(Exceptions.LESS_THEN_1 + ": Как минимум одно из чисел меньше 1");
            }
            switch (operation) {
                case ADD:
                    intResult = RomeToArabic(inputexpr[0]) + RomeToArabic(inputexpr[2]);
                    break;
                case SUBSTRACT:
                    intResult = RomeToArabic(inputexpr[0]) - RomeToArabic(inputexpr[2]);
                    break;
                case MULTIPLY:
                    intResult = RomeToArabic(inputexpr[0]) * RomeToArabic(inputexpr[2]);
                    break;
                case DEVIDE:
                    intResult = RomeToArabic(inputexpr[0]) / RomeToArabic(inputexpr[2]);
                    break;
            }

            if (intResult<1){
                throw new IOException(Exceptions.RESULT_ROME_NUMBER_LESS_THEN_1+": " +
                        "В римской системе счисления нет чисел меньше 1");
            }
            Result = dictionary.get(intResult);
        }


        return Result;
    }

    static int RomeToArabic(String romeValue) {
        int arabicValue = 0;
        switch (romeValue.length()) {
            case 4:
                arabicValue = 8;
                break;
            case 1:
                if (romeValue.compareToIgnoreCase("I") == 0) {
                    arabicValue = 1;
                } else if (romeValue.compareToIgnoreCase("V") == 0) {
                    arabicValue = 5;
                } else if (romeValue.compareToIgnoreCase("X") == 0) {
                    arabicValue = 10;
                };
                break;
            case 3:
                if (romeValue.compareToIgnoreCase("VII") == 0) {
                    arabicValue = 7;
                } else {
                    arabicValue = 3;
                };
                break;
            case 2:
                if (romeValue.compareToIgnoreCase("II") == 0) {
                    arabicValue = 2;
                } else if (romeValue.compareToIgnoreCase("VI") == 0) {
                    arabicValue = 6;
                } else {
                    char[] Arr = romeValue.toCharArray();
                    String Sarr1 = String.valueOf(Arr[0]);
                    String Sarr2 = String.valueOf(Arr[1]);

                    if (Sarr1.compareToIgnoreCase("I") == 0) {
                        if (Sarr2.compareToIgnoreCase("V") == 0) {
                            arabicValue = 4;
                        } else if (Sarr2.compareToIgnoreCase("X") == 0) {
                            arabicValue = 9;
                        }
                    } // Закончили перебор римских
                }
        }// Закончили Switch
        return arabicValue;
    }

}