package com.company;
import java.util.Scanner;

public class Teacher
{
    private String Surname = "";
    private String Name = "";
    private String Patronymic = "";
    public Teacher()
    {
        Surname = "";
        Name = "";
        Patronymic = "";
    }
    public String GetSurname()
    {
        return Surname;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetPatronymic()
    {
        return Patronymic;
    }
    public void Set(String surname, String name, String patronymic)
    {
        Surname = surname;
        Name = name;
        Patronymic = patronymic;
    }
    public void InputTeacher()
    {
        Scanner in = new Scanner(System.in);
        this.Set("", "", "");
        System.out.print("Введите фамилию преподавателя: ");
        Surname = in.nextLine();
        System.out.print("Введите имя преподавателя: ");
        Name = in.nextLine();
        System.out.print("Введите отчество преподавателя: ");
        Patronymic = in.nextLine();
    }
    public void OutputTeacher()
    {
        System.out.print("ФИО преподавателя: " + Surname + " " + Name + " " + Patronymic + "\n");
    }
}
