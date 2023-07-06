package sub3;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ThreadSender extends Thread {
	
	private Socket socket;
	
	public ThreadSender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
		}catch (Exception e) {
			
		}finally {
			
			try {
				if (socket != null && !socket.isClosed()) {
				} socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
