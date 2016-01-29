# Makefile for CS322 Lab3.
#
JFLAGS = -g
JC = javac
JCC = javacc

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

irgen: 	ast/Ast.class ast/AstParser.class ir/IR.class IRGen.class

clean:
	'rm' ast/*.class ir/*.class *.class


