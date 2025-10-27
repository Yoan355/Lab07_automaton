Project: automaton
Aothors: David J. Barnes and Michael Kölling

This project is part of the material of the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 7.





/////////Awnsers to questions////////////////////////


27) Yes,the exact same patterns repeat themselves when calling
the reset method and repeating out steps.


28) the fill method is used to set every element in the state to
the index 0.In the index 0,there is just one cell(*) so that is what
 it sets it at.
 
 
 29)Yes different patterns emerge this time,if we give more cells
 then it makes the result have chaotic patterns compared to the original.
 Yes they are deterministic,we can set our cells to whatever in the
 1 state and the resulting patterns will always be the same.
 
 
 
 31) The nextState array is where our updates cell values are stored,rather than the original values
 in the state array.When you update state[i] right away, the next cell uses that changed value as its left neighbor.
 But it should use the original value instead
 
 
 32) Yes  you can avoid the problems from the previous exercise without using a new array by retaining 
 the previous cell's original value(left) and the current cell's 
 original value(center)

