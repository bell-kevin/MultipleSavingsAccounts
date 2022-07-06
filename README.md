# MultipleSavingsAccounts
In this example, you will enhance the Savings Account driver to create multiple accounts. The project will create 3 separate Savings Accounts, simulating 3 different customers creating these accounts. Note that no changes are needed in the Account class – it describes an account, and it doesn’t matter how many accounts we create with that class. It’s like a favorite cookie recipe – it’s the same recipe no matter how many times you bake cookies.  

First, MAKE A COPY of the previous project for the Savings Account.  

In the project in Example 1, a Savings Account was created with this line:      
  Account savingsAccount = new Account();  

In this project, for clarity, name that account “savings1”, like this:      
Account savings1 = new Account();  

To create a second account, you repeat that same code but with a different name for the object.      
  Account savings1 = new Account();   // first account      
  Account savings2 = new Account();   // second account  

When this executes, there will be 2 distinct account objects. Each one has its own instance variables of balance and interest rate, and each has its own methods to get and set its variables and to grow.  

Create a third account.  

The original project asked the user for 3 pieces of information for 1 account. This project simulates asking 3 different users for those 3 pieces of information. That sounds like repetition, so use a FOR loop to ask for the data and assign the values to the variables in each object. Also grow the accounts inside this loop. You must use the same variables for the user input – balance, interestRate, and cycles – for each user’s information. Do not create 3 sets of those variables.

Because you have to refer to each Account object by its specific name,  you will see what looks like duplication of code when setting the values for each object.

Make sure you fully set up all 3 of the objects inside the FOR loop.

Outside of the FOR loop, display the results for all 3 accounts. Because the number of cycles was not saved in the Account object, the output can’t display that value in the output as was done in the previous version of this project.

See below for the sample session. Note that you must have the usual heading with your name and a blank line. There must be a blank line between accounts – remember to use the escape character of “\n” in the print statements, do NOT use a print statement that only creates a blank line. There must be a blank line before the results are printed. The values of the results must be formatted to display comma separators and only 2 decimal places.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
