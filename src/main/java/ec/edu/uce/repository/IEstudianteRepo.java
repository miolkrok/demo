package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	void insertar(Estudiante estudiante);//create
	void buscarPorCedula(String cedula);//read
	void actualizar(Estudiante estudiante);//update
	void borrar(String cedula);//delete

}
