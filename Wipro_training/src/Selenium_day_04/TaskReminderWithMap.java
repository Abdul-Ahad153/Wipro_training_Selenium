//package Selenium_day_04;
//
//import java.util.*;
//
//public class TaskReminderWithMap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, String> taskMap = new HashMap<>();
//
//        System.out.print("How many tasks? ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter task " + i + ": ");
//            String task = sc.nextLine();
//
//            System.out.print("Enter deadline for \"" + task + "\": ");
//            String deadline = sc.nextLine();
//
//            taskMap.put(task, deadline);
//        }
//
//        System.out.println("\n All tasks saved! You'll be reminded every 1 minute.\n");
//
//        Timer timer = new Timer();
//        TimerTask reminderTask = new TimerTask() {
//            public void run() {
//                System.out.println("⏰ Reminder! Here are your upcoming tasks:");
//                for (Map.Entry<String, String> entry : taskMap.entrySet()) {
//                    System.out.println("📌 Task: " + entry.getKey() + " | Deadline: " + entry.getValue());
//                }
//                System.out.println("---------------------------------------------\n");
//            }
//        };
//
//        timer.scheduleAtFixedRate(reminderTask, 0, 60 * 1000); // every 1 minute
//    }
//}
//
