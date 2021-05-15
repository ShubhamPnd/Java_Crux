package com.example.java;

public class Show_grade {
    public static void main(String[] args) {
        char grade ='B';
        // Encrypt the Code...
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypt the Grade...
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
