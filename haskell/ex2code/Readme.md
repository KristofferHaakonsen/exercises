# Exercise 2 
This exercise consists of ten task and a test.


### Task 1:
#### Below are three type signatures. Can you implement them? 


```haskell
f0 :: a -> a
f0 = undefined
```

```haskell
f1 :: a -> b -> a
f1 = undefined
```
```haskell
f2 :: a -> b -> b
f2 = undefined
```
<br>

### Task 2:
#### Rewrite the function _takeInt_ from exercice 1 as _take_ so that it accepts a list of any type.
```haskell
take = undefined
```
<br>

### Task 3:
####  The function _head_ which returns the firstelement of a list, is partial, meaning it will crash for some inputs.  One solution could be to make a total function _safeHeadList_ which either gives the head, or nothing. Implement it using take?
```Haskell
head :: [a] -> a 
```

```haskell
safeHeadList :: [a] -> [a]
safeHeadList = undefined
```
<br>

### Task 4:
#### Implement _safeHead_, representing failure using _None_.
```haskell
safeHead :: [a] -> Maybe a
safeHead = undefined
```
The output of safeHeadList is either empty or a singleton and thus using a list as output-type is a bit misleading. A better choice is _Maybe_ (sometimes called Optional):
```Haskell
data Maybe a = Some a | None deriving (Eq, Show)
```

<br>

### Task 5:
#### Implement the function _map_.
```haskell
map :: (a -> b) -> [a] -> [b]
```
The _map_ method that takes a function from any type a to any type b and a list of type a. It should iterate through the list, apply the functions to all of the elements and return a list of type b. Do not use the built in function _map_.

<br>

### Task 6:
#### Implement the function _iterate_.
```haskell
iterate :: (a -> a) -> a -> [a]
```
This methodproduces an infinite list by repeatedly applying a function "f :: a -> a" to a value. The result we want is this:
<br>
_iterate = [n, fn, f(fn), f(f(fn))..]_

<br>

### Task 7:
#### complete the function _filterPos_.
```haskell
filterPos :: [Int] -> [Int]
filterPos = undefined
```
_FilterPos_ takes a list and returns a filtered list containing only positive integers (including zero) use partial application to achieve this

<br>

### Task 8:
#### complete the function _filterPosMany_.
```haskell
filterPosMany :: [[Int]] -> [[Int]]
filterPosMany = undefined
```
_filterPosMany_ takes a list of lists and returns a list of lists with only positive integers (including zero). <br>
Hint: use filterPos and map

<br>

### Task 9:
#### complete the function _flip3_.
```haskell
flip3 :: (a -> b -> c -> d) -> c -> b -> a -> d
flip3 = undefined
```
_Flip3_ flips the arguments of a function with three arguments


<br>

### Task 10:
#### Infinite lists
In this task, we will find a way to determine if a number is a perfect square, i.e. the square of an integer. To achieve this, we need to find a way to calculate the square root. Implement a function that approximates the square root of a number. We suggest using Newton’s method for this. Do not use the built in method.

##### Creating the infinite list
It is time to make use of a function we wrote earlier, namely _iterate_. We want to call our _perfect square_ over and over, so we get better and better approximations of *sqrt x*. A good way to to this, is to make an infinite list using _iterate_. Implement a function that returns this infinite list of approximations.

##### Check if a Double is an integer
Write a function, _Double_, that checks if a double is an integer. Give it an appropriate name. f 1.0 should return True, while f 1.5 should return False.
```Haskell
 Double -> Bool
 ```
##### Approximating the square root
Write a function, approx, that iterates through the list. Every iteration, it checks if the difference between the first and second element in the list is less than a given threshold, given as an argument to the function. If the difference between two successive values in the list is less than the threshold, we return the second of these two values.

```Haskell
 approx :: Double -> [Double] -> Double
 ```

##### Check for perfect squares by implementing _isPerfSq_.
```haskell
isPerfSq :: Double -> Bool
isPerfSq = undefined
```
This ties all the functions together to check if a number is a perfect square. Experiment with the threshold to find an accurate solution and choose a guess, either by defining it in terms of x or by hardcoding a value.

##### Tweaking your solution
Below is a function _accuracy_, which tests _isPerfSqr_ against an infinite list of perfect squares. It generates an infinite list
of all numbers _isPerfSq_ claims are perfect squares, and filters out numbers where _isPerfSqr_ returns False. If _accuracy 200_ returns True, that means 5 that _isPerfSqr_ has correctly identified the first 200 perfect squares (and correctly rejected the numbers in between). This function is meant to aid you in choosing a satisfactory threshold and guess.

```Haskell
accuracy :: Int -> Bool
accuracy x = take x generated == take x [x^2 | x <- [1..]]
            where
            zpd       = zip [1..] (map isPerfSq [1..])
            f (x,y)   = y == True
            generated = fst . unzip $ filter f zpd
```
<br>

## Testing
Do the following to test ex2code:

1. Install Haskell on your computer
2. Navigate to ex2code
3. Build the project, by enter the following in the command window:
```
stack build
```
4. Run the tests, by entering the following in the command window:
```
stack test
```

