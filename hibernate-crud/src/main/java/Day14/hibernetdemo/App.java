package Day14.hibernetdemo;

import java.util.Iterator;
import java.util.List;

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
    	//crete
//    	Product product = new Product();
//    	product.setId(101);
//    	product.setImageUrl("some ur");
//    	product.setName("Product 1");
//    	product.setPrice(900);
//    	product.setSeller("some seller");
//    	session.save(product); // we use save() to save an obj into db
    	
    	//update
    	Product product = new Product();
    	product.setId(102);
    	product.setImageUrl("some ur");
    	product.setName("Product 2");
    	//product.setPrice(900); // if we dont give any col values it will set it to null
    	product.setSeller("some seller 3");
    	//session.save(product); // we use save() to save an obj into db
    	 session.update(product);
    		
    		
    		
    		// if we are using update we shold pass all the col values. if not if u want to pass only specific col values u shld use hql
    
     //read  // iterating a list of products
    		List <Products> products = session.createQuery("from Product").list();	
    		
    		Iterator it = products.iterator();
    		
    		while(it.hasNext()) {
    			Product prod = (Product)it.next();
    			System.out.println(prod.getId()+"\t"+prod.getImageUrl()+"\t"+prod.getName()+"\t"+prod.getPrice());
    			
    		}
    		
    		
    		
    	//del a product
    		// if we want a single obj we use get(). if we want list of objects go for createQuery
    		Product prod =session.get(Product.class,101);
    		session.delete(prod);//del prod 2
    		
    		
    		transaction.commit();
    
    }
}
