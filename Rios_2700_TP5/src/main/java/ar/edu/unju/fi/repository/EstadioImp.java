package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Rios2700Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Rios2700Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("Se guardo un Estadio con el nombre: "+estadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		LOG.info("mostrando datos de un estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino un estadio de la BD");
	}

	@Override
	public Estadio modificar() {
		LOG.info("Se modifico los datos de un estadio de la BD");
		return estadio;
	}

}
