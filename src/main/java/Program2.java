public class Program2 {

    public static void main(String[] args) {
        //task №1
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        //task №2
        int sum = (num1 + num2) + (num3 + num4);
        System.out.println(sum);

        int sum1 = num1 + num2;
        int sum2 = num3 + num4;

        //task №3
        if (sum1 < sum2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //task №4
        int incrementSum1 = ++sum1;
        System.out.println(incrementSum1);

        //task №5
        int decrementSum2 = --sum2;
        int decrementSum3 = --decrementSum2;
        System.out.println(decrementSum3);

        //task №6
        if (incrementSum1 > decrementSum3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //task №7
        if (incrementSum1 % 2 == 0 || decrementSum3 % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
