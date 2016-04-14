/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annettecruz
 */

public class Student {
    private String name;
    private String id;
    private static int numberOfStudents;
    
    public void setName(String name)
    {
    this.name = name;
    }
    
    public String getName()
    {
    return name;
    }
    
    public void setId(String id)
    {
    this.id = id;
    }
    
    public String getId()
    {
    return id;    
    }
    
    public static int getNumberOfStudents()
    {
    return numberOfStudents;
    }
    
    public Student()
    {
    name = "No name";
    id = "0000";
    }
    
    public Student(String newName, String newId)
    {
    name = newName;
    id = newId;
    numberOfStudents++;    
    }
    
    public boolean equals(Student id)
    {
    return (this.getId().equals(id.getId()));    
    }
    
}