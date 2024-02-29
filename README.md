# PiSlice

Extract slices of numbers from the mathematical constant π (pi).

Documentation: [ave.is-a.dev/pislice](https://ave.is-a.dev/pislice)

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

To produce a `long` value from a `PiSlice` instance, the `getLong` method may be used. Similarly, `getInt` is used to produce an `int`. Both methods works exactly as `String.substring`; the substring begins at the specified `startIndex` (first parameter) and extends to the character at one less than the specified `endIndex` (second parameter). Thus, the length of the substring is `endIndex - startIndex`.

## Considerations

* The start index should be greater than or equal to 0 and less than the end index
* The end index should be less than 65,534 (the length of the internal `PI_DIGITS` constant, which you can grab with the `getCap()` method)
* A `PiSliceException` will be thrown when things are amiss
* Keep in mind Java's long limit (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

## Build

Grab a prebuilt .jar from the [releases page](https://github.com/ayvacs/pislice/releases/latest), or build it yourself using gradle.

Prebuilt jars are only published for major-ish releases so they will often be missing the last few commits.

## License

Licensed under the Unlicense. This is free and unencumbered software released into the public domain.

View the `LICENSE` file for more information.