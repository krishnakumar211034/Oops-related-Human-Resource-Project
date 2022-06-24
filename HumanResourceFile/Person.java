package com.example.HumanResources;
class Person
{
    private String name;
    private double height;
    private double weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String formatting(int n,String arr) {
        if(n>arr.length())
        {
            for(int i=arr.length();i<n;i++)
            {
                arr=arr+" ";
            }
            return arr;
        }
        else return arr.substring(0,14);
    }
    @Override
    public String toString() {
        String Name=formatting(15,name);
        String Height=formatting(15,String.format("%lf",height));
        String Weight=formatting(15,String.format("%lf",weight));
        return (Name+Height+Weight);
    }
}
