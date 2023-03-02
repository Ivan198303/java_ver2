package seminar4;

import java.util.ArrayList;
import java.util.Scanner;
public class sem4_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                String string = sc.nextLine();
                

                if(string.equalsIgnoreCase("print")){
                    String temp = list.get(0);
                    list.set(0,list.get(i-1));
                    list.set(i-1,temp);
                    
                }
                else if (string.equalsIgnoreCase("revert")) {
                    list.remove(i-1);
                }
                else{
                    list.add(i, string);
                }

            }
            System.out.println(list);
        }


    }
}
