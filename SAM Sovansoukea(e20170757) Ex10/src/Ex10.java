import java.util.Scanner;

public class Ex10 {
    public static void main(String[]args) {
        int in = 0,sum=0;

        while (in < 1) {
            System.out.print("\n Welcome to planting shop\n**Menu**\n "
            		+ "1. Rose\n2. Aster\n3. Lavander\n4. Jasmines \n5. Sunflower\n6. exit\n");
            int n,b,a;
            //char a;
            Scanner nu1 = new Scanner(System.in);
            System.out.print("\nEnter plant number that your want to buy:");
            n = nu1.nextInt();


            if (n == 1) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter among of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("What size you need?(S for small M for medium and L for large):");
                a = nu10.nextInt();
              //  System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 10 * b;
                   // System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 15 * b;
                   // System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 20 * b;
                  //  System.out.print("\n" + sum);
                }
            }
            else if (n == 2) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter among of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("What size you need?(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                  //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                   // System.out.print("\n" + sum);
                }
            }
            else if (n == 3) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter among of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("What size you need?(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }
            else if (n == 4) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter among of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("What size you need?(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }
            else if (n == 5) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter among of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("What size you need?(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }

     else {

                break;
            }
        }
        System.out.print("\n Total= " + sum+"\n");

    }
}
