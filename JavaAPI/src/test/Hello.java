package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//http://localhost:8080/JavaAPI/rest/hello?name=UTSAVA&Card_no=455089&Amount=50022
@Path("/hello")
public class Hello {	
		 
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String sayHelloHTML() { String resource
	 * = "<h1>Hi Utsav, this is hello from HTML</h1>"; return resource;
	 * 
	 * }
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("Card_no") String CardNo, @QueryParam("Amount") int amount) {
		/*
		 * String resource = "<h1>Hi Utsav, this is hello from HTML</h1>"; return
		 * resource;
		 */
		String response;
		if (amount>100000){
			response="Credit card is not approved";
		}
		else {
			response="Credit card is approved";
		}
		 return "<html>"+"<title>"+"Credit Card Authorization"+name+"</title>"
		+ "<body><h1>"+response+"</h1></body>"+"</html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String resource = "<? xml version='1.0' ?>"+
				"<hello>Hi Utsav, this is hello from XML</hello>";
		return resource;
		 
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() {
		String resource = null;
		return resource;
	}

}
