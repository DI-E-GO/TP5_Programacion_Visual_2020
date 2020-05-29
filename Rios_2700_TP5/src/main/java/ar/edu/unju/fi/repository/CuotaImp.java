package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Rios2700Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Rios2700Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("La Cuota fue guardada "+cuota.getUsuario());
	}

	@Override
	public Cuota mostrar() {
		LOG.info("Mostrar los datos de la Cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino la Cuota");
	}

	@Override
	public Cuota modificar() {
		LOG.info("Se modifico la cuota de la BD");
		return cuota;
	}

}
