# Hello — Java CLI Examples

A small, educational Java CLI program demonstrating basic input/output and simple algorithms. The program presents a menu with several utilities (greeting and age calculation, areas, times-table, BMI/IMC, parity lists, divisors, etc.). It's implemented in a single file: `src/App.java`.

**Features:**
- **Greet & age**: Ask name and birth year, show age.
- **Area calculators**: Square and rectangle area.
- **Age difference**: Difference between two ages.
- **Times-table**: Display multiplication table for a number.
- **IMC (BMI)**: Calculate and classify BMI.
- **Parity list**: Print odd/even numbers in descending order between two numbers.
- **Divisors input**: Example loop demonstrating input checks.

**Prerequisites**
- JDK 11 or newer installed and `java`/`javac` available on PATH.

**Project layout**
- `src/` — Java source files (main entry: `src/App.java`).
- `bin/` — compiled classes (output target used in examples).
- `lib/` — optional libraries.

**Build & run (after cloning the repository)**

1. Clone the repository and change into the project folder (example URL shown):

```powershell
git clone https://github.com/chizic/Hello_Java.git
cd Hello_Java
```

2. Compile sources into `bin/` (create `bin/` if it doesn't exist):

```powershell
mkdir bin
javac -d bin src\App.java
```

3. Run the program:

```powershell
java -cp bin App
```

Optional: create an executable JAR

```powershell
jar --create --file Hello.jar -C bin .
java -jar Hello.jar
```

**Usage example**
- After running, the program shows a numeric menu. Type `7` then Enter to use the parity-list tool.
- Example inputs for option 7 (even numbers between 3 and 10):

```
Type a number:
3
Type another number:
10
Type 1 for even numbers, 2 for odd numbers:
1
```

Output (descending evens between 3 and 10):

```
10
8
6
4
```

**Notes & tips**
- The program uses `Scanner` for input. For decimal numbers, Java expects a dot (`.`) as the decimal separator by default (e.g., `75.2`), unless your JVM locale is configured otherwise.
- The code is intentionally simple and single-file for learning. Consider splitting functionality into methods or classes when expanding the project.

**Contributing**
- Feel free to open issues or send PRs. Suggested first improvements: input validation, clearer prompts, and unit tests for logic.

**License**
- Add a `LICENSE` file if you want to publish the project. A permissive choice is the MIT license.
