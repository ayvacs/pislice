# PiSlice (Java package `lol.pislice`)

Extract slices of numbers from the mathematical constant π (pi).

```java
// Instantiate a PiSlice from two integers:
PiSlice applePi = new PiSlice(2, 4);
System.out.println(applePi.getInt()); // 15

// You can also instantiate a PiSlice from two PiSlices:
PiSlice applePi = new PiSlice(
    new PiSlice(4, 5),
    new PiSlice(5, 6)
)
System.out.println(applePi.toString()); // (5, 9) => 9265
```

## Implementation

`PiSlice` uses a constant of π without a decimal point (α), such that α = 314159265 ...

To decode an `int` value from a `PiSlice` instance, the `getInt` method may be used. This method works exactly as `String.substring`; the substring begins at the specified `startIndex` (first parameter) and extends to the character at index `endIndex - 1`, such that:

```java
new PiSlice(2, 4).getInt(); // 15
int α = 314159265 ...
~~~~~~~~~^~^~~~~~~~~~
```

The `toString` method may be used to display the slice in a more human-friendly format:
```java
new PiSlice(5, 9).toString(); // (5, 9) => 9265
```

## Considerations

* The start index should be greater than or equal to 0 and less than the end index
* The end index should be less than 1000 (the length of the internal `PI_DIGITS` constant, which you can grab with the `getCap()` method)
* A `PiSliceException` will be thrown when things are amiss
* Keep in mind Java's integer limit of -2,147,483,648 to 2,147,483,647

This is my first Java project with Gradle. While this project is unrealistic and created entirely as a joke, it was intended to help me learn how to use Gradle and Java. If you notice anything in the code that seems wrong or inefficient, please let me know by opening an issue! :)

## License

Licensed under the Unlicense. This is free and unencumbered software released into the public domain.

View the `LICENSE` file for more information.