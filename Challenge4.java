public class Challenge4 {
    public static void main(String[] args){
        int numb = Integer.parseInt(args[0]);
        int total = 1;
        for(int i=2;i<=numb;i++){
            total *= i;

        }
        System.out.println(total);
    }
}