package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Rios2700Tp5Application implements CommandLineRunner{
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;

	public static void main(String[] args) {
		SpringApplication.run(Rios2700Tp5Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		usuario.setApellido("Perez");
		usuario.setDireccion("AV Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		cuota.setEstado("MOROSO");
		cuota.setFechaPago(LocalDate.of(2020, 3, 11));
		cuota.setId(1);
		cuota.setMonto(200);
		cuota.setPeriodo("VERANO");
		cuota.setUsuario(usuario);
		
		cuotaService.guardar();
	}
	
	

}
