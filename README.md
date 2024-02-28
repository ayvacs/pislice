# PiSlice

Extract slices of numbers from the mathematical constant π (pi).

```java
import lol.pislice.*;

// Instantiate a PiSlice from two numbers:
PiSlice applePi = new PiSlice(2, 3);
System.out.println(applePi.getInt()); // 4

// You can also instantiate a PiSlice from two PiSlices:
PiSlice pumpkinPi = new PiSlice(
    applePi,
    new PiSlice(5, 6)
);
System.out.println(pumpkinPi.toString()); // (4, 9) => 59265
```

## Implementation

`PiSlice` uses a constant of π without a decimal point (α), such that α = 314159265 ...

To decode a `long` value from a `PiSlice` instance, the `getLong` method may be used. Similarly, `getInt` is used to produce an `int`. Both methods works exactly as `String.substring`; the substring begins at the specified `startIndex` (first parameter) and extends to the character at index `endIndex - 1`, such that:

```java
new PiSlice(2, 4).getInt(); // 41
int α = 314159265 ...
~~~~~~~~~~^^~~~~~~~~~
```

The `toString` method may be used to display the slice in a more human-friendly format:
```java
new PiSlice(5, 9).toString(); // (5, 9) => 59265
```

## Considerations

* The start index should be greater than or equal to 0 and less than the end index
* The end index should be less than 1000 (the length of the internal `PI_DIGITS` constant, which you can grab with the `getCap()` method)
* A `PiSliceException` will be thrown when things are amiss
* Keep in mind Java's long limit (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

This is my first Java project with Gradle. While this project is unrealistic and created entirely as a joke, it was intended to help me learn how to use Gradle and Java. If you notice anything in the code that seems wrong or inefficient, please let me know by opening an issue! :)

## License

Licensed under the Unlicense. This is free and unencumbered software released into the public domain.

View the `LICENSE` file for more information.