package practiseIT;

import java.util.ArrayList;

public class JobTest {
    public static void main(tring[] args) {

        Job job1 = new Job();
        Job job2 = new Job("Developer");
        Job job3 = new Job("SDET", "Google", 100000);

        System.out.println(job1.toString());
        System.out.println(job2.toString());
        System.out.println(job3.toString());

        // Job objc. leri store edebilecegimiz bir list olustur
        // bu listeye 5 adet verileri tam olan job objecti ekleyin
        ArrayList<Job> list = new ArrayList<>();

        Job job4 = new Job("Devops","Chip",1100000);
        Job job5 = new Job("Dateseciens","Chip",120000);
        Job job6 = new Job("SDET","Chip",130000);
        Job job7 = new Job("Salesforces","Apple",1500000);


        list.add(job3);
        list.add(job4);
        list.add(job5);
        list.add(job6);
        list.add(job7);

        System.out.println("list.toString() = " + list.toString());

        // liste içindeki en yüksek maaşa sahip olan job u yazdırın

        double max = Double.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSalary()>max){
                max=list.get(i).getSalary();
                index=i;
            }
        }
        System.out.println(list.get(index).toString());

    }
}
