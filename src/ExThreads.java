
public class ExThreads implements Runnable{
	private int id=0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void run(){
		for(int i=0; i<50;i++){
			if(id%2==0){
				if(i%2==0){
			
			System.out.println("MyThreadClass id: "+this.getId()+" value = "+i);
				}
			}
			else
				if(id%2!=0){
					if(i%2!=0){
				
				System.out.println("MyThreadClass id: "+this.getId()+" value = "+i);
					}
				}
				
		}
	}
}


