/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showcurrenttime;

/**
 *
 * @author sazzad
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        long currentSccond = (int)(totalSeconds% 60);
        
        long totalMinute = totalSeconds /60;
        long currentMinute = totalMinute% 60;
        
        long totalHour = totalMinute /60;
        long currentHour = totalHour% 24;
        
        
        System.out.println("current time is "+ currentHour+":"+currentMinute+":"+currentSccond);
    }
    
}
