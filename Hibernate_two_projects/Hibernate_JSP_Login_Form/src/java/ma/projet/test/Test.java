/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.time.LocalDate;
import java.util.Date;
import ma.projet.entity.Client;
import ma.projet.entity.Employe;
import ma.projet.service.ClientService;
import ma.projet.service.EmployeService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author Lachgar
 */
public class Test {
    public static void main (String [] args){
        HibernateUtil.getSessionFactory();
//        ClientService cl = new ClientService();
//        Client c = cl.getByEmail("ff@gmail.com");
//         Client c2 = cl.getByEmail("ffff@gmail.com");
//               System.out.println("-------------------------------");
//        System.out.println(c);
//            System.out.println("-------------------------------");
//                     System.out.println("-------------------------------");
//        System.out.println(c2);
//            System.out.println("-------------------------------");
//        
//        System.out.println("-------------------------------");
//        System.out.println(cl.getAll());
    }
}
