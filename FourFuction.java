public class FourFuction {
    public static void main(String[] args) {

        Account Object1 = new Account();  //  1st object
        Account Object2 = new Account();  //  2nd object
        Account Object3 = new Account();  // 3rd object

        //set the
        Object1.setAccount("Kamal Gurung", 17827, 100000);
        Object2.setAccount("Shailesh Ghale", 62343, 50000);
        Object3.setAccount("Dhawa Lama", 36623, 45000);

        Object1.printAccount();
        Object2.printAccount();
        Object3.printAccount();


    }
}


class Account {
    // fields of the class
    private String AccountName;
    private int AccountNumber;
    private float AccountBalance;

    void setAccount(String x, int y, float z){
         AccountName = x;
         AccountNumber = y;
         AccountBalance = z;

    }
    void printAccount(){
        System.out.println("Your Account Name is:"+AccountName);
        System.out.println("Your Account Number is:" +AccountNumber);
        System.out.println("Your Account Balance is:" +AccountBalance);
        System.out.println(".................................");

    }
}