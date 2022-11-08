public class Challenge9 {
    private static int armstrong(int num,int total){
        while(num != 0) {
            double rem = num % 10;
            total += Math.pow(rem, 3);
            num /= 10;
        }

        return total;
    }

    public static void main(String[] args){
        int total = 0;
        for (int i= 0;i <=100;i++){
            int num = i;
            total = armstrong(num,total);
            if (total == num)
                System.out.println(num+" is an armstrong number");


        }
    }
}
