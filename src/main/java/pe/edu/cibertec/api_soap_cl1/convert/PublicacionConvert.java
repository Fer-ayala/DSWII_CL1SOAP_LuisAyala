package pe.edu.cibertec.api_soap_cl1.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_soap_cl1.model.Publicacion;
import pe.edu.cibertec.ws.objects.Publicacionws;

import java.util.ArrayList;
import java.util.List;

@Component
public class PublicacionConvert {
    public Publicacion convertPublicacionwsToPublicacion(Publicacionws publicacionws){
        Publicacion publicacion = new Publicacion();
        publicacion.setIdpublicacion(publicacionws.getIdpublicacion());
        publicacion.setTitulo(publicacionws.getTitulo());
        publicacion.setResumen(publicacionws.getResumen());
        publicacion.setNomautor(publicacionws.getNomautor());
        return publicacion;

    }

    public List<Publicacion> convertPublicacionwsToPublicacion(List<Publicacionws> publicacionws){
        List<Publicacion> publicacionList = new ArrayList<>();
       publicacionws.forEach(pub ->{
            publicacionList.add(convertPublicacionwsToPublicacion(pub));
        });
        return publicacionList;
    }
    public Publicacionws convertPublicacionToPublicacionWs(Publicacion publicacion){
        Publicacionws publicacionws = new Publicacionws();
        publicacionws.setIdpublicacion(publicacion.getIdpublicacion());
        publicacionws.setTitulo(publicacion.getTitulo());
        publicacionws.setResumen(publicacion.getResumen());
        publicacionws.setNomautor(publicacion.getNomautor());
        return publicacionws;
    }
    public List<Publicacionws> convertPublicacionToPublicacionWs(List<Publicacion> publicacion){
        List<Publicacionws> publicacionList = new ArrayList<>();
        publicacion.forEach(pub ->{
            publicacionList.add(convertPublicacionToPublicacionWs(pub));
        });
        return publicacionList;
    }
}
