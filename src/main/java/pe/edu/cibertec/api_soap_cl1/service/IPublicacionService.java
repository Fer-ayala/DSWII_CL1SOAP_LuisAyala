package pe.edu.cibertec.api_soap_cl1.service;

import pe.edu.cibertec.api_soap_cl1.model.Publicacion;
import pe.edu.cibertec.ws.objects.Publicacionws;

import java.util.List;

public interface IPublicacionService {
    List<Publicacionws> listarPublicaciones();
    Publicacionws obtenerPublicacionxId(int id);
    Publicacionws registrarActualizarPublicacion(Publicacionws publicacion);
}
