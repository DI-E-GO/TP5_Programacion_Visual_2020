package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Rios2700Tp5Application;
import ar.edu.unju.fi.model.Noticia;
@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Rios2700Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("Se guardo una notica con el titulo: "+noticia.getTitulo());
	}

	@Override
	public Noticia mostrar() {
		LOG.info("Mostrando datos de una noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino una noticia de la BD");
	}

	@Override
	public Noticia modificar() {
		LOG.info("Se modifico una noticia de la BD");
		return noticia;
	}

}
