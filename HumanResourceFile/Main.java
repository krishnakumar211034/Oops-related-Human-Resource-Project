package com.example.HumanResources;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            File file = new File("C:\\Users\\Krishna Kumar K\\Downloads\\Assignment\\src\\com\\example\\HumanResources\\hr.txt");
            Scanner sc = new Scanner(file);
            ArrayList<Person> personArrayList=new ArrayList<>();
            sc.nextLine();
            while(sc.hasNext())
            {
                String temp=sc.nextLine();
                String arr[]=temp.split(" ");
                ArrayList<String> kk=new ArrayList<>();
                for(String a : arr)
                {
                    if(a!="")
                    {
                        kk.add(a);
                    }
                }
                personArrayList.add(new Person(kk.get(0),Double.parseDouble(kk.get(1)),Double.parseDouble(kk.get(2))));
            }
            for(Person ll : personArrayList)
            {
                System.out.println(ll.toString());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

