public class Challenge7 {
    public static void main(String[] args) {
        int numb = Integer.parseInt(args[0]);
        boolean check = false;
        for (int i =2;i<numb/2;i++){
        if(numb % i == 0){
            check = true;
            break;
            }
        }
        if(check)
            System.out.println(numb + " is not a prime number");
        else
            System.out.println(numb +" is a prime number");
        }
    }

