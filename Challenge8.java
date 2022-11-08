public class Challenge8 {
    public static void main(String[] args){
        int numb = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int hcf = 0;
        for (int i = 1;i<=numb && i <=numb2;i++){
            if(numb%i ==0 && numb2%i ==0)
                hcf = i;
        }
        System.out.println("The highest common factor between "+numb+" and "+numb2+" is "+hcf);
    }
}
