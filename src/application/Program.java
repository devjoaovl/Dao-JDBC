package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1 : Seller findbyId");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller +"\n");
		
		System.out.println("=== TESTE 2 : Seller findByDepartment ====");
		Department department = new Department(2,null);		
		List<Seller> list =  sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 3 : Seller findAll ====");	
		list =  sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 4 : Seller INSERT ====");
		//Seller newSeller = new Seller(null,"Tuchito", "tuchit@hotmail.com", new Date(), 3500.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("=== TESTE 5 : Seller UPDATE ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("UPDATE COMPLETED");
		
		System.out.println("=== TESTE 6 : Seller DELETE ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
		sc.close();
		
	}

}
