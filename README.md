ExercicioWriteCSV

This project was developed as a practical Java exercise to practice reading and writing CSV files, as well as to reinforce the use of classes, methods, exceptions, and data manipulation.
The goal is to read a CSV file containing product information, calculate the total for each product (value * quantity), and generate a new CSV file with the results.

💡 Project Objective
The program reads a .csv file containing products in the format:

name,value,quantity


Then, it calculates the total for each product and writes the results to a new output file in the format:

name,total


Example input (products.csv):

TV,1000.00,2
Mouse,50.00,5


Example output (summary.csv):

TV,2000.00
Mouse,250.00


🧩 Project Structure
The code is organized into packages for better structure:

application → contains the main class (Main) that starts the program

entities → classes representing system objects (e.g., Product, ProductCalc)

services → classes responsible for reading the file, performing calculations, and generating output

This structure demonstrates the concept of separation of responsibilities—each part of the code has a specific role.

🛠️ How to Run
Compile the program:

javac -d out src/application/Main.java src/entities/*.java src/services/*.java


Run the program:

java -cp out application.Main


Enter the full path of the input CSV file and the location where you want to save the new file.

Example on Windows:

Enter the source file path: C:\Users\Raphael\Documents\products.csv
Enter the destination folder path: C:\Users\Raphael\Documents\out.csv


The program will create a file named out.csv in the specified folder.

📘 About the Learning
This project was created to practice file reading and writing, list manipulation, and working with classes in Java. It is a simple exercise but represents an important step in solidifying fundamental Java concepts.

I am also aware that in real-world scenarios, for monetary calculations, it is better to use BigDecimal instead of double, and that there are more robust ways to handle CSV files (e.g., external libraries). Here, the goal was to understand and practice the logic “manually.”

📂 Example Folder Structure

ExercicioWriteCSV/
├── src/
│   ├── application/
│   │   └── Main.java
│   ├── entities/
│   │   ├── Product.java
│   │   └── ProductCalc.java
│   └── services/
│       ├── PullProductsService.java
│       ├── ProductCalculeService.java
│       └── CreateArchiveService.java


🧠 What This Project Demonstrates

Basic understanding of OOP (Object-Oriented Programming)

Use of packages and class organization

Reading and writing CSV files with BufferedReader and BufferedWriter

Use of try-with-resources to automatically close files

List manipulation (ArrayList) and string operations (split, trim, etc.)

Application of initial good practices in project structure

🗒️ Final Note
This project is a learning exercise designed to practice fundamental Java concepts, without focusing on external libraries or advanced structures. Over time, I plan to improve and refactor the code as my skills evolve.

✉️ Author
Raphael Salles – Londrina/PR
