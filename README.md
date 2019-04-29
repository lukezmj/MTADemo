## 1. Download Spring liberary
Download the latest version of Spring framework binaries from https://repo.spring.io/release/org/springframework/spring

## 2. Spring Container
![Spring_arch](https://www.tutorialspoint.com/spring/images/spring_ioc_container.jpg) <br/>
Create objects, configure them and manage their complete lifecycle.

* Spring BeanFactory Container (function included by Application Container, yet better performance)<br/>
`import org.springframework.beans.factory.BeanFactory`
* Spring ApplicationContext Container (recommended)<br/>
`import org.springframework.context.ApplicationContext` 

## 3. Spring Bean
Definition
```   
<!-- A bean definition  -->
   <bean id = "..." class = "..." scope = "..." 	autowiring mode = "..." init-method = "..." destroy-method = "...">
   <!-- collaborators and configuration for this bean go here -->
</bean>
```
* Scope
	* singleton: This scopes the bean definition to a single instance per Spring IoC container
   	* prototype: This scopes a single bean definition to have any number of object instances.
   	* ...
* Autowiring
	* no
	* byName
	* byType
	* constructor  	
* Bean lifecycle
	* init-method
	* destroy-method: need registerShutdownHook() declared in AbstractApplicationContext.

   