# PiSlice (Java package `lol.pislice`)

Extract slices of numbers from the mathematical constant π (pi).

```java
PiSlice myNumber = new PiSlice(2, 4);
System.out.println(myNumber.getInt()); // 15
```

## Explanation

`PiSlice` uses a constant of π without a decimal point, such that

π = 314159265 ...

The `getInt` method, used to decode an `int` value from a `PiSlice` instance, works exactly as `String.substring`; the substring begins at the specified `startIndex` (first parameter) and extends to the character at index `endIndex - 1`

## Considerations

Standard `String.substring` considerations:

* The start index should be greater than or equal to 0 and less than the end index
* The end index should be less than the internal `PI_DIGITS` constant (I do not know how many digits that is)
* A `PiSliceException` will be thrown when things are amiss

This is my first Java project with Gradle. While this project is unrealistic and created entirely as a joke, it was intended to help me learn how to use Gradle and Java. If you notice anything in the code that seems wrong or inefficient, please let me know by opening an issue! :)

## License

Licensed under the Unlicense. This is free and unencumbered software released into the public domain.

View the `LICENSE` file for more information.