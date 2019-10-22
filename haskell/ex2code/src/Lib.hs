module Lib
    ( f0
    , f1
    , f2
    , take
    , map
    , iterate
    , filterPos
    , filterPosMany
    , flip3
    , Maybe(..)
    , safeHeadList
    , safeHead
) where

import Prelude hiding (map, take, iterate, sqrt, neg, succ, pred, Maybe)

-- TASK 1
f0 :: a -> a
f0 a = a

f1 :: a -> b -> a
f1 a _ = a

f2 :: a -> b -> b
f2 _ b = b

-- TASK 2
take :: Int -> [a] -> [a]
take a [] = []
take n l@(x:xs)  
    | n <= 0 = []
    | length l <= n = l
    | otherwise = [x] ++ (take (n-1) xs)  


-- TASK 3
safeHeadList :: [a] -> [a]
safeHeadList  [] = []
safeHeadList (x:xs) = [x]


-- TASK 4
data Maybe a = Some a | None deriving (Eq, Show)

safeHead :: [a] -> Maybe a
safeHead [] = None
safeHead (x:_) = Some x

-- TASK 5
map :: (a -> b) -> [a] -> [b]
map _ [] = []
map f (x:xs) = f x : (map  f) xs   


-- Task 6
iterate :: (a -> a) -> a -> [a]
iterate f x = x : iterate f (f x)

-- TASK 7
filterPos :: [Int] -> [Int]
filterPos = filter (>=0)

-- Task 8
filterPosMany :: [[Int]] -> [[Int]]
filterPosMany = map (filter (>=0))

-- Task 9
flip3 :: (a -> b -> c -> d) -> c -> b -> a -> d
flip3 f c b a = f a b c 


-- TASK 10

-- Uses newtons method
aprSqrt :: Double -> Double-> Double
aprSqrt y x = x - ((x)**2 - y)/(2*x)

-- Creates an infinte lists of apr of sqrt, by using partial
-- application and iterate
infAprSqrt :: Double -> [Double]
infAprSqrt x = iterate (aprSqrt x) x

-- checks if a double is an integer, first rounds down from a
-- double to int and then converting int back to Integer and comparing
-- to original double
isInt :: Double -> Bool
isInt x = fromInteger (floor x) == x

-- Checks if the difference between the two first elements is less then
-- treshold, if not, recursion with the rest of the list. Returns -1.0
-- if no difference is less than treshold
approx :: Double -> [Double] -> Double
approx diff (x:y:xs)
    | abs (x-y) <= diff = y
    | otherwise         = approx diff (y:xs)


--Is correct untill a bool with more than 13 decimals with either 0 or 9
isPerfSq :: Double -> Bool
isPerfSq x = isInt( approx 0.00000000001 (infAprSqrt x) )


-- Method provided by the exercise
accuracy :: Int -> Bool
accuracy x = take x generated == take x [x^2 | x <- [1..]]
        where
        zpd       = zip [1..] (map isPerfSq [1..])
        f (x,y)   = y == True
        generated = fst . unzip $ filter f zpd
