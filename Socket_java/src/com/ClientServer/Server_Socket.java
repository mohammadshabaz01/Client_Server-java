package com.ClientServer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Server_Socket {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Server is Started !");
		ServerSocket sv = new ServerSocket(9999);
		System.out.println("Server is waiting for Client request !");
		Socket s =sv.accept();
		System.out.println("Client is Connected !");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str= br.readLine();
		System.out.println("Client Data : "+ str);
		//sv.close();
		
	}

}
