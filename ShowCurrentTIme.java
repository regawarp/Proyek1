/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showcurrenttime;

/**
 *
 * @author lenovo
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long totalMiliseconds = System.currentTimeMillis(); //waktu diambil dari mili seconds
        long totalSeconds = totalMiliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60); //int buat apa?????????
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + 7; // + 7 Karena Indonesia
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
    
}
