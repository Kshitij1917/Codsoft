# Codsoft
Java Projects
1. Guessing Game   
Welcome to the Guessing Game! This is a simple yet fun Java-based console game where the player guesses a randomly generated number within a specified range. The game is designed to test your guessing skills and keep track of your score based on how quickly you guess the correct number.

# How It Works
1. The game generates a random number between 1 and 100.
2. The player has a maximum of 10 attempts to guess the correct number.
3. After each guess, the game provides feedback:
4. If the guess is too low, it tells the player to guess higher.
5. If the guess is too high, it tells the player to guess lower.
6. If the player guesses the correct number within the allowed attempts, they win and earn a score based on the number of attempts taken.
7. If the player exhausts all attempts, the game reveals the correct number.
8. The player can choose to play again or exit the game.

# Features
1. Random Number Generation: The game uses Java's Random class to generate a random number between 1 and 100.
2. Score Calculation: The player earns points based on how quickly they guess the correct number. Fewer attempts result in a higher score.
3. User-Friendly Interface: The game provides clear instructions and feedback after each guess.
4. Replayability: Players can choose to play multiple rounds, and their score accumulates across rounds.
5. Input Validation: The game uses the Scanner class to handle user input and ensures the input is a valid integer.

# How to Run the Game
1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the GuessingGame.java file.
3. Open a terminal or command prompt and navigate to the directory containing the GuessingGame.java file.
4. Compile the Java file using the following command:
javac GuessingGame.java
5. Run the compiled program using:
java GuessingGame
6. Follow the on-screen instructions to play the game.

# Code Structure
1. Random Number Generation: The Random class is used to generate a random number between 1 and 100.
2. User Input Handling: The Scanner class is used to read the player's guesses and responses.

# Game Logic:
1. The game loop allows the player to keep guessing until they either guess correctly or run out of attempts.\
2. The score is calculated based on the number of attempts taken to guess the correct number.
3. Replay Option: After each round, the player can choose to play again or exit the game.

# Example Output
1. Welcome to the Guessing Game!
2. I have chosen a number between 1 and 100. Can you guess it?
3. Enter your guess: 50
4. Your guess is too low. Try again.
5. Enter your guess: 75
6. Your guess is too high. Try again.
7. Enter your guess: 63
8. Congratulations! You guessed the correct number in 3 attempts.
9. Your current score is: 8
10. Do you want to play again? (yes/no): yes
11. I have chosen a number between 1 and 100. Can you guess it?
12. Enter your guess: 40
13. Your guess is too high. Try again.
    
# Contributing
Feel free to contribute to this project! If you have any suggestions, improvements, or bug fixes, please open an issue or submit a pull request.

# Student Grade Calculator
The Student Grade Calculator is a simple Java-based console application designed to calculate a student's total marks, average percentage, and corresponding grade based on the marks obtained in multiple subjects. This tool is useful for students and educators to quickly determine academic performance.

# Features
1. Input Marks: Enter marks obtained in each subject (out of 100).
2. Input Validation: Ensures marks are within the valid range (0 to 100). If invalid marks are entered, the program prompts the user to re-enter the correct value.
3. Total Marks Calculation: Sums up the marks obtained in all subjects.
4. Average Percentage Calculation: Computes the average percentage by dividing the total marks by the number of subjects.
5. Grade Assignment: Assigns a grade based on the average percentage using the following grading system:  
6. A+ for 90% and above
7. A for 80% - 89%
8. B for 70% - 79%
9. C for 60% - 69%
10. D for 50% - 59%
11. F for below 50%
12. Result Display: Displays the total marks, average percentage (formatted to 2 decimal places), and the corresponding grade.

# How It Works
1. The program prompts the user to enter the number of subjects.
2. For each subject, the user inputs the marks obtained (out of 100). The program validates the input to ensure it is within the valid range (0 to 100).
3. The program calculates:
4. Total Marks: Sum of marks obtained in all subjects.
5. Average Percentage: Total marks divided by the number of subjects.
6. Grade: Based on the average percentage.
7. The results are displayed in a clear and formatted manner.
8. Example Output
9. Enter the number of subjects: 5
10. Enter marks for Subject 1 (out of 100): 85
11. Enter marks for Subject 2 (out of 100): 92
12. Enter marks for Subject 3 (out of 100): 78
13. Enter marks for Subject 4 (out of 100): 88
14. Enter marks for Subject 5 (out of 100): 95
15. ----- Student Grade Report -----
16. Total Marks: 438
17. Average Percentage: 87.60%
18. Grade: A
#  How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the StudentGradeCalculator.java file.
3. Open a terminal or command prompt and navigate to the directory containing the StudentGradeCalculator.java file.
4. Compile the Java file using the following command:
javac StudentGradeCalculator.java
5. Run the compiled program using:
java StudentGradeCalculator
6. Follow the on-screen instructions to input marks and view the results.

# Code Structure
1. Input Handling: The program uses the Scanner class to take user input for the number of subjects and marks obtained in each subject.
2. Input Validation: A while loop ensures that marks are within the valid range (0 to 100).
3. Calculations:
4. Total marks are calculated by summing up the marks obtained in all subjects.
5. Average percentage is calculated by dividing the total marks by the number of subjects.
6. Grade Assignment: A series of if-else statements assign a grade based on the average percentage.
7. Output: The results are displayed in a formatted manner using System.out.println.

# Contributing
Contributions are welcome! If you have any suggestions, improvements, or bug fixes, feel free to open an issue or submit a pull request.

# ATM Interface
The ATM Simulation is a Java-based console application that mimics the functionality of an Automated Teller Machine (ATM). It allows users to perform basic banking operations such as checking their account balance, depositing funds, and withdrawing funds. The program is designed to be user-friendly and includes input validation to ensure smooth and secure transactions.

# Features
1. Check Balance: Users can view their current account balance.
2. Deposit Funds: Users can deposit money into their account. The program validates the deposit amount to ensure it is a positive value.
3. Withdraw Funds: Users can withdraw money from their account. The program validates the withdrawal amount to ensure it is a positive value and does not exceed the available balance.
4. Exit: Users can exit the ATM interface at any time.
5. Input Validation: Ensures that all inputs (e.g., deposit and withdrawal amounts) are valid and within acceptable limits.
6. User-Friendly Interface: Displays a clear menu and provides appropriate feedback for each transaction.

# How It Works
1. The program starts by initializing a BankAccount with an initial balance.
2. The ATM class provides a menu with the following options:
3. Check Balance: Displays the current account balance.
4. Deposit: Prompts the user to enter a deposit amount and updates the account balance.
5. Withdraw: Prompts the user to enter a withdrawal amount and updates the account balance if sufficient funds are available.
6. Exit: Exits the ATM interface.
7. The program loops until the user chooses to exit.

# Code Structure
1. BankAccount Class:
2. Represents the user's bank account.
3. Contains methods to deposit, withdraw, and checkBalance.
4. Validates input to ensure deposit and withdrawal amounts are valid.
5. ATM Class:
6. Represents the ATM machine.
7. Displays a menu and handles user input.
8. Connects to the BankAccount class to perform transactions.
9. ATMSimulation Class:
10. The main class that initializes the bank account and ATM, then runs the ATM interface.

# Example Output

2. ----- ATM Menu -----
3. 1. Check Balance
4. 2. Deposit
5. 3. Withdraw
6. 4. Exit
7. Enter your choice: 1
8. Current balance: $1000.0

9. ----- ATM Menu -----
10. 1. Check Balance
11. 2. Deposit
12. 3. Withdraw
13. 4. Exit
14. Enter your choice: 2
15. Enter deposit amount: $500
16. Deposit successful. New balance: $1500.0

17. ----- ATM Menu -----
18. 1. Check Balance
19. 2. Deposit
20. 3. Withdraw
21. 4. Exit
22. Enter your choice: 3
23. Enter withdrawal amount: $200
24. Withdrawal successful. New balance: $1300.0

25. ----- ATM Menu -----
26. 1. Check Balance
27. 2. Deposit
28. 3. Withdraw
29. 4. Exit
30. Enter your choice: 4
31. Thank you for using the ATM. Goodbye!
    
# How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the ATMSimulation.java file.
3. Open a terminal or command prompt and navigate to the directory containing the ATMSimulation.java file.
4. Compile the Java file using the following command:
javac ATMSimulation.java
5. Run the compiled program using:
java ATMSimulation
6. Follow the on-screen instructions to interact with the ATM.
7. Customization
8. You can extend the program by adding features like:
9. A PIN-based login system for added security.
10. Transaction history to track deposits and withdrawals.
11. Support for multiple user accounts.
12. A graphical user interface (GUI) using Java Swing or JavaFX.

# Contributing
Contributions are welcome! If you have any suggestions, improvements, or bug fixes, feel free to open an issue or submit a pull request.


