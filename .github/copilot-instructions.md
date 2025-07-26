# Copilot Instructions for This Java Codebase

## Project Overview
- This workspace contains a collection of small, self-contained Java programs and algorithms, organized by topic (e.g., arrays, number theory, strings).
- There is no central application or build system; each `.java` file is typically a standalone class with a `main` method for direct execution.
- Subdirectories (e.g., `Arrays/`, `Number_converter/`, `Srings/`) group related problems and solutions.

## Key Patterns & Conventions
- **Class Structure:** Each file usually contains a single public class named after the file, with a `main` method for demonstration/testing.
- **No Frameworks:** No external dependencies or frameworks are used; all code is standard Java.
- **Naming:** File and class names are descriptive of the algorithm or problem (e.g., `MissingNumber.java`, `CommonElement.java`).
- **Input/Output:** Most programs use hardcoded input arrays or values in `main` for demonstration. No user input or file I/O is expected.
- **Algorithm Focus:** Each file demonstrates a single algorithm or concept (e.g., finding missing numbers, common elements, number conversions).

## Example Patterns
- **Finding a Missing Number:** See `Arrays/MissingNumber.java` for the sum formula approach.
- **Finding Common Elements:** See `Arrays/CommonElement.java` for both `Set` and `ArrayList`-based solutions.
- **Custom Array Transformations:** See `Arrays/Test.java` for conditional element-wise transformations based on parity and primality.

## Developer Workflows
- **Compiling:** Use `javac <filename>.java` to compile individual files.
- **Running:** Use `java <ClassName>` to run the compiled class. For files in subdirectories, use the package name (e.g., `java Arrays.MissingNumber`).
- **No Build Scripts:** There are no build scripts or project files (e.g., no Maven/Gradle). All compilation is manual and per-file.

## Project-Specific Guidance for AI Agents
- When adding new algorithms, follow the pattern of a single public class per file, with a `main` method for demonstration.
- Place new files in the appropriate topic subdirectory.
- Use descriptive class and file names matching the algorithm/problem.
- Avoid introducing external dependencies or frameworks.
- Keep code self-contained and runnable as a standalone Java class.

## Key Files & Directories
- `Arrays/` — Array-related algorithms and problems
- `Number_converter/` — Number system conversion utilities
- `Srings/` — String manipulation algorithms

## Example: Adding a New Algorithm
```java
package Arrays;

public class ExampleAlgorithm {
    public static void main(String[] args) {
        // Demo code here
    }
}
```

---
If any conventions or workflows are unclear, please ask for clarification or examples from the codebase.
