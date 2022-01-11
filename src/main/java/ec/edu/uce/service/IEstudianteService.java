package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {
	void calcularDeuda();
	
	void guardar(Estudiante estudiante);//create
	
	void buscarEstudiante(String cedula);//read
	
	void actualizarEstudiante(Estudiante estudiante);//update
	
	void borrarEstudiante(String cedula);//delete

}
