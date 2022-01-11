package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;



@Service
public class PacienteServiceImpl implements IPacienteService {
	
	//private PacienteRepoImpl paciente = new PacienteRepoImpl();
	//desacoplamos con spring
	//private IPacienteRepo paciente = new PacienteRepoImpl();
	//no se deb acoplar
	@Autowired
	private IPacienteRepo paciente;
	
	@Override
	public void calcularDeuda() {
		// Traer de la base la deuda
		//Multiplicar por el 12%
		//calcular la multa
		//...... toda la logica que me involucra calcularDeuda
		
		
	}

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciente.insertar(paciente);
		
	}

	@Override
	public void buscarPaciente(String cedula) {
		// TODO Auto-generated method stub
		this.paciente.buscarPorCedula(cedula);
		
		
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciente.actualizar(paciente);
	}

	@Override
	public void borrarPaciente(String cedula) {
		// TODO Auto-generated method stub
		this.paciente.borrar(cedula);
	}

}
