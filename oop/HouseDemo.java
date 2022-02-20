package oop;

public class HouseDemo {
    private int windowsCount;
    private int storiesCount;
    private String color;
    HouseDemo(int windowsCount,int storiesCount,String color){
        this.windowsCount=windowsCount;
        this.storiesCount=storiesCount;
        this.color=color;
    }
    public void printHouseData(){
        System.out.println("Windows Count : "+windowsCount+", Stories Count : "+storiesCount+", Color : "+color);
    }
    public void setWindowsCount(int windowsCount){
        this.windowsCount=windowsCount;
    }
    public void setStoriesCount(int storiesCount){
        this.storiesCount=storiesCount;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public int getWindowsCount(){
        return windowsCount;
    }
    public int getStoriesCount(){
        return storiesCount;
    }
    public static void main(String[] args){
        HouseDemo house1=new HouseDemo(5,2,"Green");
        HouseDemo house2=new HouseDemo(8,3,"White");
        house1.printHouseData();
        house2.printHouseData();
    }
}
