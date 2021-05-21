# Exercise 1: Testing a data structure

Consider the [`java.util.Hashtable`](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Hashtable.html) class 
(for simplicity, assuming that both keys and values are of type `Integer`). We want to (black-box) test the 
correctness of the functionalities implemented through the following methods: 
- `isEmpty()`
- `put(Integer key, Integer value)`
- `replace(Integer key, Integer value)`
- `remove(Object key)`
- `remove(Object key, Object value)`
- `get(Object key)`

Specifically, we want to do so by considering, for each method, 
happy paths, boundary conditions, and error conditions.
