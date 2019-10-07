package model.dao;

import db.DB;
import model.dao.impl.VendedoDaoJDBC;

public class DaoFabrica {
	
	public static VendedorDao createvendedordao() {
		return new VendedoDaoJDBC(DB.getConnection());
		
	}

		
}
