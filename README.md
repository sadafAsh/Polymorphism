# Polymorphism
     The word polymorphism means having many forms.Polymorphism in java allows us to 
perform the same action in many different ways.In other words ,polymorphism allows 
you to define one interface and have many implementations.The word "poly" means many
and "morph" means forms.So it has many forms.
    
      Polymorphism is of two types:
      1.Compile-time Polymorphism
      2.Runtime Polymorphism
      
Compile-time polymorphism:
       It is also known as static polymorphism. In these process function call to the
 Overloading method is resolved at compile-time.When multiple functions with the same
 name but different parameters is said to be overloaded.Function can be overloaded by
 change in the argument or change in a type of argument.
        In this project,package "compiletime" the "shapes" class is overloaded 3 times.
 First method has int parameter,second has one int and one double parameter and third 
 is having  only double parameter.the method is be called is determined by the arguments
 we pass while calling methods.This happens at compile time so this type of polymorphism 
 is called compile time polymorphism.
   
 Run-time polymorphism:
         It is also known as Dynamic Binding Method.In these process function call to 
 the Overridden method is resolved at runtime.This type of polymorphism is achieved by
 Method Overriding. Overriding occurs when a derived class a properties or behaviour of
 the member function of the base class.That base function is said to be Overridden.
          In this project,package "runtime" ,when a child class "Salary" is created, 
 then the method inside the child class is called.This is because in the parent class
 "Employee" is oveeridden by the child class.So yhe method is overridden.In the main 
 body inside the child is executed.              
    
           There is JUnit Test also present for all Polymorphism and test coverage are 100%
successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube

gradle sonarqube 
  -Dsonar.projectKey=Polymorphism 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=67a2677839d70d06bfca7ffdaf4ebbe42ed6176a