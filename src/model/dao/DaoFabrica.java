package model.dao;

import model.dao.impl.VendedoDaoJDBC;

public class DaoFabrica {
	
	public static VendedorDao createvendedordao() {
		return new VendedoDaoJDBC();
	}

		
}
