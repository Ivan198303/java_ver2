import java.io.File;
// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла: 
// 4 Расширение файла: jpg

public class seminar2_3 {
    public static void main(String[] args) {
        File dir = new File(".");
        showExtension(dir.list());
    }

    private static void showExtension(String[] filenames) {
        for (int i = 0; i < filenames.length; i++) {
            int pos = filenames[i].lastIndexOf('.');
            if (pos == -1) {
                System.err.println();
                continue;
            }
            System.out.println(filenames[i].substring(pos + 1));
        }
    }
}
