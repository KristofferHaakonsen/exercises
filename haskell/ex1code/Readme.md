# Exercise 1 
This exercise consists of four task and a test.


### Task 1:
#### Implement the following methods:
<br>

```haskell
add :: Int -> Int -> Int
```
This method ads two integers

<br>

```haskell
isVowel :: Char -> Bool
```
This method takes in a character and checks if it is a vowel

<br>

```haskell
amountOf :: String -> [a] -> (Status, String)
```
This method takes a name and a list of subjects. It then pattern matches on the amount of subjects in the list and returns a tuple of Status and the name. 
The definition of status:

```haskell
data Status = One | Two | Three | None deriving (Show, Eq)
```

<br>

### Task 2:
#### Implement the following methods:

<br>

```haskell
fib :: Int -> Int
```
This function calculates the nth Fibonacci number, it is not optimized.

<br>

### Task 3:
#### Implement the following methods:

<br>

```haskell
ending :: [String] -> [String]
```
This method takes a list of strings and returns them with the ending -ing. If a string is empty, it is removed from the list.

<br>

```haskell
takeInt :: Int -> [Int] -> [Int]
```
This method takes an integer n and a list of integers and returns the first n elements of the list.

<br>

```haskell
fizzbuzz :: [String]
```
This is the classic fizzbuzz method

<br>

```haskell
listOfEven :: [Integer]
```
This method creates a list of even numbers that are equal or greater than 0, using list comprehension.

<br>

### Task 4:
#### Implement the following methods:

<br>

```haskell
zipped :: [(Int, Char)]
```
Creates a list of tuples, where each tuple contains the nth entry in the list [1..26] and [‘a’..’z’], using parallel list comprehension.

<br>

```haskell
cartesian :: [(Int, Int)]
```
Creates a list that contains the cartesian product of the two vectors [4, 6, 8] and [3 , 7, 9], using list comprehension.

<br>

## Testing
Do the following to test ex1code:

1. Install Haskell on your computer
2. Navigate to ex1code
3. Build the project, by enter the following in the command window:
```
stack build
```
4. Run the tests, by entering the following in the command window:
```
stack test
```

