public class Votersdetails {

    protected String name;
    protected int age;
public static void main(String[] args) {
    
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
   
        return age;
    
    
}

public void setAge(int age) {
    if(age<18){
        System.out.println("you are  not eligible to vote.");
    }
    else if(age>18){
        System.out.println("Now you can vote.");
    }
    else {
    this.age = age;
    }
}
}