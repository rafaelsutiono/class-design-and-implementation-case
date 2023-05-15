# Class Design and Implementation Case

#### A large company with locations in different cities has taken an OOP approach in creating an administration program that manages all aspects of its business. These aspects include:
#### ·the sale of all the different products that the company manages
#### ·the salaries for managers, office staff and sales personnel.

#### 1.
#### (a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)
> Class: A class is a blueprint or template that defines the structure and behavior of objects. It represents a concept or a category of objects that share common attributes and methods. In the given scenario, a class could be "Product" or "Employee," which define the common properties and behaviors for all products and employees in the company.

> Instantiation: Instantiation refers to the process of creating an object (instance) of a class. It involves allocating memory for the object and initializing its attributes based on the class definition. For example, if we have a class "Product," an instantiation of that class would be creating an object like "laptop" or "mobile phone," where each object has its specific attributes and values assigned.

#### The different modules in the program each open a graphical user interface (GUI). Each GUI has a similar design but contains differences specific to each module.

#### (b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)
> Employee Class Inheritance: The program can have a base class called "Employee," which includes common attributes and methods for all types of employees (managers, office staff, sales personnel). Subclasses like "Manager," "OfficeStaff," and "SalesPerson" can inherit from the "Employee" class, inheriting its common attributes and methods while adding their specific functionalities.

> Product Class Inheritance: If the company manages different types of products, a base class called "Product" can be defined with common attributes and methods related to all products. Subclasses like "Electronics," "Clothing," and "Furniture" can inherit from the "Product" class, inheriting its common functionalities while adding their specific properties and behaviors.

#### (c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)
> Libraries provide pre-written and tested code that can be reused in software development, saving time and effort. In the case of the administration program:

> GUI Libraries: The program can utilize GUI libraries like JavaFX or Tkinter to create the graphical user interfaces for different modules. These libraries provide ready-to-use components and functionalities, allowing developers to build consistent and user-friendly interfaces efficiently.

> Database Libraries: Libraries like JDBC (Java Database Connectivity) or SQLAlchemy (Python) can be used to interact with databases, facilitating tasks such as storing and retrieving product data, sales records, and employee information. These libraries abstract the complexities of database operations, making it easier to integrate database functionality into the program.

#### 2. The company employs several sales personnel to sell its products to different retailers. Each branch of the company keeps track of its own sales with a suite of programs that include the two #### classes SalesPerson and Sales.

 
```java
public class SalesPerson {

// each object contains details of one salesperson

private String id;

private Sales[] salesHistory; // details of the different sales

private int count = 0; // number of sales made



//constructor for a new salesperson

public SalesPerson(String id){

// code missing

}

 

// constructor for a salesperson transferred (together with their sales details) from another branch

public SalesPerson(String id, Sales[] s, int c){

// code missing

}

 

public int getCount(){return count;}

public String getId() {return id;}

public void setSalesHistory(Sales s){

salesHistory[count] = s;

count = count +1;

}

 

public double calcTotalSales(){

// calculates total sales for the salesperson

// code missing

}

 

public Sales largestSale(){

// calculates the sale with the largest value

// code missing

}

}
```
 
#### Each instance variable is initialized when a SalesPerson object is instantiated.

#### (a) Complete the constructor public SalesPerson(String id), from the SalesPerson class. (2 points)

> Code below:
```java
public SalesPerson(String id){
    this.id = id;
    this.salesHistory = new Sales[100]; // assuming a maximum of 100 sales can be stored
    this.count = 0;
}
```

#### (b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)
> It's to provide controlled access to its private variables (id, salesHistory, count) from outside the class. These methods allow other parts of the program to retrieve and use the values of these variables without directly modifying them. This encapsulation ensures data integrity and provides a way to enforce business rules or perform validation checks when accessing or modifying the data.
