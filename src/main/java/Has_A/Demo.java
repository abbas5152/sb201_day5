package sb201_day5_hasA;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           EntityManager em=   Persistence.createEntityManagerFactory("empUnit").createEntityManager();
           
           Employe emp=new Employe();
           
           emp.setName("Abbas");
           emp.setGender("M");
           emp.setSalary(10000);
           
           emp.getEmpAddress().add( new Address("gj","jam","657643","home"));
           emp.getEmpAddress().add( new Address("gj","raj","643643","office"));
           
           em.getTransaction().begin();
           
           em.persist(emp);
           
           em.getTransaction().commit();
           em.close();
           
	}

}
