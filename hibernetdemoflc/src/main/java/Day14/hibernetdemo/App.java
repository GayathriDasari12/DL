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
    	
    	Session session = factory.openSession();//user 1
    	
    	Transaction transaction = session.beginTransaction();
    	
//    	Product product = new Product();
//    	product.setId(101);
//    	product.setImageUrl("some ur");
//    	product.setName("Product 1");
//    	product.setPrice(900);
//    	product.setSeller("some seller");
//    	session.save(product); // we use save() to save an obj into db
    	
    	
    	Product product = session.get(Product.class,101);
    	System.out.println(product.getName());
    	
    	Product product2 = session.get(Product.class,101);
    	System.out.println(product2.getName()); // checks if cache has the obj data. it has here. so it gives data from cache
    	
    	Product product3 = session.get(Product.class,103);
    	System.out.println(product3.getName()); // cache doesnt have data. so it makes an db call
    	
    	Product product4 = session.get(Product.class,103);
    	System.out.println(product4.getName()); // checks if cache has the obj data. it has here. so it gives data from cache
    	
    	
    	Session session2 = factory.openSession();//user 2
    	
    	Product p1 = session2.get(Product.class,101);
    	System.out.println(p1.getName());//makes call bcz its diff session
    	
    	Product product2 = session2.get(Product.class,101);
    	System.out.println(product2.getName()); // checks if cache has the obj data. it has here. so it gives data from cache
    	
    	Product product3 = session22.get(Product.class,103);
    	System.out.println(product3.getName()); // cache doesnt have data. so it makes an db call
    	
    	Product product4 = session.get(Product.class,103);
    	System.out.println(product4.getName()); 
    	
//    	
    		transaction.commit();
    		session.close();
    }
}
