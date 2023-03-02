package seminar1;
// import java.time.LocalDateTime;

// import java.time.format.DateTimeFormatter;
//  public class helloworld {

// import java.text.Format;
import java.util.Scanner;

//     public static void main(String[] args) {
//         System.out.println("hello,world");
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter. ofPattern("dd.MMM.yyyy");
//         System.out.print(formatter.format(now));
//     }
// }
/**
 * helloworld
 */
public class helloworld {

    public static void main(String[] args) {
        System.out.println("Назовите имя:");
            Scanner sc = new Scanner(System.in, "cp866"); //сз866 - для русского языка
            String myName = sc.nextLine();
            //System.out.println(String.format("Привет, %s!", myName));
            System.out.printf("Привет %s! как дела\n", myName);
            sc.close();

    }
}
/**
 * helloworld
 */
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
// количество подряд идущих 1.

// public class helloworld {

//     public static void main(String[] args) {
//         int[] array = new int[] {
//                 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1
//         };
//         int count = 0;
//         int maxLength = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) {
//                 count++;
//             } else {
//                 if (count > maxLength) { // если текущая цепочка больше итоговой 
//                     maxLength = count;
//                 }
//                 count = 0;
//             }
//         }
//         if (count > maxLength) { // если последняя цепочка больше итоговой
//             maxLength = count;
//         }
//         System.out.println(maxLength);
//     }
// }
// public class Task3 {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 3, 2, 2, 3, 2, 3, 3, 3, 2, 3, 2 };
//         int val = 3;
//         int pos = arr.length - 1;
//         for (int i = 0; i < pos; i++) {
//             if (arr[i] == val) {
//                 while (arr[pos] == 3 && pos > i) {
//                     pos--;
//                 }
//                 int temp = arr[i];
//                 arr[i] = arr[pos];
//                 arr[pos] = temp;
//                 pos--;
//             }

//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }
// Введите число
// 2
// Введите операцию
// 1 +
// 2 -
// 3 *
// 4 /
// Введите число
// 2

// 2 + 2

// String.split (' ')
// ist = [1, 2, 3]
// list.append (4)


// ArrayList<Integer> list = new ArrayList<Integer> ();
// list.add (1);
// list.add (2);
// list.add (3);
// list.add (4);
// if (str.equals ("+"))
// https://lyrical-galette-983.notion.site/2bac7b1fdefe41a985c738288c5a9f0b
