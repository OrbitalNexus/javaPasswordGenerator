import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Password character counter
class PasswordCount {
    public static Scanner scnr = new Scanner(System.in);

    public static int userPassCharacterCount() {
        // Password character count
        int passCount = 0;

        // Question 1 - How many characters should password be
        System.out.println("How many characters would you like your password to be? (8-20)");

        // Error handling - while validNumber is false (not between 8-20), ask question.
        boolean validNumber = false;
        while (!validNumber) {
            int numInput = scnr.nextInt();

            if (8 <= numInput && numInput <= 20) {
                validNumber = true;
                passCount = numInput;
            } else {
                System.out.println("Please enter a number between 8-20");
            }
        }

        return passCount;
    }
}

// Ask user questions about what criteria they want in their password
class Criteria {
    public static int userPassCriteriaNum() {
        Scanner scnr = new Scanner(System.in);

        // Criteria count
        int critNum = 0;

        // Question 2 - UppercaseArray characters - Yes or No
        System.out.println("Do you want to include uppercase letters? (Yes or No)");
        String uppercaseArrayInput = scnr.nextLine();

        // If handler
        if (uppercaseArrayInput.equalsIgnoreCase("yes")) {
            critNum = critNum + 1;
        } else {
            critNum = critNum + 0;
        }

        // Question 3 - NumbersArray - Yes or No
        System.out.println("Do you want to include numbers? (Yes or No)");
        String numbersArrayInput = scnr.nextLine();

        // If handler
        if (numbersArrayInput.equalsIgnoreCase("yes")) {
            critNum = critNum + 2;
        } else {
            critNum = critNum + 0;
        }

        // Question 4 - Special characters - Yes or No
        System.out.println("Do you want to include special characters? (Yes or No)");
        String specialCharactersInput = scnr.nextLine();

        // If handler
        if (specialCharactersInput.equalsIgnoreCase("yes")) {
            critNum = critNum + 4;
        } else {
            critNum = critNum + 0;
        }

        scnr.close();
        return critNum;
    }
}

class Password {
    
    // Arrays and initializers
    String[] lowerCaseArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };
    String[] upperCaseArray = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z" };
    String[] numbersArray = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    String[] specialsArray = { "!", "@", "#", "$", "%", "^", "&", "*" };

    int i = 0;
    Random rand = new Random();

    int index;
    String randomString;
    String[] genPass;

    public String[] firstPass(int passCount, int critNum) {

        genPass = new String[passCount];

    // Select random integer and index from array and push to new array
    // Depending on which criteria number was selected either uppercase, numbers, or specials.
        if (critNum == 0) {
            while (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
            }
        }

        if (critNum == 1) {
            while (i < passCount) {
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }

                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = upperCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                

            }

        }

        if (critNum == 2) {
            while (i < passCount) {
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(10);
                String randomString = numbersArray[index];
                genPass[i] = randomString;
                i++;
                }
               

            }

        }

        if (critNum == 3) {
            while (i < passCount) {
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = upperCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(10);
                String randomString = numbersArray[index];
                genPass[i] = randomString;
                i++;
                }
                

            }

        }

        if (critNum == 4) {
            while (i < passCount) {

                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(8);
                String randomString = specialsArray[index];
                genPass[i] = randomString;
                i++;
                }
                

            }

        }
        
        if (critNum == 5) {
            while (i < passCount) {
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = upperCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(8);
                String randomString = specialsArray[index];
                genPass[i] = randomString;
                i++;
                }
                

            }

        }

        if (critNum == 6) {
            while (i < passCount) {
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(10);
                String randomString = numbersArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(8);
                String randomString = specialsArray[index];
                genPass[i] = randomString;
                i++;
                }
                
            }

        }

        if (critNum == 7) {
            while (i < passCount) {

                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = lowerCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(26);
                String randomString = upperCaseArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(10);
                String randomString = numbersArray[index];
                genPass[i] = randomString;
                i++;
                }
                
                if (i < passCount) {
                int index = rand.nextInt(8);
                String randomString = specialsArray[index];
                genPass[i] = randomString;
                i++;
                }
                

            }

        }

        return genPass;

    }
}

// Shuffles the new array and returns
class RandomPass {
    public String[] randomizer(String[] genPass) {
        //System.out.println(Arrays.toString(genPass));

        List<String> genPassShuffle = Arrays.asList(genPass);
        Collections.shuffle(genPassShuffle);

        return genPassShuffle.toArray(genPass);
    }
}

class FinalProject {
    public static void main(String args[]) {

        // initialize both the password count and the criteria number.
        int passwordCharacterCount = PasswordCount.userPassCharacterCount();
        int criteriaCount = Criteria.userPassCriteriaNum();

        // initialize the password class and shuffle password class. 
        Password newPass = new Password();
        RandomPass randomizer2 = new RandomPass();

        // call the firstPass method with password count and criteria number as arguments.
        String[] firstPass = newPass.firstPass(passwordCharacterCount, criteriaCount);
        String[] results = randomizer2.randomizer(firstPass);

        // print the final password.
        System.out.print("Your password: ");
        for (int i = 0; i < passwordCharacterCount; i++) {
            System.out.print(results[i]);
        }
        System.out.println("");
    }
}