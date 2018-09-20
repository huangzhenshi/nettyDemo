package chatAdvance;

 
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
public class HelloClient {
	 public static String host = "127.0.0.1";
	 public static int port = 7878;
	 public Channel ch=null;
	 public EventLoopGroup group = new NioEventLoopGroup();;
	
	 public void start() throws Exception{
				Bootstrap b = new Bootstrap();
				b.group(group).channel(NioSocketChannel.class).handler(new HelloClientInitializer());
				ch = b.connect(host, port).sync().channel();
	 }
	 
	 public void write(String msg){
		 ch.writeAndFlush(msg + "\n");
	 }
	 
	 public void shutdown(){
		 group.shutdownGracefully();
	 }
}
