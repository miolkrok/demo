package ec.edu.uce;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication
public class DemoApplication2 implements CommandLineRunner {
	
	
	private static final Logger LOG =  LoggerFactory.getLogger(DemoApplication2.class);
	//private IPacienteService pacienteService = new PacienteServiceImpl();
	//no se deberia aplicar
	@Autowired
	private IMatriculaSingletonService objeto1;
	@Autowired
	private IMatriculaSingletonService objeto2;
	@Autowired
	private IMatriculaSingletonService objeto3;
	
	
	//scope prototype
	@Autowired
	private IMatriculaPrototypeService pro1;
	@Autowired
	private IMatriculaPrototypeService pro2;
	//@Autowired
	//private IMatriculaPrototypeService objeto2;
	//@Autowired
	//private ICuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);
	}


	public void run(String... args) throws Exception {
		LOG.info("Impresion valor del objeto");
		this.objeto1.establecerValor("LUIS");
		LOG.info("objeto1");
		LOG.info(this.objeto1.obtenerCodigo());
		LOG.info("objeto2");
		LOG.info(this.objeto2.obtenerCodigo());
		this.objeto3.establecerValor("pepiro");
		LOG.info("objeto3");
		LOG.info(this.objeto3.obtenerCodigo());
		LOG.info("prototype");
		this.pro1.establecerNombre("JUANITO");
		LOG.info(this.pro1.obtenerNombre());
		LOG.info("***************prototype*************");
		this.pro2.establecerNombre("MARIA");
		LOG.info(this.pro2.obtenerNombre());
		LOG.info(this.pro1.obtenerNombre());
	}

}
