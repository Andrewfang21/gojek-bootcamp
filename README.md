# Geometry Line Package

## Problem Description
This repository aims to model a 2D line in cartesian coordinate and computing its length.

### Modelling the Line
In our solution, we model the line into two `Points`: `startPoint` and `endPoint`. To compute the line's length,
we use Euclidean distance: &#8730;(x<sub>1</sub> - x<sub>2</sub>)<sup>2</sup> + (y<sub>1</sub> - y<sub>2</sub>)<sup>2</sup>)

## Dev Environment Setup
- Ensure that you have JDK 11 version or newer installed in your local machine.
- Ensure that you have Gradle 6.5.1 version or newer installed in your local machine.

## How to Test
- Run `./gradlew test` in your CLI to test all of the available test cases.

## How to Build
- Run `./gradlew build` in your CLI.
