//Write a Java program to print all the prime numbers between 1 and 100.
class PrimeNum{
    public static void main(String[] args){
        //Scanner sc =  new Scanner(System.in);
        
        // int a=1;
        // int end=100;
        for(int  num=2;num<=100;num++){

        int prime=0;
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                prime++;
                break;
            }
        }
        if(prime==0){
        System.out.println(num);
            }    }

}
}