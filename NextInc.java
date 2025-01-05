/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.newapp;

/**
 *
 * @author user
 */
public class NextAIInc {
        public static void main(String[] args) {
        // Test Cases
        calculatePay(30000, 51); // Contractor A
        calculatePay(20000, 40); // Contractor B
        calculatePay(35000, 96); // Contractor C
        }
public static void calculatePay(int basePay, int hoursWorked) {
        if (basePay < 30000) {
            System.out.println("Error: Base pay must be at least UGX 30,000.");
            return;
        }
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked cannot exceed 72 hours per week.");
            return;
        }
  int regularHours = Math.min(hoursWorked, 48);
        int overtimeHours = Math.max(0, hoursWorked - 48);

        int regularPay = regularHours * basePay;
        int overtimePay = overtimeHours * basePay * 2;

        int totalPay = regularPay + overtimePay;

        System.out.println("Total pay: UGX " + totalPay);
    }

}
