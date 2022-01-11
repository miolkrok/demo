package ec.edu.uce.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(EstudianteRepoImpl.class);

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.info("Se guardo en la base: " +estudiante);
	}

	@Override
	public void buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		LOG.info("buscando a: " +cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.info("actualizando a : " +estudiante);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		LOG.info("borrando a: " +cedula);
		LOG.error("HA ocurrido un error fatal en la eliminacion");
	}

}
