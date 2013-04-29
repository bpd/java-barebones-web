package web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class WebServer
{
	public static void main(String[] args) throws Exception
	{
		Server server = new Server(8080);
		
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(ExampleServlet.class, "/*");
		server.setHandler(handler);
		
		server.start();
		server.join();
	}
}
