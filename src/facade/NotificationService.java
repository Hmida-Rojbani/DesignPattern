package facade;

public class NotificationService { // facade
	public void send(String message, String target) {
		NotificationServer server = new NotificationServer();
		Connection connection = server.connect("ip");
		AuthToken authToken = server.authenticate("appId", "key");
		server.send(authToken, new Message(message),target);
		connection.disconnect();
	}
}
