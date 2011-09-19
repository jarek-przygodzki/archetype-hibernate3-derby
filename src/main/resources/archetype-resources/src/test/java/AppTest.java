#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import ${package}.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGetCurrentSession() throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @Test
    public void testEmptyTransaction() throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.getTransaction().commit();
    }
}
