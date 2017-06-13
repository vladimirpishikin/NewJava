import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        day+=1;
        if(day<=31){
            System.out.print(day + ".");
            System.out.print(month + ".");
            System.out.print(year + ".");
        }
         else{
            month++;}
            if(month>12){
                year++;
                System.out.print("01."+"01.");
                System.out.print(year);
             }
             else{
                System.out.print("01.");
                System.out.print(month);
                System.out.print(".");
                System.out.print(year);
            }
        }
    }
