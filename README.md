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
