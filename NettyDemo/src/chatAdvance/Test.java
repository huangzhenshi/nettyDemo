package chatAdvance;


public class Test {
	public static void main(String[] args) throws Exception {
		HelloClient client=new HelloClient();
		client.start();
		for(int i=0;i<50;i++){
			client.write("hello kitty"+i);	
		}
		
		client.write("hello kitty last 50 \n hello kitty"+51);	
		Thread.sleep(2000);
		client.shutdown();
	}
}
