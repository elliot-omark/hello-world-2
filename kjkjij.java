public class kjkjij{

    public void run(){
        int i=0;
        int k=4;
        int a=6;
        int b=18;
        System.out.println(" ");
        do{
            System.out.println("i is "+ i +" but is less than 10");
            i=i+1;
        }while(i<15);
        do{
            System.out.println("k is "+ k +" but is greater than 5");
            k=k+1;
        }while(k>5&&k<10);
        do{
            System.out.println("a is "+ a +" but is less than 10");
            System.out.println("b is "+ b +" but is less than or equal to 20");
            a=a+1;
            b=b+1;
        }while(a<10&&b<=20);
    }

    public static void main(String[] args){
        kjkjij hw = new kjkjij();
        hw.run();
    }
}
