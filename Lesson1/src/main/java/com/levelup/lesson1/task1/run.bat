@echo off
if exist Entry.class del Entry.class
if exist Calc.class del Calc.class
javac Entry.java
if exist Entry.class java -classpath . Entry %1 %2
