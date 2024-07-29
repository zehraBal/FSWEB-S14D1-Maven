package com.workintech.developers;

public class HRManager extends Employee {
    private String[] JuniorDeveloper;
    private  String[] MidDeveloper;
    private  String[] SeniorDeveloper;

    public  HRManager(long id,String name, double salary){
        super(id,name,salary);

    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        if(index<0 || index>JuniorDeveloper.length){
            System.out.println("This index is not defined");
        } else if (JuniorDeveloper[index]!=null) {
            System.out.println("This index is in use");
        }

        JuniorDeveloper[index]= juniorDeveloper.toString();
    }

    public void addEmployee(int index,MidDeveloper midDeveloper){
        if(index<0 || index>MidDeveloper.length){
            System.out.println("This index is not defined");
        } else if (MidDeveloper[index]!=null) {
            System.out.println("This index is in use");
        }
        MidDeveloper[index]=midDeveloper.toString();
    }

    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        if(index<0 || index>SeniorDeveloper.length){
            System.out.println("This index is not defined");
        } else if (SeniorDeveloper[index]!=null) {
            System.out.println("This index is in use");
        }
       SeniorDeveloper[index]=seniorDeveloper.toString();
    }

}
