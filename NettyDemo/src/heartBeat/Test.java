package heartBeat;

public class Test {
	public static void main(String[] args) throws Exception {
		 HelloClient client=new HelloClient();
 		 client.start();
		 for(int i=0;i<2;i++){
			client.write("hello kitty"+i);	
		 }
		
		Thread.sleep(30000);
		
		client.shutdown();
	}
}
