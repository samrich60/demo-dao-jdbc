package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
import model.dao.impl.DepartmentDaoJDBC;

public class DaoFactory {

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
