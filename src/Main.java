
public class Main {
	  public static void main(String[] args){
		  ExThreads firstThread= new ExThreads();
		  firstThread.setId(1);
		  Thread thread1= new Thread(firstThread);
		  
		  ExThreads secondThread= new ExThreads();
		  secondThread.setId(2);
		  Thread thread2=new Thread(secondThread);
		  
		  thread1.start();
		  thread2.start();
	  }

}
