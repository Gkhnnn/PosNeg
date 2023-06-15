package encapsulationExercisess;

import java.util.ArrayList;
import java.util.Arrays;

public class C04JobTest {
    public static void main(String[] args) {
        C04_Job job1 = new C04_Job();
        C04_Job job2 = new C04_Job("SDET");
        C04_Job job3 = new C04_Job("DEV", "Google", 10000);
        System.out.println(job3.toString());

        ArrayList<C04_Job> joblist1 = new ArrayList<>();
        joblist1.add(new C04_Job("Sdet", "Chip", 10000));
        joblist1.add(new C04_Job("Sdet", "Google", 20000));
        joblist1.add(new C04_Job("Sdet", "Alibaba", 30000));
        double max = Double.MIN_VALUE;
        for (C04_Job each : joblist1) {
            if (each.getSalary() > max) {
                max = each.getSalary();
            }
        }
        System.out.println(max);
        double max1 = Double.MIN_VALUE;
        int heightIndex = 0;
        for (int i = 0; i < joblist1.size(); i++) {
            if (joblist1.get(i).getSalary() > max1) {
                max1 = joblist1.get(i).getSalary();
                heightIndex = i;
            }

        }
        System.out.println(joblist1.get(heightIndex).getSalary());
        System.out.println(joblist1.get(heightIndex).toString());
    }
}
