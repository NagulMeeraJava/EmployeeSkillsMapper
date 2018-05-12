package com.niit.skillsmapper.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.skillsmapper.dao.EmployeeDetails;
import com.niit.skillsmapper.dao.EmployeeOperations;
import com.niit.skillsmapper.dao.SkillsDetails;
import com.niit.skillsmapper.model.EmployeeModel;
import com.niit.skillsmapper.model.SkillsModel;
import com.niit.skillsmapper.service.EmployeeService;
import com.niit.skillsmapper.service.EmployeeServiceImpl;


/**
 * @author Administrator
 *
 */

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class SkillsMapperApplication 
{
	@Bean
	public DataSource getDatasource()
	{
	BasicDataSource datasource=new BasicDataSource();
	datasource.setDriverClassName("org.h2.Driver");
	datasource.setUrl("jdbc:h2:tcp://localhost/~/SkillsMapper");
    datasource.setUsername("sa");
    datasource.setPassword("sa");
    return datasource;
		
	}
    private Properties getHibernateProperties()
    {
        Properties props=new Properties();
        props.setProperty("hibernate.show_sql","true");
        props.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
        props.setProperty("hibernate.hbm2ddl.auto","update");
     	props.setProperty("hibernate.format_sql","true"); 
        
        props.setProperty("hibernate.jdb.user_get_generated_keys","true");
	return props;
     }
    
    
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource){
       LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
       sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(EmployeeModel.class);
	sessionBuilder.addAnnotatedClass(SkillsModel.class);
       return sessionBuilder.buildSessionFactory();
    }

    @Bean(name="transactionManager")
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
       HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
	return transactionManager;
    }
    


}