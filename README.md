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
- Run `./gradlew test` in your CLI to test all the available test cases.

## How to Build
- Run `./gradlew build` in your CLI.
- This result in a ```geometry-calculator-1.0-SNAPSHOT.jar``` file in the ```/build/libs``` directory.

## How to Use
- Open a Java project.
- Create a ```libs``` folder if it has not existed. 
- Paste the ```geometry-calculator-1.0-SNAPSHOT.jar``` file in the ```libs``` directory.

### Using Gradle
```groovy
  dependencies {
     implementation files('libs/geometry-calculator-1.0-SNAPSHOT.jar')
  }
```

### Usage
```java
package com.company.example;

import com.bootcamp.LineClient;

public class Example {

    public static void main(String[] args) {
        LineClient line = new LineClient();
        double lineLength = line.calculateLength(0, 1, 2, 3);

        System.out.println(lineLength);
    }
}
```
