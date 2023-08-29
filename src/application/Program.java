package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1,"Books");
		
		Seller seller = new Seller(21,"Tutito", "tutito2017@hotmail.com", new Date(),4000.0, obj);
		
		SellerDao sellerdaoV = DaoFactory.createSellerDao();
		System.out.println(sellerdaoV);
		
	}

}
