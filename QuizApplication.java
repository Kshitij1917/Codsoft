import java.util.Scanner;
import java.util.concurrent.*;

class QuizQuestion 
{
    private String question;
    private String[] options;
    private int correctAnswer;

    public QuizQuestion(String question, String[] options, int correctAnswer) 
    {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() 
    {
        return question;
    }

    public String[] getOptions()
    {
        return options;
    }

    public int getCorrectAnswer()
    {
        return correctAnswer;
    }
}

public class QuizApplication 
{
    private static final int TIME_LIMIT_PER_QUESTION = 10; 
    private static final QuizQuestion[] quizQuestions = 
    {
            new QuizQuestion("What is the capital of France?",
                    new String[]{"1. London", "2. Paris", "3. Berlin", "4. Madrid"}, 2),
            new QuizQuestion("Which planet is known as the Red Planet?",
                    new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}, 2),
            new QuizQuestion("What is the largest mammal?",
                    new String[]{"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Shark"}, 2),
            new QuizQuestion("Who wrote 'Romeo and Juliet'?",
                    new String[]{"1. Charles Dickens", "2. William Shakespeare", "3. Mark Twain", "4. Jane Austen"}, 2),
            new QuizQuestion("What is the chemical symbol for water?",
                    new String[]{"1. H2O", "2. CO2", "3. O2", "4. NaCl"}, 1)
    };

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("You have " + TIME_LIMIT_PER_QUESTION + " seconds to answer each question.\n");

        for (int i = 0; i < quizQuestions.length; i++) 
        {
            QuizQuestion currentQuestion = quizQuestions[i];
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());
            for (String option : currentQuestion.getOptions()) 
            {
                System.out.println(option);
            }
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> {
                System.out.print("Enter your answer (1-4): ");
                return scanner.nextInt();
            });
            try 
            {
                int userAnswer = future.get(TIME_LIMIT_PER_QUESTION, TimeUnit.SECONDS);
                if (userAnswer == currentQuestion.getCorrectAnswer()) 
                {
                    System.out.println("Correct!\n");
                    score++;
                } 
                else 
                {
                    System.out.println("Incorrect! The correct answer was: " + currentQuestion.getCorrectAnswer() + "\n");
                }
            } catch (TimeoutException e) 
            {
                System.out.println("\nTime's up! The correct answer was: " + currentQuestion.getCorrectAnswer() + "\n");
                future.cancel(true); 
            } 
            catch (Exception e) 
            {
                System.out.println("An error occurred. Moving to the next question.\n");
            } 
            finally 
            {
                executor.shutdownNow();
            }
        }
        System.out.println("----- Quiz Results -----");
        System.out.println("Total Questions: " + quizQuestions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Incorrect Answers: " + (quizQuestions.length - score));
        System.out.println("Final Score: " + score + "/" + quizQuestions.length);

        scanner.close();
    }
}
