/* package com.byzthr.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;

import com.byzthr.hibernate.model.Car;

//@Configuration
public class HibernateCannonConfig {

    @Bean
    public StandardServiceRegistry standardServiceRegistry() {
        return new StandardServiceRegistryBuilder().build(); // uses default bootstrapRegistry
    }

    @Bean
    public SessionFactory sessionFactory() {
        MetadataSources sources = new MetadataSources(standardServiceRegistry());
        sources.addAnnotatedClass(Car.class);
        sources.addAnnotatedClassName("com.byzthr.hibernatehelloworld.model.Car");
                                                                // uses default metadata config (Naming strategy, Schema, Attributes)
        return sources.buildMetadata().buildSessionFactory();   // uses default SessionFactory config (Interceptor, Observer, Bean Manager)
    }
}
 */