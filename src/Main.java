import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //class BirthMonthCalc
        //  main()
        //      num birthMonth
        //      Output “What is your birth month (1-12)?”
        //      Input birthMonth
        //      if birthMonth < 1 or birthMonth > 12 then
        //          Output "You entered an incorrect month value: " + birthMonth
        //      else
        //          Output "Your birth month is: " + birthMonth
        //      end if
        //  return
        //end class
        Scanner in = new Scanner(System.in);
        int birthMonth;
        System.out.println("What is your birth month (1-12)?");
        birthMonth = in.nextInt();
        in.nextLine();
        if(birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);

        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}