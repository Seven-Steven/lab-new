package homework.seven.session6;

public class NetWorkCenter {

	public static void main(String[] args){
		TCPClient tcpClient = new TCPClient();
		TCPServer tcpServer = new TCPServer();


		tcpClient.connect(tcpServer);

		tcpClient.disConnect(tcpServer);




	}
}
