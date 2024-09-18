package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    String gender;
    String[] hobbies;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
      if(13>= age || age <= 19){
          return true;
      };
      return false;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName =  firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, String job, String gender){
       this(firstName, lastName, age);
       this.job = job;
       this.gender = gender;
    }
}
