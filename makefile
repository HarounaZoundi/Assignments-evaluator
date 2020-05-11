
JCC = javac
JC = java
JFLAGS = -g

# typing 'make' will invoke the first target entry in the makefile 
# (the default one in this case)
#

Assignment.class: Assignment.java
	$(JCC) $(JFLAGS) Assignment.java

ExpEvaluator.class: ExpEvaluator.java
	$(JCC) $(JFLAGS) ExpEvaluator.java

Identifier.class: Identifier.java
	$(JCC) $(JFLAGS) Identifier.java

Program.class: Program.java
	$(JCC) $(JFLAGS) Program.java

Main.class: Main.java
	$(JCC) $(JFLAGS) Main.java
run: Main.class input.txt
	$(JC) Main.class input.txt
clean: 
	$(RM) *.class