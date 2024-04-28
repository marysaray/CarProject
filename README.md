### The purpose of this exercise is to gain understanding of how object-oriented programming is used to organize code and how objects are used in a program. 
*<B>You will construct a Kotlin class that can be used by client code to model certain aspects of a car.</B>*

```
Programming 4 Assignment:

Modify the Car Kotlin project we did in class, to include

a function named changeOil,
a function named needOilChange,
and add a property mileageAtOilChange.

When a Car object is constructed, mileageAtOilChange should be set to zero.
The function changeOil should set mileageAtOilChange to the value of the property odometer.
The  needOilChange function should compare the odometer value to the mileageAtOilChange and
return true if odometer - mileageAtOilChange  > 5000, false otherwise.
```

```
Structure:

Write a Kotlin class named Car that has the following fields:

year. The year field is an int that holds the model year of the car.

make. The make field references a String object that holds the make of the car.

gasCapacity. The gasCapacity field is a Double that holds the number of gallons the car’s gas tank can hold.

gasLevel. The gasLevel field is a Double that holds the number of gallons in the car’s gas tank.

mpg. The mpg field is a Double that holds the number of miles the car can get from one gallon of gas.

speed. The speed field is an Int that holds the car's current speed.

odometer. The odometer field is an Int that holds the total distance traveled
In addition, the class should have the following constructor and other methods:
```

```
Constructor. The constructor should accept the car's year, make, gasCapacity, speed, and mpg as arguments. 
These values should be assigned to the object's corresponding fields. The constructor should also fill the gas tank.
```

```
Mutators. There should be three methods that can modify the object's state.

 1. accelerate. The accelerate method should add 5 to the speed each time the method is called
 but the speed should never go above 180.

 2. brake. The brake method should subtract 5 from the speed each time it is called
 but the speed should never go below zero.

 3. drive. The drive method takes an integer value indicating the number of hours the car has been driven. 
This method should update the odometer and gasLevel to indicate the result of driving at the current speed
 for that number of hours using the car’s mpg:

 gasLevel -= speed * hours / mpg;
```

```
toString. There should be a method named toString that returns a String of the form "make:year:speed".
 For example, a Car object represented a 1964 Ford going 175 miles an hour,
the toString method would return "Ford:1964:175".
```

 
