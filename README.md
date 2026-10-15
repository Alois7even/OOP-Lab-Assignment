# Rungano Alois T
# H250002N
# ICS2101 Object Oriented Lab Assignment 1 — Bank Account System

## Overview

This project implements a simple bank account system using Java to demonstrate Object-Oriented Programming (OOP) concepts.

The system supports two types of bank accounts: Savings Accounts and Current Accounts. Both share common functionality through an abstract `Account` class, while each account type implements its own withdrawal rules and month-end processing.

## Objectives

* Demonstrate abstraction using an abstract class.
* Implement inheritance using `SavingsAccount` and `CurrentAccount`.
* Demonstrate polymorphism by processing different account types through an `Account` reference.
* Apply encapsulation by controlling access to account data.
* Implement method overriding for withdrawals and month-end processing.
* Use Java collections to store and process different account types.

## Project Structure

```text
OOP-Lab-Assignment-1/
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
├── BankDemo.java
└── README.md
```

## Classes and Responsibilities

### 1. Account.java

An abstract class that defines the common properties and behaviours of all accounts.

* Stores the account number and balance.
* Provides a constructor for initialising account details.
* Implements `deposit()` with validation.
* Provides `getBalance()` and `getAccountNumber()` methods.
* Declares abstract `withdraw()` and `endOfMonth()` methods.

### 2. SavingsAccount.java

Extends `Account` and implements savings-specific rules.

* Maintains a minimum balance.
* Rejects withdrawals that would reduce the balance below the minimum.
* Adds monthly interest at a fixed rate of 2%.

### 3. CurrentAccount.java

Extends `Account` and implements current-account rules.

* Supports an overdraft facility.
* Allows withdrawals that result in a negative balance, provided the overdraft limit is not exceeded.
* Deducts a fixed monthly maintenance fee of 10.00.

### 4. BankDemo.java

Contains the `main()` method used to demonstrate the system.

* Creates a collection of savings and current accounts using `List<Account>`.
* Displays opening balances.
* Performs withdrawals through the common `Account` reference.
* Processes month-end operations polymorphically.
* Displays final balances.
