# Sale_java
sale application java

# Question 1: 
Implement a Java class named Sale that can be used for a simple sale of a single item with no 
added discounts and no added charges. The Sale class should contain the following:
1. A data field named item that stores the item name.
2. A data field price that stores the price of the item.
3. A constructor that creates a sale with specified item name and price.
4. The accessor functions for all data fields.
5. The mutator functions for all the data fields.
6. Override toString() to represent the sale object as a string.
7. A function bill() that returns the price for that item with no added discounts or charges.

# Question 2: 

Implement a Java class named DiscountSale that is derived from Sale. The DiscountSale class 
should contain the following:
1. A data field discount that expressed as a percent of the price.
2. A constructor that creates a DiscountSale object with specified item, price and discount 
values.
3. Appropriate accessor and mutator methods.
4. A function that overrides toString() to represent the DiscountSale object as a string.
5. A overridden function bill() that returns the net price for that DiscountSale object. Note: 
net price = (1-discount/100)*price

# Question 3: 

Implement a Java class named SalesTest that creates a function named totalBill() which 
receives an ArrayList of Sale objects, iterate thought it and return the total bill for the list of 
items sold. In your main function, create an ArrayList of Sale objects named sales, fill it with 
sample data of Sale or DiscountSale type objects. Then, display all added data. Finally, 
call the function totalBill() to find the total bill for the list of items sold and print the result 
in an appropriate message.
For example, if you have added the following four objects in your main function,
Sale("Atomic coffee mug", 111.00);
Sale("Cup holder", 11.90);
DiscountSale("Floor mat", 10.90, 10);
DiscountSale("Map", 7.95, 0);
