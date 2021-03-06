{-# LANGUAGE ParallelListComp #-}

module Lib
    ( add
    , isVowel
    , Status(..)
    , amountOf
    , fib
    , ending
    , takeInt
    , fizzbuzz
    , printFizz
    , listOfEven
    , zipped
    , cartesian
    ) where

import Control.Monad (mapM_)
import Prelude hiding (take)

-- TASK 1
-- Simple functions

-- finish the function "add" that takes two integers
-- and returns the sum of them
add :: Int -> Int -> Int
add n m = n + m


-- complete the function "isVowel" which
-- takes a character and returns True
-- if it's a vowel (English language), False otherwise
-- hint: a string is a list
-- hint2: use `elem` from Prelude
isVowel :: Char -> Bool
isVowel chr = chr `elem` "AEIOUaeiou"

data Status = One | Two | Three | None deriving (Show, Eq)


-- complete the function "amountOf" which takes
-- a name and a list of subjects
-- it then pattern matches on the amount of subjects in the list
-- and returns a tuple of a Status (look above, describes the amount of subjects in the list)
-- and the name
amountOf :: String -> [a] -> (Status, String)
amountOf s [] = (None, s)
amountOf s [_] = (One, s)
amountOf s [_,_] = (Two, s)
amountOf s [_,_,_] = (Three, s)


-- TASK 2
-- Recursion

-- finish the function "fib" that calculates the
-- nth fibonacci number 
-- assuming that 0th = 0 and 1st = 1
-- do not optimize it
fib :: Int -> Int
fib 0 = 0
fib 1 = 1
fib n = fib (n - 1) + fib (n - 2)


-- TASK 3
-- Working with lists

-- complete the function "ing" that takes a list of
-- strings and returns them with the ending -ing
-- if the string is empty, remove it from the list
ending :: [String] -> [String]
ending l = map (++ "ing") (filter (/= "") l)


-- complete the function "takeInt" that
-- an integer n and a list of integers and
-- returns the first n elements of 
-- the list
takeInt :: Int -> [Int] -> [Int]
takeInt a [] = []
takeInt i l@(x:xs)  
    | i <= 0 = []
    | length l <= i = l
    | otherwise = [x] ++ (takeInt (i-1) xs)


-- implement "fizzbuzz"
fizzbuzz :: [String]
fizzselection y
    | y `mod` 15 == 0 = "FizzBuzz"
    | y `mod` 5  == 0 = "Buzz"
    | y `mod` 3  == 0 = "Fizz"
    | otherwise  = show y

fizzbuzz = [fizzselection y| y <- [1..100]]

printFizz :: IO ()
printFizz = mapM_ putStrLn fizzbuzz


-- TASK 4
-- List comprehensions

-- create a list "listOfEven" which contains all 
-- even numbers that are equal or greater than 0
-- use a list comprehension
listOfEven :: [Integer]
listOfEven = [x | x <- [0,2..]]


-- create a list of tuples, "zipped"
-- where each tuple contains the nth entry
-- in the lists [1..26] and ['a'..'z']
-- hint: parallel list comprehension
zipped :: [(Int, Char)]
zipped = zip [1..26] ['a'..'z']


-- create a list that contains the cartesian
-- product of the two vectors [4, 6, 8]
-- and [3, 7, 9]
-- use a list comprehension
cartesian :: [(Int, Int)]
cartesian = [(x,y) | x <- [4, 6, 8], y <- [3, 7, 9]]
