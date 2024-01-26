package com.example;

import com.example.model.Employee;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

public class HibernateTest {

    @Test
    void persist() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Employee employee1 = new Employee("employee1", 28);
        Employee employee2 = new Employee("employee2", 38);

        session.persist(employee1);
        session.persist(employee2);

        session.getTransaction().commit();

        session.close();

    }

}
