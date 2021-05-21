# Exercise 3: First test, then code

The [`Rectangle.java`](/src/main/java/ex3/Rectangle.java) interface represents a Rectangle in the Euclidean space,
whose vertexes are represented by the [`Point.java`](/src/main/java/ex3/Point.java) class. The interface also
exposes two methods for computing the perimeter and area of the rectangle.

We would like to provide an implementation for [`Rectangle.java`](/src/main/java/ex3/Rectangle.java) that:
- represents rectangles whose sides are parallel to the two axes;
- does so by storing the 4 coordinates starting from the bottom-left vertex A and going through B, C, and D counter-clockwise.

Beside the methods requested by the interface, the implementation must provide a constructor that, given four points:
- checks whether they obey to the two conditions above,
- checks whether they form a proper rectangle.
In case a condition fail, the constructor must throw an Exception.
  
To provide the implementation, proceed as follows:
1. define a suitable test suite for the implementation;
2. use the test suite as a driver for realizing the actual implementation;
3. check whether the implementation indeed passes all the tests.

To test whether the implementation works on some typical (correct and wrong) cases, proceed as follows:
1. create a text file where each row contains four points (i.e., four pairs of coordinates);
2. write a simple parser that, given a row in the file, (tries to) construct the rectangle;
3. use this parser to feed the various tests with all the different rows retrieved from the file - do so by leveraging the special JUnit APIs `@BeforeEach`, `@BeforeAll` and the like.