package com.palencia77;

import com.palencia77.modelo.Automovil;
import com.palencia77.modelo.Opcional;
import com.palencia77.repositorio.AutomovilDAO;
import com.palencia77.repositorio.OpcionalDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AutomovilApplication {


	public static void main(String[] args) {
		SpringApplication.run(AutomovilApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AutomovilDAO automovilDAO, OpcionalDAO opcionalDAO){
		System.out.println("AutomovilApplication.init");
		automovilDAO.deleteAll();
		opcionalDAO.deleteAll();

		Automovil automovil = new Automovil();
		automovil.setNombre("Basico Sedan");

		Set<Opcional> opcionales = new HashSet<Opcional>();

		Opcional aireAcondicionado = new Opcional();
		aireAcondicionado.setId(0);
		aireAcondicionado.setCodigo("AA");
		aireAcondicionado.setDescripcion("Aire Acondicionado");
		aireAcondicionado.setPrecio(20_000d);
		opcionalDAO.save(aireAcondicionado);
		opcionales.add(aireAcondicionado);

		Opcional frenosABS = new Opcional();
		frenosABS.setId(1);
		frenosABS.setCodigo("ABS");
		frenosABS.setDescripcion("Frenos ABS");
		frenosABS.setPrecio(14_000d);
		opcionalDAO.save(frenosABS);
		opcionales.add(frenosABS);

		automovil.setOpcionales(opcionales);
		automovilDAO.save(automovil);

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

			}
		};
	}
}
