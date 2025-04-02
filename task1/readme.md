Task #1
Write a program that converts the amount of money from Chinese yuan
to Russian rubles at the purchase rate of 11.91.
Task analysis
Task constants:
final double ROUBLES_PER_YUAN = 11.91; // purchase rate
Task input data:
int yuan; // amount of money in Chinese yuan
Output data of the task:
double roubles; // amount of money in Russian rubles
Relevant formulas:
roubles = ROUBLES_PER_ YUAN * yuan;
Designing
The algorithm for solving the problem with clarifications
1. Get the amount of money in Chinese yuan.
2. Convert the amount of money into Russian rubles.
2.1. roubles = ROUBLES_PER_YUAN * yuan;
3. Display the amount of money in Russian rubles in favor of the buyer.



Task #2
Rewrite the program that converts the amount of money from Chinese
yuan to Russian rubles at the purchase rate of 11.91, adding
a selection structure for making decisions about the endings of the input currency depending
on its value.
Task analysis
In order to determine the ending, for example, for Chinese yuan
(Chinese yuan / Chinese yuan / Chinese yuan) depending on their
amount, it is necessary to calculate the last digit of the input amount.
Program variables: int digit; // last digit dollars
The corresponding formulas are: digit = yuen % 10;
