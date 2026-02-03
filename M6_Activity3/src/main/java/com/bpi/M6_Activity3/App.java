package com.bpi.M6_Activity3;

import jakarta.persistence.EntityManager;


public class App {
	

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			runM6Activity3(em);
				} finally {
					EntityManagerUtil.getInstance().closeEntityManager(em);
					EntityManagerUtil.getInstance().shutdownFactory();
				}
		}
	   
	   public static void runM6Activity3(EntityManager em) {
		    try {
		        em.getTransaction().begin();

		        Student student = new Student("Alexis Sakalam", 44, "alexismnisms@example.com");
		        em.persist(student);

		        Course math = new Course("Mathematics", "A", student);
		        Course science = new Course("Science", "B", student);

		        em.persist(math);
		        em.persist(science);

		        em.getTransaction().commit();
		        System.out.println("Student and courses persisted successfully!");
		    } catch (Exception e) {
		        if (em.getTransaction().isActive()) {
		            em.getTransaction().rollback();
		        }
		        e.printStackTrace();
		    } finally {
		        if (em.isOpen()) {
		            em.close();
		        }
		    }
		}
}
