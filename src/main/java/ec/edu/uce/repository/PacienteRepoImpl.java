package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(PacienteRepoImpl.class);

	@Override
	public void insertar(Paciente paciente) {
		//System.out.println("Se guardo en la base " +paciente);
		LOG.info("Se guardo en la base: " +paciente);
		
	}

	@Override
	public void buscarPorCedula(String cedula) {
		//System.out.println("buscando a:  " +cedula);
		LOG.info("buscando a: " +cedula);
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		//System.out.println("Actualizando a: " +paciente);
		LOG.info("actualizando a : " +paciente);
		
	}

	@Override
	public void borrar(String cedula) {
		//System.out.println("Borrando a: " +cedula);
		LOG.info("borrando a: " +cedula);
		LOG.error("HA ocurrido un error fatal en la eliminacion");
		
	}

}
