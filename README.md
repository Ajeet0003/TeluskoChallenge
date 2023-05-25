# TeluskoChallenge
Telusko 10 Day Challenge

Day 1:
Q)"Using recursion and memoization, print the Pascal triangle."

pascal triangle.
      1
     1  1
    1 2  1
   1  3 3 1
  1  4   6  1
  
Day 2: Java Project

Day 3: project using springboot postgresql

Day 4: 

Day 5:

Day 6:
# Annotations

> **Dictionary Meaning** -: a note by way of explanation or comment added to a text or diagram. 

> Annotaion is way of giving extra information or adding features to the code without affecting existing code.

> Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.

## Annotation types
1.  Custom
2.  Built in

![](JavaAnnotations.jpg)

### Custom Example
```java

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
	String state() default "Jharkhand";

	String district() default "Ranchi";
}

@CricketPlayer
class Dhoni {

	int age;
	int run;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

public class Annotations {
	public static void main(String[] args) {
		Dhoni obj = new Dhoni();
		obj.setAge(40);
		obj.setRun(10000);
		System.out.println(obj.getAge());
		System.out.println(obj.getRun());
		
		Class c=obj.getClass();
		Annotation annotation = c.getAnnotation(CricketPlayer.class);
		
		CricketPlayer cricketPlayer=(CricketPlayer) annotation;
		System.out.println(cricketPlayer.district());
		System.out.println(cricketPlayer.state());
	}
}

```
### Built in Annotations
> @Required: It applies to the bean setter method. It indicates that the annotated bean must be populated at configuration time with the required property, else it throws an exception BeanInitilizationException.

```java
public class Machine   
{  
private Integer cost;  
@Required  
public void setCost(Integer cost)   
{  
this.cost = cost;  
}  
public Integer getCost()   
{  
return cost;  
}     
}  

```
>@Autowired: Spring provides annotation-based auto-wiring by providing @Autowired annotation. It is used to autowire spring bean on setter methods, instance variable, and constructor. When we use @Autowired annotation, the spring container auto-wires the bean by matching data-type.

>@Configuration: It is a class-level annotation. The class annotated with @Configuration used by Spring Containers as a source of bean definitions.

>@ComponentScan: It is used when we want to scan a package for beans. It is used with the annotation @Configuration. We can also specify the base packages to scan for Spring Components.

>@Component: It is a class-level annotation. It is used to mark a Java class as a bean. A Java class annotated with @Component is found during the classpath. The Spring Framework pick it up and configure it in the application context as a Spring Bean.

```java
@Component  
public class Student  
{  
.......  
}  
```
>@Controller: The @Controller is a class-level annotation. It is a specialization of @Component. It marks a class as a web request handler. It is often used to serve web pages. By default, it returns a string that indicates which route to redirect. It is mostly used with @RequestMapping annotation.

>@Service: It is also used at class level. It tells the Spring that class contains the business logic.

```java
package com.javatpoint;  
@Service  
public class TestService  
{  
public void service1()  
{  
//business code  
}  
}  
```
>@Repository: It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.

>@GetMapping: It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)

>@PostMapping: It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)

>@PutMapping: It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)

>@DeleteMapping: It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)

>@PatchMapping: It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)

>@RequestBody: It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

>@ResponseBody: It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

>@PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.

>@RequestParam: It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.

>@RequestHeader: It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. We can use it multiple time in a method

>@RestController: It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.

>@RequestAttribute: It binds a method parameter to request attribute. It provides convenient access to the request attributes from a controller method. With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.
