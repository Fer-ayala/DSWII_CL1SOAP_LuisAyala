package pe.edu.cibertec.api_soap_cl1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_soap_cl1.convert.PublicacionConvert;
import pe.edu.cibertec.api_soap_cl1.model.Publicacion;
import pe.edu.cibertec.api_soap_cl1.repository.PublicacionRepository;
import pe.edu.cibertec.ws.objects.Publicacionws;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService{

    private PublicacionRepository publicacionRepository;
    private PublicacionConvert publicacionConvert;

    @Override
    public List<Publicacionws> listarPublicaciones() {
        return publicacionConvert.convertPublicacionToPublicacionWs(
                publicacionRepository.findAll());
    }

    @Override
    public Publicacionws obtenerPublicacionxId(int id) {
        Optional<Publicacion> publicacion = publicacionRepository.findById(id);
        return publicacion.map(value ->
                        publicacionConvert.convertPublicacionToPublicacionWs(value))
                .orElse(null);
    }

    @Override
    public Publicacionws registrarActualizarPublicacion(Publicacionws publicacionws) {
        Publicacion nuevaPublicacion = publicacionRepository.save(
                publicacionConvert.convertPublicacionwsToPublicacion(publicacionws));
        if(nuevaPublicacion == null)
            return  null;
        return publicacionConvert.convertPublicacionToPublicacionWs(nuevaPublicacion);
    }

}
