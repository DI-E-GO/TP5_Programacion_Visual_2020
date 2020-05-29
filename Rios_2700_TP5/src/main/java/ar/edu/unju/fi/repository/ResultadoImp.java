package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Rios2700Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Rios2700Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("Se guardo el resultado");
	}

	@Override
	public Resultado mostrar() {
		LOG.info("Mostrando datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino un Resultado de la BD");
	}

	@Override
	public Resultado modificar() {
		LOG.info("Se modifico el resultado de la BD");
		return resultado;
	}

}
