package Selenium_day_07;

class Chatting implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Chatting with friend... " + i);
            try { Thread.sleep(10); } catch (Exception e) {}
        }
    }
}

class Music implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Listening to music... " + i);
            try { Thread.sleep(12); } catch (Exception e) {}
        }
    }
}

class Download implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Downloading file... " + i);
            try { Thread.sleep(15); } catch (Exception e) {}
        }
    }
}

public class Multi_Threading_Runnable {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable chatting = new Chatting();
        Runnable music = new Music();
        Runnable download = new Download();

        // Wrap them in Thread objects
        Thread t1 = new Thread(chatting);
        Thread t2 = new Thread(music);
        Thread t3 = new Thread(download);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
