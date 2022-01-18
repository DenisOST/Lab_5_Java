package com.company;

import java.util.Scanner;

interface Human
{
    void InputFIO();

    void OutputInformation();

    String WhoIs();
}


public abstract class Person implements Human {
    protected String Surname;
    protected String Name;
    protected String Patronymic;

    public Person()
    {
        Surname = "";
        Name = "";
        Patronymic = "";
    }

    public Person(String surname)
    {
        Surname = surname;
        Name = "";
        Patronymic = "";
    }

    public Person(String surname, String name, String patronymic)
    {
        Surname = surname;
        Name = name;
        Patronymic = patronymic;
    }

    public String GetSurname()
    {
        return this.Surname;
    }

    public String GetName()
    {
        return this.Name;
    }

    public String GetPatronymic()
    {
        return this.Patronymic;
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

    public void Set(String surname, String name, String patronymic)

    {
        this.Surname = surname;
        this.Name = name;
        this.Patronymic = patronymic;
    }

    public void InputFIO()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        Surname = in.nextLine();
        System.out.println("Введите имя: ");
        Name = in.nextLine();
        System.out.println("Введите отчество: ");
        Patronymic = in.nextLine();
        in.close();
    }

    public void OutputInformation()
    {
        System.out.println("ФИО: " + Surname + " " + Name + " " + Patronymic);
    }

    public void AdditionSapces()
    {
        Surname = Surname + " ";
        Name = Name + " ";
        Patronymic = Patronymic + " ";
    }

    public String WhoIs()
    {
        return "Кто-то";
    }

    public void SayHello()
    {
        System.out.println(WhoIs() + " говорит привет!");
    }

    public Person ShallowCopy()
    {
        return (Person)this;
    }

    public Person(Person other)
    {
        Surname = other.Surname;
        Name = other.Name;
        Patronymic = other.Patronymic;
    }

    public String ToString()
    {
        return (Surname + " " + Name + " " + Patronymic);
    }
}
