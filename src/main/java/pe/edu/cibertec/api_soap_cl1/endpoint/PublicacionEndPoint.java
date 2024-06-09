package pe.edu.cibertec.api_soap_cl1.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.api_soap_cl1.exception.NotFoundException;
import pe.edu.cibertec.api_soap_cl1.service.PublicacionService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class PublicacionEndPoint {
    private PublicacionService publicacionService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPublicacionesRequest")
    @ResponsePayload
    public GetPublicacionesResponse getPublicaciones(@RequestPayload
                                                     GetPublicacionesRequest request){
        GetPublicacionesResponse response = new GetPublicacionesResponse();
        response.getPublicaciones().addAll(publicacionService.listarPublicaciones());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPublicacionRequest")
    @ResponsePayload
    public GetPublicacionResponse getPublicacion(@RequestPayload
                                                 GetPublicacionRequest request){
        GetPublicacionResponse response = new GetPublicacionResponse();
        Publicacionws publicacionws = publicacionService.obtenerPublicacionxId(request.getId());
        if(publicacionws == null)
            throw new NotFoundException("La Publicacion con el ID " + request.getId()+" no existe!");
        response.setPublicacion(publicacionws);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postPublicacionRequest")
    @ResponsePayload
    public PostPublicacionResponse savePublicacion(@RequestPayload
                                               PostPublicacionRequest request){
        PostPublicacionResponse response = new PostPublicacionResponse();
        response.setPublicacion(publicacionService.registrarActualizarPublicacion(
                request.getPublicacion()));
        return response;
    }
}
