
#Chess

https://www.geeksforgeeks.org/design-a-chess-game/ 
http://massivetechinterview.blogspot.com/2015/07/design-chess-game-using-oo-principles.html 
http://swcodes.blogspot.com/2012/09/chess-game-design.html 
https://en.wikipedia.org/wiki/Rules_of_chess 
https://github.com/jlundstedt/chess-java/tree/master/src

###git commands

git remote set-url origin new.git.url/here 
git remote -v

echo "# lol" >> README.md 
git init 
git add README.md 
git commit -m "first commit" 
git branch -M main 
git remote add origin https://github.com/Sanjeth00/Sjakk.git 
git push -u origin main

git remote add origin https://github.com/Sanjeth00/lol.git git branch -M main git push -u origin main

Spot: A spot represents one block of the 8×8 grid and an optional piece.
Piece: The basic building block of the system, every piece will be placed on a spot. Piece class is an abstract class. The extended classes (Pawn, King, Queen, Rook, Knight, Bishop) implements the abstracted operations.
Board: Board is an 8×8 set of boxes containing all active chess pieces.
Player: Player class represents one of the participants playing the game.
Move: Represents a game move, containing the starting and ending spot. The Move class will also keep track of the player who made the move.
Game: This class controls the flow of a game. It keeps track of all the game moves, which player has the current turn, and the final result of the game.
Let’s look at the details. These codes are self-explanatory. You can have a look at the properties/variables and methods of different classes.

###Tasks:
- Board
    * fix layout[][]
    * add pieces using nested loop

- Spot
- Player
- Move
- Game
    * Status
- Rules
    * En passant
    * Castling
    * Pawn promotion
    * Check
