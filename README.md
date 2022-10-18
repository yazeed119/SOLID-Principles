#  SOLID Principles

Single Responsibility Principle
The problem here is that the classes are not separated,
I separated the classes so that I put each function in a class, 
and created 2 interfaces, one for operations, 
implements for deleting and adding, 
and the second for sending messages.


Open/Closed Principle
I created Factory Class and executed all the operations with it, 
then I created an Interface for the result.

Liskov’s Substitution Principle
I collected the Overs and Customs classes in Master Class and called it Operation
So that made the limited customer a son of customer.

Interface Segregation Principle
The problem here is that not all birds can fly, swim and molt. 
I created an interface and called it a bird so that the rest of the birds 
take the implements from it, and call the properties necessary for it, 
and then create another interface that contains birds and swimming, 
so that they are called by birds that can do this.

Dependency Inversion Principle
I created an Interface to control the power, on or off, and it is called by both the screen
and the keyboard














What does the SOLID principles actually means? Well, it’s just an acronym of the five principles listed as below.

- S - Single Responsibility Principle (known as SRP)
- O - Open/Closed Principle
- L - Liskov’s Substitution Principle
- I - Interface Segregation Principle
- D - Dependency Inversion Principle