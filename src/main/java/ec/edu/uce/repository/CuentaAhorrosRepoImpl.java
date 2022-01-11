package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cuenta;

@Repository
@Qualifier("ahorros")
public class CuentaAhorrosRepoImpl implements ICuentaRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaAhorrosRepoImpl.class);

	@Override
	public void crear(Cuenta cuenta) {
		LOG.info("se ha ingresado una nueva cuenta y se guarda en  PostgresSQL"+cuenta);
		
	}

}
