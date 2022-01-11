package ec.edu.uce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	//private IPacienteService pacienteService = new PacienteServiceImpl();
	//no se deberia aplicar
	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private ICuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		Paciente miPaciente = new Paciente();
//		miPaciente.setNombre("luis");
//		miPaciente.setApellido("ortiz");
//		miPaciente.setEdad(24);
//		this.pacienteService.guardar(miPaciente);
//		miPaciente.setEdad(25);
//		this.pacienteService.actualizarPaciente(miPaciente);
//		this.pacienteService.buscarPaciente("1718496944");
//		this.pacienteService.borrarPaciente("1718496944");
//		
//		Estudiante miEstudiante = new Estudiante();
//		miEstudiante.setNombre("luis");
//		miEstudiante.setApellido("ortiz");
//		miEstudiante.setUniversidad("uce");
//		this.estudianteService.guardar(miEstudiante);
//		miEstudiante.setUniversidad("udla");;
//		this.estudianteService.actualizarEstudiante(miEstudiante);
//		this.estudianteService.buscarEstudiante("1718496944");
//		this.estudianteService.borrarEstudiante("1718496944");
//	}
	public void run(String... args) throws Exception {
//		Cuenta cuenta = new Cuenta();
//		cuenta.setNumero("1718496944");
//		cuenta.setSaldo(new BigDecimal("1000.89"));
//		
//		this.cuentaService.ingresarCuentaHabiente(cuenta);
	}

}
