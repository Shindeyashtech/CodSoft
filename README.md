# Bank Management System

This is a simple bank management system implemented in Java. It allows users to interact with their bank account, including checking balance, depositing, withdrawing, and viewing previous transactions.

## Code Explanation

### Main Class (Bank)

1. Importing necessary libraries.
2. Defining the main class Bank.
3. Inside the main method:
   - Printing a welcome message.
   - Initializing a Scanner object for user input.
   - Entering a continuous loop for user interaction.
   - Prompting the user to input account number and PIN.
   - Checking the validity of the account number and PIN.
   - Displaying a welcome message if the credentials are correct.
   - Creating a BankAccount object for the authenticated user.
   - Calling the showMenu method of BankAccount to display the banking options.

### BankAccount Class

1. Defining the BankAccount class.
2. Declaring instance variables for balance, previous transaction, and account number.
3. Constructor to initialize the account number.
4. Methods for depositing, withdrawing, and getting the previous transaction.
5. printMenu method to display the menu options.
6. showMenu method to display the menu and handle user input using a do-while loop.

### isValidAccountNumber Method

1. A dummy method for validating the account number.
2. Returns true if the account number matches a predefined value.

### isValidPin Method

1. A dummy method for validating the PIN.
2. Returns true if the PIN matches a predefined value.

## How to Run

1. Compile the Java files using javac Bank.java.
2. Run the compiled program using java Bank.

## Usage

1. Enter your account number.
2. Enter your PIN.
3. Choose from the menu options to perform banking operations.

## Notes

- This is a basic implementation for demonstration purposes.
- Replace the dummy validation methods with actual validation logic for real-world applications.
- Additional error handling and security measures should be implemented for a production-ready system.
