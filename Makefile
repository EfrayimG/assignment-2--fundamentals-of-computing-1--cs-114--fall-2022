filename = Assignment2

all: compile run

compile:
	javac Assignment2.java

run:
	java Assignment2

clean:
	rm Assignment2.class
