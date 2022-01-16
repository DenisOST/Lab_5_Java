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

    public Teacher(String surname)
    {
        Surname = surname;
        Name = "";
        Patronymic = "";
    }
    public Teacher(String surname, String name, String patronymic)
    {
        Surname = surname;
        Name = name;
        Patronymic = patronymic;
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

    public void SetSurname(String surname)
    {
        Surname = surname;
    }

    public void SetName(String name)
    {
        Name = name;
    }

    public void SetPatronymic(String patronymic)
    {
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

    public void ShowingWorkingWithString()
    {
        Surname = Surname + "Демонстрация";
        Name = Name + "работы со";
        Patronymic = Patronymic + "строками :)";
    }
}
