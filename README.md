# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: GAYATHRI M

*INTERN ID*: CT04WF66

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

## This Java program demonstrates how to write to, read from, and modify a text file using a very simple approach without using any custom methods, classes,constructors,or try-catch blocks. It begins by importing the necessary Java I/O and utility classes java.io.* and java.util.Scanner. Inside the main method, which is declared with throws Exception to handle any file-related errors, a file name textfilename.txt is specified. The program then uses FileWriter to create and write the initial string "This is the original text." into the file. After writing, it reads the content using a Scanner, line by line, and prints it to the console.

## Next, to modify the file, the program reads all lines again into a single string variable called content. It uses string concatenation to build the full content with line breaks. Once all text is loaded into memory, the program replaces the word "original" with "modified" using the replace method. Then it writes this updated content back into the file using FileWriter, effectively overwriting the original content. Finally, the program reads the file once more and prints the updated content to show the changes.

#OUTPUT

![Image](https://github.com/user-attachments/assets/21939df3-96fe-45af-a6d1-e33d98735765)
