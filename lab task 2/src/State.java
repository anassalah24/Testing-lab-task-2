
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;

public class State {


    /* This function returns "even" if passed number is even and "odd" if passed number is odd*/

    public String EvenOddChecker(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Unaccepted Number");
        }
        if (n % 2 == 0)
            return "even";
        else
            return "odd";

    }

    /*This function return an array,
     This array contains the maximum in its first index and the minimum in its second index*/

    public int[] maxAndmin(int[] numbers) {
        int[] minAndmaxArr = new int[2];
        if (numbers.length == 0) {
            throw new IllegalArgumentException("empty array");
        }
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        minAndmaxArr[0] = maxValue;
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        minAndmaxArr[1] = minValue;
        return minAndmaxArr;

    }

    /* This funtion takes a string as input containing several button clicks of a b c d and prints out
        current state , innerstate , date and time
     */
    public void question3(String myinput) {
        String state = "Normal Display";
        String innerState = "Time";
        int m = 0, h = 0, D = 1, M = 1, Y = 2000;
        myinput.toLowerCase();
        for (int i = 0; i < myinput.length(); i++) {
            char currentChar = myinput.charAt(i);
            switch (state) {
                case "Normal Display":
                    if (currentChar == 'c') {
                        state = "Update";
                        innerState = "min";
                    }
                    if (currentChar == 'b') {
                        state = "Alarm";
                        innerState = "Alarm";
                    }
                    if (currentChar == 'a') {
                        if (innerState == "Time") {
                            innerState = "Date";
                        } else {
                            innerState = "Time";
                        }
                    }
                    if (currentChar == 'd') {
                        System.out.println("No action in this state with input d");
                    }
                    break;
                case "Alarm":
                    if (currentChar == 'a') {
                        if (innerState == "Alarm") {
                            innerState = "Chime";
                        }
                    }
                    if (currentChar == 'b') {
                        System.out.println("No action in this state with input b");
                    }
                    if (currentChar == 'c') {
                        System.out.println("No action in this state with input c");
                    }
                    if (currentChar == 'd') {
                        state = "Normal Display";
                        innerState = "Time";
                    }
                    break;
                case "Update":
                    if (currentChar == 'a') {
                        switch (innerState) {
                            case "min":
                                innerState = "hour";
                                break;
                            case "hour":
                                innerState = "day";
                                break;
                            case "day":
                                innerState = "month";
                                break;
                            case "month":
                                innerState = "year";
                                break;
                            case "year":
                                state = "Normal Display";
                                innerState = "Time";
                                break;
                        }
                    }
                    if (currentChar == 'b') {
                        switch (innerState) {
                            case "min":
                                m++;
                                if (m == 60) {
                                    m = 0;
                                    h++;
                                    if (h == 24) {
                                        h = 0;
                                        D++;
                                        if (D == 31) {
                                            D = 1;
                                            M++;
                                            if (M == 13) {
                                                M = 1;
                                                Y++;
                                            }
                                        }

                                    }
                                }
                            case "hour":
                                h++;
                                if (h == 24) {
                                    h = 0;
                                    D++;
                                    if (D == 31) {
                                        D = 1;
                                        M++;
                                        if (M == 13) {
                                            M = 1;
                                            Y++;
                                        }
                                    }

                                }
                            case "day":
                                D++;
                                if (D == 31) {
                                    D = 1;
                                    M++;
                                    if (M == 13) {
                                        M = 1;
                                        Y++;
                                    }
                                }
                            case "month":
                                M++;
                                if (M == 13) {
                                    M = 1;
                                    Y++;
                                }
                            case "year":
                                Y++;

                        }
                    }
                    if (currentChar == 'c') {
                        System.out.println("No action in this state with input c");
                    }
                    if (currentChar == 'd') {
                        state = "Normal Display";
                        innerState = "Time";
                    }
                    break;

            }
            System.out.println("Current State is : " + state);
            System.out.println("Current innerState is : " + innerState);
            System.out.println("DATE: " + Y + " - " + M + " - " + D);
            System.out.println("TIME: " + h + " : " + m);

        }

    }

    /* This funtion takes a string as input containing several button clicks of a b c d and prints out
            current state , innerstate , date and time
         */
    ArrayList<String> output = new ArrayList<String>();
    String myInput;

    public String getMyInput() {
        return myInput;
    }

    public void setMyInput(String myInput) {
        this.myInput = myInput;
    }

    public void State() throws IOException {
        String myInput = getMyInput();
        if (myInput.length() == 0) {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter printwrite = new PrintWriter(fos);
            output.add("Your Input is empty");
            printwrite.write(String.valueOf(output));
            printwrite.flush();
            fos.close();
            printwrite.close();
        } else {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter printwrite = new PrintWriter(fos);

            String state = "Normal Display";
            String innerState = "Time";
            int m = 0, h = 0, D = 1, M = 1, Y = 2000;
            myInput.toLowerCase();
            for (int i = 0; i < myInput.length(); i++) {
                char currentChar = myInput.charAt(i);
                switch (state) {
                    case "Normal Display":
                        if (currentChar == 'c') {
                            state = "Update";
                            innerState = "min";
                        }
                        if (currentChar == 'b') {
                            state = "Alarm";
                            innerState = "Alarm";
                        }
                        if (currentChar == 'a') {
                            if (innerState == "Time") {
                                innerState = "Date";
                            } else {
                                innerState = "Time";
                            }
                        }
                        if (currentChar == 'd') {
                            output.add("No action in this state with input d");
                        }
                        break;
                    case "Alarm":
                        if (currentChar == 'a') {
                            if (innerState == "Alarm") {
                                innerState = "Chime";
                            }
                        }
                        if (currentChar == 'b') {
                            output.add("No action in this state with input b");


                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");


                        }
                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;
                    case "Update":
                        if (currentChar == 'a') {
                            switch (innerState) {
                                case "min":
                                    innerState = "hour";
                                    break;
                                case "hour":
                                    innerState = "day";
                                    break;
                                case "day":
                                    innerState = "month";
                                    break;
                                case "month":
                                    innerState = "year";
                                    break;
                                case "year":
                                    state = "Normal Display";
                                    innerState = "Time";
                                    break;
                            }
                        }
                        if (currentChar == 'b') {
                            switch (innerState) {
                                case "min":
                                    m++;
                                    if (m == 60) {
                                        m = 0;
                                        h++;
                                        if (h == 24) {
                                            h = 0;
                                            D++;
                                            if (D == 31) {
                                                D = 1;
                                                M++;
                                                if (M == 13) {
                                                    M = 1;
                                                    Y++;
                                                }
                                            }

                                        }
                                    }
                                case "hour":
                                    h++;
                                    if (h == 24) {
                                        h = 0;
                                        D++;
                                        if (D == 31) {
                                            D = 1;
                                            M++;
                                            if (M == 13) {
                                                M = 1;
                                                Y++;
                                            }
                                        }

                                    }
                                case "day":
                                    D++;
                                    if (D == 31) {
                                        D = 1;
                                        M++;
                                        if (M == 13) {
                                            M = 1;
                                            Y++;
                                        }
                                    }
                                case "month":
                                    M++;
                                    if (M == 13) {
                                        M = 1;
                                        Y++;
                                    }
                                case "year":
                                    Y++;

                            }
                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");

                        }
                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;

                }
                output.add("Current State is : " + state);
                output.add("Current innerState is : " + innerState);
                output.add("DATE: " + Y + " - " + M + " - " + D);
                output.add("TIME: " + h + " : " + m);


            }
            System.out.println(output);
            printwrite.write(String.valueOf(output));
            printwrite.flush();
            fos.close();
            printwrite.close();


        }
    }
}






