import java.util.LinkedList;
import java.util.Scanner;

public class GradeCalculator {

    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> report=new LinkedList<String>();
        LinkedList<Integer> marks=new LinkedList<Integer>();
        LinkedList<String>  subjects=new LinkedList<String>();


        System.out.println("Enter your subjects and the mark in percentage");
        System.out.println("In the Format 'Subject=99%', if you are done Enter 'Done' :");
        String line=sc.nextLine();
         report.add(line);

        while (!line.equals("Done")){
            line=sc.nextLine();
            report.add(line);
        }
         //split the string into subject and marks and store them into different LinkedList
        for(int i=0;i< report.size();i++){
            String element=report.get(i);
            if (!element.equals("Done")){
                //System.out.println(element);
                String[]  array=((report.get(i)).split("="));
                //System.out.println(array);
                marks.add(Integer.valueOf(array[1]));
                subjects.add(array[0]);
            }
            else{
                continue;
            }


        }

        //calculate sum
        int sum=0;
        for(int j=0;j< marks.size();j++){
            sum=sum+marks.get(j);
        }

        //calculate average
        int average=sum/ marks.size();
        System.out.println("Average is "+average);
    }
}
