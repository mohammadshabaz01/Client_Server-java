package com.ClientServer;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) throws Exception {
		String IpAdd ="localhost";
		int portNo =9999;
		//will make an object of the Socket class so that we can connect to the server
		Socket s = new Socket(IpAdd,portNo);
		//Client Socket carry two thing 1:- Ip address of server 2:-port no.
		String str = "Shabaz";
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream()); // converting data into a stream format
		//because we are sending data to the output port of the socket
		PrintWriter out = new PrintWriter(os);
		os.write(str);
		//os.close();
		os.flush();
		
	}
}
