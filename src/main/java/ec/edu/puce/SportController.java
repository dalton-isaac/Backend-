package ec.edu.puce;

import ec.edu.puce.sport.model.Jugador;
import ec.edu.puce.sport.model.JugadorBasico;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/sport")
public class SportController {

    /*
    @GET

    public void saludar() {
        System.out.println("Hola");
    }

    @GET
    @Path("/procesar")
    public String procesar() {
        return "Procesando";
    }

    @GET
    @Path("/crear")
    public Response crearJugador(){
        Jugador jugador = new Jugador();
        jugador.setCodigo(1);
        jugador.setNombre("Isaac");
        jugador.setFecha(LocalDate.of(2003,10, 23));
        jugador.setEquipo("Desarrollo");

    System.out.println("El equipo %s esta conformado por los siguientes jugadores: %d -%s."
            .formatted(jugador.getEquipo(), jugador.getCodigo(), jugador.getNombre()
             ));
    return Response.status(Response.Status.CREATED).entity(jugador).build();
    }

    */

    List<JugadorBasico> jugadores = new ArrayList<>();


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Response crearJugadorBasico(JugadorBasico jugador){
       // JugadorBasico jugadorBasico = new JugadorBasico(2,"Diana",LocalDate.now());
       // System.out.println("El jugador basico tiene el codigo %d, su nombre es %s y su fecha de nacimiento es %s"
         //       .formatted(jugadorBasico.nombre()));
        System.out.println("El jugador es: %s".formatted(jugador.nombre()));
        jugadores.add(jugador);
        System.out.println("La lista contiene %s registros".formatted(jugadores.size()));
        return Response.status(Response.Status.CREATED).entity(jugador).build();


    }


}
