public class Challenge10 {
    public static void main(String[] args){
        int first =0;
        int second = 1;
        int numb = Integer.parseInt(args[0]);
        for (int i = 1; i<=numb;i++){
            System.out.println(first);
            int temp = first +second;
            first = second;
            second = temp;



        }
    }
}
