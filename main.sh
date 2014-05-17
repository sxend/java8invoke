#!/bin/sh

echo "execute: cat Main.java"
cat Main.java
echo "execute: javac Main.java"
javac Main.java
echo "execute: javap -c Main"
javap -c Main
echo "execute: javap -c Main\\\$1"
javap -c Main\$1