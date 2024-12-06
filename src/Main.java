import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abiturient[] array={new Abiturient("0835112","Tsurkan","Danuta","Denysivna","Victorias Garden","0975767414",87.8),
                new Abiturient("0835896","Scevchenko","Taras","Shevchenko","Poltava","0975767414",78.8),
                new Abiturient("7543813","Music","March","Anriyibna","Syhiv","0567422576",98.0),
                new Abiturient("2491062","Symonenko","Vasil","Andriyovych","Chernivtsi","0431123563",71.1),
                new Abiturient("1369068","Ivanchuk","Orest","Yosypovych","Kolomiya","0268631468",8.13),
                new Abiturient("8752489","Kechmar","Ihor","Valeriyovych","Forum Lviv","09752573456",8.14),
                new Abiturient("9276108","Fibonachi","Yurii","Andriyovych","15s century","0934612038",61.2),
                new Abiturient("0265727","Smash","Yurii","Yuriyovych","Lviv Polytechnic","0278401325",98.9),
                new Abiturient("2461965","Ledentsow","Shaman","Jamesovych","Hihiland","0478231590",20.54),
                new Abiturient("4581743","Seniw","Yurii","Didovych","One's Home","0756235912",37.3),
                new Abiturient("9620464","Dadiyovych","Yurii","Yuriyovych","Yuras house","0165289402",98.1)
        };
        while (true) {
            FunctionMenu(array);
        }
    }

    public static void FunctionMenu(Abiturient[] array){
        System.out.println("Choose:\n1.Find abiturients whith the same name.\n" +
                "2.Find abiturients whith higher score than N." +
                "\n3.Find N abiturients whith highest score." +
                "\n4.Exit.");
        Scanner scanner = new Scanner(System.in);
        int key= getInput();
        switch (key) {
            case 1: {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                find_equal_names(array,name);
                break;
            }
            case 2: {
                System.out.println("Enter gpa:");
                double gpa=scanner.nextDouble();
                scanner.nextLine();
                find_students_with_higher_gpa(array,gpa);
                break;
            }
            case 3: {
                System.out.println("Enter N:");
                int n = getInput() ;
                if(n> array.length){
                    System.out.println("There're only "+array.length+" abiturients:");
                    n=array.length;
                }
                find_n_highest_gpa_students(array, n);
                break;
            }
            case 4:{
                System.exit(0);
            }
            default:{
                System.out.println("Incorrect number. Try better next time.");
            }
        }
        scanner.nextLine();
    }

    public static void find_equal_names(Abiturient[] array, String name){
        for(Abiturient abiturient : array){
            if(abiturient.getName().equals(name)){
                System.out.println(abiturient);
            }
        }
    }

    public static void find_students_with_higher_gpa(Abiturient[] array, double gpa){
        for(Abiturient abiturient : array){
            if(abiturient.getGpa()>gpa){
                System.out.println(abiturient);
            }
        }
    }

    public static void find_n_highest_gpa_students(Abiturient[] array, int n){
        Arrays.sort(array, Comparator.comparingDouble(Abiturient::getGpa).reversed());
        int i=0;
        while(i<n){
            System.out.println(array[i]);
            i++;
        }
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = scanner.nextInt();
                if (number >= 1) {
                    isValid = true;
                } else {
                    System.out.println("Число має бути додатнє.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Це не ціле число. Спробуйте ще раз.");
                scanner.next();
            }
        }
        return number;
    }
}
