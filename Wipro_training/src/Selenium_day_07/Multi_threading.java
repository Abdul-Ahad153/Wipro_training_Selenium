package Selenium_day_07;


class Chatting extends Thread {
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println("Chatting with friend... " + i);
         try { Thread.sleep(10); } catch(Exception e) {}
     }
 }
}


class Music extends Thread {
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println("Listening to music... " + i);
         try { Thread.sleep(12); } catch(Exception e) {}
     }
 }
}


class Download extends Thread {
 public void run() {
     for(int i = 1; i <= 3; i++) {
         System.out.println("Downloading file... " + i);
         try { Thread.sleep(15); } catch(Exception e) {}
     }
 }
}

public class Multi_threading { 
 public static void main(String[] args) {
     Chatting t1 = new Chatting();
     Music t2 = new Music();
     Download t3 = new Download();

  
     t1.start();
     t2.start();
     t3.start();
 }
}
