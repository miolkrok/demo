package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	
	void calcularDeuda();
	
	void guardar(Paciente paciente);//create
	
	void buscarPaciente(String cedula);//read
	
	void actualizarPaciente(Paciente paciente);//update
	
	void borrarPaciente(String cedula);//delete

}
