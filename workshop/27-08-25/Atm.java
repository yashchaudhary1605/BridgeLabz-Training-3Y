import java.util.*;
public class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ans =0;
        while(true){
            System.out.println("Enter Transaction Type(1. Deposit, 2. Withdrawl, any other to Stop):");
            int TransactionType = sc .nextInt();
            String Category;
            switch(TransactionType){
                case 1:
                    Category = "Deposit";
                    break;
                case 2:
                    Category = "Withdrawl";
                    break;
                default:
                    Category = "Stop";
            }
            System.out.println("You have selected: "+Category);
            if(Category=="Stop"){
                ans = Balance(arr);
                break;
            }
            else if(Category == "Deposit") {
                System.out.println("Enter the Amount of Transaction: ");
                arr.add(sc.nextInt());
            }
            else{
                System.out.println("Enter the Amount of Transaction: ");
                int a = sc.nextInt();
                arr.add(-a);
            }
        }
        if(ans<0){
            System.out.println("Overdraft!");
        }
        else{
            System.out.println("Your total amount will be: "+ ans);
        }
        sc.close();
    }
    static int Balance( ArrayList<Integer> arr){
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            ans =ans + arr.get(i);
        }
        return ans;
    }
}