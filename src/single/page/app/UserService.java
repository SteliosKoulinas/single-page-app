package single.page.app;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/users")

public class UserService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String users() {
		String users = null;

		ArrayList<User> userList = new ArrayList<User>();
		try {
			userList = new AccessManager().getUsers();
			Gson gson = new Gson();
			users = gson.toJson(userList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}
	@POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(User track) {

        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();
        
    }

}