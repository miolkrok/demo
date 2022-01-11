package ec.edu.uce.service.scope;



import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MatriculaSingletonServiceImpl implements IMatriculaSingletonService {

	
	
	private String codigo;
	

	
	@Override
	public String establecerValor(String valor) {
		this.codigo = valor;
		
		return this.codigo;
	}

	//Metodos set y get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String obtenerCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

}
