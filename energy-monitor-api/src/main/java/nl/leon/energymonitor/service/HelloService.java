package nl.leon.energymonitor.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import nl.leon.energymonitor.model.Person;

@Path("/hello")
@XmlRootElement
public class HelloService 
{
	@Autowired
	MongoTemplate mongoTemplate;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
   	public String message() 
    {
    	
   		return "Hello World";
   	}
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPerson(Person person)
    {
    	mongoTemplate.save(person);
	    return Response.ok().entity(person).build();

    }
}