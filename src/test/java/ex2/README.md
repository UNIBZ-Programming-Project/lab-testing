# Exercise 2: Test and fix

The [`Rule.java`](/src/main/java/ex2/Rule.java) implements a simple rule whose body contains a conjunction
of conditions over real intervals, and whose head is a real number.
Each condition, captured in the [`Condition.java`](/src/main/java/ex2/Condition.java) class, represents a real interval through its minimum and maximum values,
with an indication on whether each of them is included or excluded. 

A simple rule example (in string format) is:

```
if	[0.0, 6.0)
	and [0.0, 5.0]
then return 10.0
```
This can be obtained by instantiating the classes above as follows:

```
new Rule(
  new Condition[]{
    new Condition(true, 0, 6, false),
    new Condition(true, 0, 5, true)
  },
  10
);
```

The [`Rule.java`](/src/main/java/ex2/Rule.java) implements a method 
```
public Double evaluate(double[] input)
```
to evaluate the result of its application to a given input. The logic of this method should work as the intuition suggests:
the input consists of double numbers, one per condition. If, for each condition, the corresponding input number
belongs to the interval expressed by the condition, then the rule returns its head. Otherwise, `null` is returned.  

Unfortunately, the implementation of the various classes contains some bugs.
The exercise then consists of the following steps:
1. write down exhaustive tests to check whether the classes work as expected;
2. use the result of these tests on some relevant rules (such as the one above) to find the bugs;
3. fix the bugs, ensuring that the defined tests now properly work.
