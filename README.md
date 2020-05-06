# Assignments-evaluator
The following defines a simple language, in which a program consists of assignments and each variable is assumed to be of the integer type. For the sake of simplicity, only operators that give integer values are included. Write an interpreter for the language in a language of your choice. Your interpreter should be able to do the following for a given program: (1) detect syntax errors; (2) report uninitialized variables; and (3) perform the assignments if there is no error and print out the values of all the variables after all the assignments are done.<br>
Program:<br>
     Assignment*<br>
Assignment:<br>
    Identifier = Exp;<br>	
Exp: <br>
    Exp + Term | Exp - Term | Term<br>
Term:<br>
    Term * Fact  | Fact	<br>
Fact:<br>
		( Exp ) | - Fact | + Fact | Literal | Identifier<br>
Identifier:<br>
    	Letter [Letter | Digit]* 
<br>Letter:
	  a|...|z|A|...|Z|_<br>
Literal:<br>
	  0 | NonZeroDigit Digit*<br>
NonZeroDigit:<br>
	  1|...|9<br>
Digit:<br>
		0|1|...|9

## How to Compile this Program?
  ###On terminal: Javac Main.java
  ###Using makefile: make
## How to run this Program?
   ###On terminal: Java Main
   ###Using makefile: make run
## How to run with different input?
  Modify the input.txt file then recompile.

