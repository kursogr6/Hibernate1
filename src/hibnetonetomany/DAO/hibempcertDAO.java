/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibnetonetomany.DAO;

import hibnetonetomany.mapping.Employee;
import hibnetonetomany.util.HibernateUtil;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author CAN
 */
public  class hibempcertDAO {
    

    public static  Integer addEmployee(String fname, String lname, int salary, Set cert) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);
            employee.setCertificates(cert);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

}
