public class kjkjij{

    public void run(){
        int i=0;
        int k=4;
        int a=6;
        int b=18;
        System.out.println(" ");
        do{
            System.out.println("this will run as long as i<15");
            i=i+1;
        }while(i<15);
        do{
            System.out.println("this will run as long as 10 > k > 5");
            k=k+1;
        }while(k>5&&k<10);
        do{
            System.out.println("this will run as long as a < 10");
            System.out.println("this will run as long as b < 20");
            a=a+1;
            b=b+1;
        }while(a<10&&b<=20);
    }

    public static void main(String[] args){
        kjkjij hw = new kjkjij();
        hw.run();
    }
}
