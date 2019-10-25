# Bowling
### Problem Description 
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. 

#### The program will not do:
* We will not check for valid rolls.
* We will not check for correct number of rolls and frames.
* We will not provide scores for intermediate frames.

### My solution
This challenge seems more like a single method than a program. I have therefor implemented all the functionality for calculating the score in a single method, _calculateScore_, in the class __BowlingScorer__. This makes the code easy to reuse, as I can simply import the class.

A single method is not much of a program, so I created the class __BowlingGame__. This class stores the sequence of rolls for one line of American ten-pin bowling, which can be filled by using _rollOnce_. The method _getScore_ calls the method _calculateScore_ from __BowlingScorer__. The class __BowlingGame__ can easily be extended if that is desired.



### American ten-pin bowling rules

* Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
* In each frame, the bowler gets up to two tries to knock down all the pins.
* If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
* If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
* If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
* If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
* The game score is the total of all frame scores.
<br>[More info on the rules at: How to Score for Bowling](https://www.topendsports.com/sport/tenpin/scoring.htm)
