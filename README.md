# Solution_Duplicates-Cagua_Gavilanes

# Duplicate Finder & Benchmarking in Java

This repository contains two Java implementations to find duplicates in an array of 100 randomly generated elements, featuring a performance execution timer in milliseconds.

## Solutions
* **Solution 1 (`comparation1.java`)**: Traditional brute-force approach using nested loops ($O(n^2)$) to compare elements and track comparisons.
* **Solution 2 (`comparation2.java`)**: Optimized approach using `HashSet` ($O(n)$) to efficiently detect duplicates.

## Features
* Generates 100 random elements automatically using `java.util.Random`.
* Measures precise execution time using `System.currentTimeMillis()`.
