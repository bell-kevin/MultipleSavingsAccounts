# MultipleSavingsAccounts
In this example, you will enhance the Savings Account driver to create multiple accounts. The project will create 3 separate Savings Accounts, simulating 3 different customers creating these accounts. Note that no changes are needed in the Account class – it describes an account, and it doesn’t matter how many accounts we create with that class. It’s like a favorite cookie recipe – it’s the same recipe no matter how many times you bake cookies.  First, MAKE A COPY of the previous project for the Savings Account.  In the project in Example 1, a Savings Account was created with this line:      Account savingsAccount = new Account();  In this project, for clarity, name that account “savings1”, like this:      Account savings1 = new Account();  To create a second account, you repeat that same code but with a different name for the object.      Account savings1 = new Account();   // first account      Account savings2 = new Account();   // second account  When this executes, there will be 2 distinct account objects. Each one has its own instance variables of balance and interest rate, and each has its own methods to get and set its variables and to grow.  Create a third account.  The original project asked the user for 3 pieces of information for 1 account. This project simulates asking 3 different users for those 3 pieces of information. That sounds like repetition, so use a FOR loop to ask for the data and assign the values to the variables in each object. Also grow the accounts inside this loop. You must use the same variables for the user input – balance, interestRate, and cycles – for each user’s information. Do not create 3 sets of those variables.