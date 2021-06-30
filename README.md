# Recursion In Java
Introduction to Recursion In Java
### What is Recursion?
A method that calls itself is known as a recursive method. And, this process is known as recursion.
In order to stop the recursive call, we need to provide some conditions inside the method. Otherwise, the method will be called infinitely.

####Types of Recursion

1. Infinite Recursion
   
    ```java
    static void infiniteRecursion() {
        System.out.println("This is a infinite recursion!");
        infiniteRecursion();
    }
    ```

2. Finite Recursion
   ```java
    static void finiteRecursion(int x) {
        x++;
        if(x <= 10){
           System.out.println("This is a finite recursion!"+x);
           finiteRecursion();
        }
    }
    ```

### Steps to produce recursion


1. Base Condition/ Halt Condition (i.e., when to stop)

2. Work toward Base Condition

3. Recursive Call.

###Examples of Recursive Algorithm

1. Summing list of numbers
2. Factorial of a number
3. Compute the Nth number in the Fibonacci sequence
4. Sorting


### Tail Recursion

Some recursive algorithms are very similar to loops. These algorithms are called "tail recursive" because the last statement in the algorithm is to "restart" the algorithm. Tail recursive algorithms can be directly translated into loops.

```java
static int sumOfNumbers(int... args){
     if (args.length == 0)
         return 0;
     else
         return args[args.length-1] + sumOfNumbers(Arrays.copyOf(args, args.length-1));
}
```

### Pros and Cons of Recursion
When a recursive call is made, new storage locations for variables are allocated on the stack. As, each recursive call returns, the old variables and parameters are removed from the stack. So, recursion generally uses more memory and is generally slow.

On the other hand, a recursive solution is much simpler and takes less time to write, debug and maintain.

