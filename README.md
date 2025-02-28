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
