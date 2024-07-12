import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to iCALC Number Converter System");
            System.out.println("1. Decimal Converter");
            System.out.println("2. Binary Converter");
            System.out.println("3. Octal Converter");
            System.out.println("4. Hexadecimal Converter");
            System.out.println("5. Roman Number Converter");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a positive decimal number: ");
                    int decimal = scanner.nextInt();
                    if (decimal < 0) {
                        System.out.println("Invalid input...");
                    } else {
                        System.out.print("Binary: ");
                        if (decimal == 0) {
                            System.out.println("0");
                        } else {
                            String binary = "";
                            int temp = decimal;
                            while (temp > 0) {
                                binary = (temp % 2) + binary;
                                temp /= 2;
                            }
                            System.out.println(binary);
                        }

                        System.out.print("Octal: ");
                        if (decimal == 0) {
                            System.out.println("0");
                        } else {
                            String octal = "";
                            int temp = decimal;
                            while (temp > 0) {
                                octal = (temp % 8) + octal;
                                temp /= 8;
                            }
                            System.out.println(octal);
                        }

                        System.out.print("Hexadecimal: ");
                        if (decimal == 0) {
                            System.out.println("0");
                        } else {
                            String hex = "";
                            char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            int temp = decimal;
                            while (temp > 0) {
                                hex = hexChars[temp % 16] + hex;
                                temp /= 16;
                            }
                            System.out.println(hex);
                        }

                        System.out.print("Do you want to go to the homepage? (Y/N): ");
                        if (scanner.next().equalsIgnoreCase("N")) {
                            System.exit(0);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    String binary = scanner.next();
                    if (!binary.matches("[01]+")) {
                        System.out.println("Invalid input...");
                    } else {
                        int decimalBinary = 0;
                        for (int i = 0; i < binary.length(); i++) {
                            decimalBinary = decimalBinary * 2 + (binary.charAt(i) - '0');
                        }
                        System.out.println("Decimal: " + decimalBinary);

                        System.out.print("Octal: ");
                        if (decimalBinary == 0) {
                            System.out.println("0");
                        } else {
                            String octal = "";
                            int temp = decimalBinary;
                            while (temp > 0) {
                                octal = (temp % 8) + octal;
                                temp /= 8;
                            }
                            System.out.println(octal);
                        }

                        System.out.print("Hexadecimal: ");
                        if (decimalBinary == 0) {
                            System.out.println("0");
                        } else {
                            String hex = "";
                            char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            int temp = decimalBinary;
                            while (temp > 0) {
                                hex = hexChars[temp % 16] + hex;
                                temp /= 16;
                            }
                            System.out.println(hex);
                        }

                        System.out.print("Do you want to go to the homepage? (Y/N): ");
                        if (scanner.next().equalsIgnoreCase("N")) {
                            System.exit(0);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter an octal number: ");
                    String octal = scanner.next();
                    if (!octal.matches("[0-7]+")) {
                        System.out.println("Invalid input...");
                    } else {
                        int decimalOctal = 0;
                        for (int i = 0; i < octal.length(); i++) {
                            decimalOctal = decimalOctal * 8 + (octal.charAt(i) - '0');
                        }
                        System.out.println("Decimal: " + decimalOctal);

                        System.out.print("Binary: ");
                        if (decimalOctal == 0) {
                            System.out.println("0");
                        } else {
                            String binaryStr = "";
                            int temp = decimalOctal;
                            while (temp > 0) {
                                binaryStr = (temp % 2) + binaryStr;
                                temp /= 2;
                            }
                            System.out.println(binaryStr);
                        }

                        System.out.print("Hexadecimal: ");
                        if (decimalOctal == 0) {
                            System.out.println("0");
                        } else {
                            String hex = "";
                            char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            int temp = decimalOctal;
                            while (temp > 0) {
                                hex = hexChars[temp % 16] + hex;
                                temp /= 16;
                            }
                            System.out.println(hex);
                        }

                        System.out.print("Do you want to go to the homepage? (Y/N): ");
                        if (scanner.next().equalsIgnoreCase("N")) {
                            System.exit(0);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter a hexadecimal number: ");
                    String hex = scanner.next();
                    if (!hex.matches("[0-9A-Fa-f]+")) {
                        System.out.println("Invalid input...");
                    } else {
                        int decimalHex = 0;
                        for (int i = 0; i < hex.length(); i++) {
                            char c = hex.charAt(i);
                            if (c >= '0' && c <= '9') {
                                decimalHex = decimalHex * 16 + (c - '0');
                            } else if (c >= 'A' && c <= 'F') {
                                decimalHex = decimalHex * 16 + (c - 'A' + 10);
                            } else if (c >= 'a' && c <= 'f') {
                                decimalHex = decimalHex * 16 + (c - 'a' + 10);
                            }
                        }
                        System.out.println("Decimal: " + decimalHex);

                        System.out.print("Binary: ");
                        if (decimalHex == 0) {
                            System.out.println("0");
                        } else {
                            String binaryStr = "";
                            int temp = decimalHex;
                            while (temp > 0) {
                                binaryStr = (temp % 2) + binaryStr;
                                temp /= 2;
                            }
                            System.out.println(binaryStr);
                        }

                        System.out.print("Octal: ");
                        if (decimalHex == 0) {
                            System.out.println("0");
                        } else {
                            String octalStr = "";
                            int temp = decimalHex;
                            while (temp > 0) {
                                octalStr = (temp % 8) + octalStr;
                                temp /= 8;
                            }
                            System.out.println(octalStr);
                        }

                        System.out.print("Do you want to go to the homepage? (Y/N): ");
                        if (scanner.next().equalsIgnoreCase("N")) {
                            System.exit(0);
                        }
                    }
                    break;
                case 5:
                    System.out.println("1. Decimal to Roman Number Converter");
                    System.out.println("2. Roman Number to Decimal Converter");
                    System.out.print("Choose an option: ");
                    int romanChoice = scanner.nextInt();
                    switch (romanChoice) {
                        case 1:
                            System.out.print("Enter a positive decimal number: ");
                            int decimalRoman = scanner.nextInt();
                            if (decimalRoman < 0) {
                                System.out.println("Invalid input...");
                            } else {
                                int number = decimalRoman;
                                if (number < 1 || number > 3999) {
                                    System.out.println("Invalid Roman Number Value");
                                } else {
                                    String[] romanNumerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                                    int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                                    String romanStr = "";
                                    for (int i = 0; i < values.length; i++) {
                                        while (number >= values[i]) {
                                            number -= values[i];
                                            romanStr += romanNumerals[i];
                                        }
                                    }
                                    System.out.println("Roman: " + romanStr);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Enter a Roman number: ");
                            String roman = scanner.next();
                            int decimalValue = 0;
                            int lastNumber = 0;
                            for (int i = roman.length() - 1; i >= 0; i--) {
                                char convertToDecimal = roman.charAt(i);
                                int currentNumber = 0;
                                switch (convertToDecimal) {
                                    case 'M':
                                        currentNumber = 1000;
                                        break;
                                    case 'D':
                                        currentNumber = 500;
                                        break;
                                    case 'C':
                                        currentNumber = 100;
                                        break;
                                    case 'L':
                                        currentNumber = 50;
                                        break;
                                    case 'X':
                                        currentNumber = 10;
                                        break;
                                    case 'V':
                                        currentNumber = 5;
                                        break;
                                    case 'I':
                                        currentNumber = 1;
                                        break;
                                }
                                if (lastNumber > currentNumber) {
                                    decimalValue -= currentNumber;
                                } else {
                                    decimalValue += currentNumber;
                                }
                                lastNumber = currentNumber;
                            }
                            System.out.println("Decimal: " + decimalValue);
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                    }
                    System.out.print("Do you want to go to the homepage? (Y/N): ");
                    if (scanner.next().equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
