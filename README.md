# GETEST

GETEST is a calculator to determine how much food your dog shelter should order based on amount of dogs and remaining food.

## Installation

Install Maven to run the unit tests by doing the following:

If you do not already have Homebrew installed on your Mac, you can install it by running the following command 




```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"

```
To install Maven using Homebrew, open a terminal window and run the following command

```bash
brew install maven
```
Once the installation is complete you can check it by running the following command

```bash
mvn -v
```
## Usage

To run the unit tests, in terminal navigate to the project folder and run the following command

```bash
mvn test 
```
To target a single unit test, use the following command
```bash
mvn -Dtest=TestClassName#methodname test
```
