
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
// public class seminar2_2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введите слово: ");
//         String text = sc.nextLine();

//         writeString(repeatString(text));
//         sc.close();
//     }

//     private static String repeatString(String part) {
//         StringBuilder fullMaker = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             fullMaker.append(part);
//         }
//         return fullMaker.toString();
//     }

//     private static void writeString(String string) {
//         FileWriter file = null;
//         try {
//             file = new FileWriter("text.txt");
//             file.append(string);
//             System.out.println("Файл успешно создан");

//         } catch (IOException ex) {
//             System.err.println("Ошибка: " + ex);
//         } finally {
//             if (file != null) {
//                 try {
//                     file.close();
//                 } catch (IOException ex) {
//                     System.err.println("Ошибка: " + ex);
//                 }
//             }
//         }
//     }
// }
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
//  Другой короткий вариант
public class seminar2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();
        
        writeStriing(repeatString(text));
        sc.close();
    }

    private static String repeatString(String part) {
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }
    private static void writeStriing(String string){
        try(FileWriter file = new FileWriter("test.txt")) {
            file.append(string);
            System.out.println("Файл успешно создан");
            
        }
        catch(IOException ex){
            System.err.println("Ошибка :" + ex);
        }
        
    }
}

