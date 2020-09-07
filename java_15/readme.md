# Quiz 22 Another Type of Employee

The program illustrates inheritance and polymorphism. In this exercise you will add one more employee type to the class hierarchy. The employee will be one that is an hourly employee but also earns a commission on sales. Hence the class, which we'll name Commission, will be derived from the Hourly class.

### Write a class named Commission with the following features:
* It extends the Hourly class.
* It has two instance variables (in addition to those inherited):
    * one is the total sales the employee has made (type double) 
    * the second is the commission rate for the employee (the commission rate will be type double and will represent the percent (in decimal form) commission the employee earns on sales (so .2 would mean the employee earns 20% commission on sales)).
* The constructor takes 6 parameters: the first 5 are the same as for Hourly (name, address, phone number, social security number, hourly pay rate) and the 6th is the commission rate for the employee. The constructor should call the constructor of the parent class with the first 5 parameters then use the 6th to set the commission rate.
* One additional new method is needed: public void addSales (double totalSales) that adds the parameter to the instance variable representing total sales. 
* The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the pay from commission on sales. (See the pay method in the Executive class.) The total sales should be set back to 0 (note: you don't need to set the hoursWorked back to 0—why not?).
* The toString method needs to call the toString method of the parent class then add the total sales to that

### To test your class, update Staff.java as follows:
* Increase the size of the array to 6
* Add two commissioned employees to the staffList—make up your own names, addresses, phone numbers and social security numbers. 
    * Have one of the employees earn $6.25 per hour and 20% commission and the other one earn $9.75 per hour and 15% commission.
* For the first additional employee you added, put the hours worked at 35 and the total sales $400; 
* for the second, put the hours at 40 and the sales at $950.
