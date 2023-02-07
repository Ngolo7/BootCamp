public class FourFunctionTestAgain {
    public static void main(String[] args) {
        Banking cal = new Banking();
        cal.CalculateSimpleInterest();
        cal.CalculateSimpleInterest2(5000, 3, 2.5f);

        float si = cal.CalculateSimpleInterest3(3000, 2, 3.6f);
        System.out.println("Interest you make is:" + si);

        cal.CalculateSimpleInterest4();
        float s = cal.CalculateSimpleInterest4();
        System.out.println("Interest you make is:" +s);
    }
}
class Banking {
    void CalculateSimpleInterest() {
        int p = 10000; //capital
        int t = 4;  //time
        float r = 4.5f; //rate of interest
        float SI = (p * t * r) / 100;
        System.out.println("Interest you make is:" + SI);
    }

    void CalculateSimpleInterest2(int p, int t, float r) {
        float SI = (p * t * r) / 100;
        System.out.println("Interest you make is :" + SI);
    }

    float CalculateSimpleInterest3(int p, int t, float r) {
        float SI = (p * t * r) / 100;
        return SI;
        //System.out.println("Interest you make is :" + SI);
    }

    float CalculateSimpleInterest4() {
        float SI = (9000 * 5 * 3.7f) / 100;
        return SI;
        //System.out.println("Interest you make is :" + SI);
    }


}

