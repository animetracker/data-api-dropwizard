package database;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class ExampleResource 
{
	private final myDAO mydao;
	
	public ExampleResource(myDAO mydao)
	{
		this.mydao = mydao;
	}
	
	@GET
	@Path("/findTitlesByUser/{user_id}")
	public Response findIdByTitle(@PathParam("user_id") String user_id)
	{
		return Response.ok(mydao.findTitlesByUser(user_id)).build();
	}

	@GET
	@Path("/findTitle/{user_id}/{title}")
	public Response findTitle(@PathParam("user_id") int user_id, @PathParam("title") String title)
	{
		return Response.ok(mydao.findTitle(user_id, title)).build();
	}

	@GET
	@Path("/list/{user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList(@PathParam("user_id") int user_id)
	{
		return Response.ok(mydao.getList(user_id)).build();
	}

	@POST
	@Path("/insert")
	public Response post(ExampleObject object)
	{
		if(object!=null)
		{
			mydao.insert(
					object.getUser_id(),
					object.getAnilist_id(),
					object.getTitle(),
					object.getNext_episode_number(),
					object.getAir_date(),
					object.getStatus(),
					object.getCover_image(),
					object.getDescription(),
					object.getNotification_on(),
					object.getNotification_change()
			);
			return Response.ok().build();
		}
		return Response.serverError().build();
	}

	@POST
	@Path("/remove/{user_id}/{anilist_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("user_id") int user_id, @PathParam("anilist_id") int anilist_id)
	{
		mydao.remove(user_id, anilist_id);
		return Response.ok().build();
	}

	@POST
	@Path("/updateAiringSeries/{user_id}/{anilist_id}")
	public Response updateAiringSeries(SeriesAiringUpdateObject object, @PathParam("user_id") int user_id, @PathParam("anilist_id") int anilist_id)
	{
		if(object!=null)
		{
			mydao.updateAiring(
					user_id,
					anilist_id,
					object.getNext_episode_number(),
					object.getAir_date(),
					object.getStatus()
			);
			return Response.ok().build();
		}
		return Response.serverError().build();
	}


	
	
	
	
}
