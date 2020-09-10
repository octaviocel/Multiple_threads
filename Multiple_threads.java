
public class Multiple_threads {
	public static void main(String[] args) {

        Thread t_1 = new numero();
        Thread t_2 = new letra();
        t_1.start();
        t_2.start();


        }

}
class numero extends Thread  {

    public void run(){
        for(int i = 0; i<10000;i++){
            System.out.println(i);
        }
    }
}
class letra extends Thread {

    public void run(){
        for(int i = 0; i<100000000;i++){

            System.out.println("a");
        }
    }
}
