#!/bin/bash

# echo "Hello World!"
# read -p "What is your name? " name

# activity[0]="Football"
# activity[1]="Table Tennis"
# activity[2]="* Ball Pool"
# activity[3]="PS5"
# activity[4]="Blackjack"

# array_length=${#activity[@]}
# index=$(($RANDOM%$array_length)) #Randomly select an index from 0 to array_length

# echo "Hi" $name, "would you like to play" ${activity[$index]}"?"
# read -p "Answer: " answer

# hello_world(){
#     echo "Hello!!!!"
# }

# greet(){
#     echo "Hello $1 $2"
# }

# greet

#IF STATEMENTS
read -p "Give me a number: " number
if [ $number -gt 10 ];
then
    echo "Your number is greater than 10."
fi 