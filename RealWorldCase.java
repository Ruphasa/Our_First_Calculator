import java.util.Scanner;

public class RealWorldCase {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option, numPertama, numKedua,hasilPlus, hasilMin, hasilKali, hasilBagi;
            do {
                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                System.out.println("Exit");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("choose first Number");
                        numPertama = scanner.nextInt();
                        System.out.println("choose second Number");
                        numKedua = scanner.nextInt();
                        hasilPlus = numPertama + numKedua;
                        System.out.println(hasilPlus);
                        break;
                    case 2:
                        System.out.println("choose first Number");
                        numPertama = scanner.nextInt();    
                        System.out.println("choose second Number");
                        numKedua = scanner.nextInt();
                        hasilMin = numPertama - numKedua;
                        System.out.println(hasilMin);
                        break;
                    case 3:
                        System.out.println("choose first Number");
                        numPertama = scanner.nextInt(); 
                        System.out.println("choose second Number");
                        numKedua = scanner.nextInt();
                        hasilKali = numPertama * numKedua;
                        System.out.println(hasilKali);
                        break;
                    case 4:
                        System.out.println("choose first Number");
                        numPertama = scanner.nextInt(); 
                        System.out.println("choose second Number");
                        numKedua = scanner.nextInt();
                        hasilBagi = numPertama / numKedua;
                        System.out.println(hasilBagi);
                        break;
                    case 5:
                        System.out.println("your now exit");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } while (option != 5);
        } 
        
    }
}