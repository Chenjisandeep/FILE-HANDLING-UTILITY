# FILE-HANDLING-UTILITY
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: CHENJI SANDEEP

*INTERN ID*: CT06DL1140

*DOMAIN*: FILE HANDLING UTILITY

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTOSH

*DESCRIPTION:

The FileHandlingUtility class is a simple command-line application that allows users to perform basic file operations: write, read, and modify text files. It uses Java's BufferedReader, BufferedWriter, and Scanner classes to manage user input and file I/O.

Main Features:
1. Write to a File (writeToFile)
Appends the given content to the specified file.
Creates the file if it does not exist.
Uses BufferedWriter in append mode.

2. Read from a File (readFromFile)
Reads and displays the file contents line by line.
Uses BufferedReader.

3. Modify File Content (modifyFile)
Replaces all occurrences of a given string with a new string in the file.
Reads the entire file content into memory, performs replacement, then writes it back.

4. User Interface (main method)
Prompts the user to enter a file name.

Provides a menu with 4 options:
1. Write to file
2. Read from file
3. Modify file content
4. Exit the program

Handles user input using Scanner.

Usage Example:
User enters a file name (e.g., notes.txt).
Selects an operation like writing "Hello World" to the file.
Can later read or modify that content interactively through the console.

Error Handling:
Catches and displays I/O exceptions for robust file handling.
