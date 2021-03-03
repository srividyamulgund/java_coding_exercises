package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        char firstChar = Character.toUpperCase(word.charAt(0));
        String newWord = firstChar + word.substring(1);

        return newWord;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0, 1) + "." + lastName.substring(0, 1);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double res = 0.0d;
        res = (((vatRate / 100) * originalPrice) + originalPrice);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double finalPrice = Double.parseDouble(df.format(res));
        return (finalPrice);
    }

    public String reverse(String sentence) {
        // Add your code here
        String reversed = new StringBuilder(sentence).reverse().toString();
        // The other way is to convert string to character array, calculate the length,
        // find half of the length,
        // iterate over half the length and swap the elements (first, last) (second,
        // last but one) etc...
        return reversed;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;

        for (User user : users) {
            switch (user.getType()) {
                case "Linux":
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}
