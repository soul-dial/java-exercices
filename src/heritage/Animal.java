package heritage;

public class Animal {

    private String name ;
    private int age ;

    Animal (String name, int age){

        this.age = age ;

        this.name = name ;

    }

    public String getName(){
       return this.name;

    }

    public  int getAge(){
        return this.age;
    }

    public void manger(){
        System.out.println("l'animal mange");

    }

}
