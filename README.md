# Basic Sorting Algorithms in Java

This repository contains implementations of basic sorting algorithms in Java. Each sorting algorithm is implemented in its own Java file and includes comments for its time complexity.

## Sorting Algorithms Implemented

1. **Bubble Sort**: A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. Time Complexity: O(n^2).

2. **Selection Sort**: A simple sorting algorithm that divides the input list into two parts: the sublist of items already sorted and the sublist of items remaining to be sorted, and repeatedly selects the smallest element from the unsorted sublist and moves it to the beginning of the sorted sublist. Time Complexity: O(n^2).

3. **Insertion Sort**: A simple sorting algorithm that builds the final sorted array one item at a time by repeatedly picking up the next item and inserting it into the correct position in the already sorted part of the array. Time Complexity: O(n^2).

4. **Counting Sort**: A sorting algorithm that works for integers within a specific range. It works by counting the number of occurrences of each unique element in the input array and using these counts to determine the position of each element in the sorted output array. Time Complexity: O(n+k), where k is the range of the input.

5. **Built-in Sort (Arrays.sort())**: Java provides a built-in sorting method for arrays, which uses a modified version of the quicksort algorithm for primitive types and mergesort for objects. The time complexity varies depending on the implementation but is typically O(n log n) for most cases.

## Usage

Each sorting algorithm is implemented in its own Java file. You can compile and run each file individually to see the sorting algorithm in action.

To compile and run a Java file:

```bash
javac <filename>.java
java <filename>
```

Replace `<filename>` with the name of the Java file you want to compile and run.

## Contributing

Contributions are welcome! If you have suggestions for improvements, or if you'd like to contribute a new sorting algorithm implementation, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
