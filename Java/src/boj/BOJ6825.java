package boj;

import java.io.*;

public class BOJ6825 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * The Body Mass Index (BMI) is one of the calculations used by doctors to assess an adult’s health.
         * The doctor measures the patient’s height (in metres) and weight (in kilograms),
         * then calculates the BMI using the formula
         * 
         * BMI = weight / (height × height).
         * 
         * Write a program which prompts for the patient’s height and weight,
         * calculates the BMI, and displays the corresponding message from the table below.
         * 
         * BMI Category            Message
         * ---------------------   ----------------
         * More than 25            Overweight
         * Between 18.5 and 25.0   Normal weight
         * Less than 18.5          Underweight
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        if( weight / (height * height) > 25.0){
            sb.append("Overweight");
        } else if(weight / (height * height) > 18.5){
            sb.append("Normal weight");
        } else {
            sb.append("Underweight");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
