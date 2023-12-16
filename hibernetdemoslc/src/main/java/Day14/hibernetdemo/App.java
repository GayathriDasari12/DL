package Day14.hibernetdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//load config
    	
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory factory = meta.getSessionFactoryBuilder().build();
    	
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Product product = new Product();
    	product.setId(101);
    	product.setImageUrl("some ur");
    	product.setName("Product 1");
    	product.setPrice(900);
    	product.setSeller("some seller");
    	session.save(product); // we use save() to save an obj into db
    	
    		transaction.commit();
    }
}
