package seminar4;

import java.util.ArrayDeque;
import java.util.Scanner;
public class sem4_3_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayDeque<String> list = new ArrayDeque<>();
            String command = "";
            while (!command.equals("q")) {
                command = sc.nextLine();
                

                if(command.equalsIgnoreCase("print")){
                    System.out.println(list);
                }
                else if (command.equalsIgnoreCase("revert")) {
                    list.pop();
                }
                else{
                    list.push(command);
                }

            }
            for (String string : list) {
                System.out.println(string);
            }
            //System.out.println(list);
        }


    }
}
