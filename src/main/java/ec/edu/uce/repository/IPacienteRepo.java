package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	
	void insertar(Paciente paciente);//create
	void buscarPorCedula(String cedula);//read
	void actualizar(Paciente paciente);//update
	void borrar(String cedula);//delete

}
