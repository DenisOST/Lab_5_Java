package com.company;
import java.util.Scanner;

public class Student
{
    private String Surname = "";
    private String Name = "";
    private String Patronymic = "";
    private Mark[] mark = new Mark[10];
    private Discipline[] discipline = new Discipline[10];

    public Student()
    {
        Surname = "";
        Name = "";
        Patronymic = "";
        for (int i = 0; i < 10; i++)
        {
            mark[i] = new Mark();
            mark[i].Set(0);
        }
        for (int i = 0; i < 10; i++)
        {
            discipline[i] = new Discipline();
            discipline[i].Set("");
        }
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
    public Mark GetMark(int Num)
    {
        Mark m = new Mark();
        if (Num >= 0 && Num < 10)
            m = mark[Num];

        return m;
    }
    public Discipline GetDiscipline(int Num)
    {
        Discipline d = new Discipline();
        if (Num >= 0 && Num < 10)
            d = discipline[Num];

        return d;
    }
    public void SetStudent(String surname, String name, String patronymic)
    {
        Surname = surname;
        Name = name;
        Patronymic = patronymic;

        for (int i = 0; i < 10; i++)
        {
            mark[i].Set(0);
        }

        for (int i = 0; i < 10; i++)
        {
            discipline[i].Set("");
        }
    }
    public void InputStudent()
    {
        Scanner in = new Scanner(System.in);
        this.SetStudent("", "", "");
        System.out.print("Введите фамилию студента: ");
        Surname = in.nextLine();
        System.out.print("Введите имя студента: ");
        Name = in.nextLine();
        System.out.print("Введите отчество студента: ");
        Patronymic = in.nextLine();
    }
    public boolean AddDisciplineToStudent(Discipline Discipline)
    {
        boolean flag = false;

        for (int i = 0; i < 10 && flag == false; i++)
        {
            if (discipline[i].GetDiscipline() == "")
            {
                discipline[i] = Discipline;
                flag = true;
            }
        }

        return flag;
    }
    public boolean AddMarkToStudent(Discipline Discipline, Mark Mark)
    {
        boolean flag = false;

        for (int i = 0; i < 10 && flag == false; i++)
        {
            if (discipline[i].GetDiscipline() == Discipline.GetDiscipline())
            {
                if (discipline[i].GetTeacher().GetSurname() == Discipline.GetTeacher().GetSurname())
                {
                    if (discipline[i].GetTeacher().GetName() == Discipline.GetTeacher().GetName())
                    {
                        if (discipline[i].GetTeacher().GetPatronymic() == Discipline.GetTeacher().GetPatronymic())
                        {
                            mark[i] = Mark;
                            flag = true;
                        }
                    }
                }
            }
        }

        return flag;
    }
    public void OutputStudent()
    {
        System.out.print("ФИО студента: " + Surname + " " + Name + " " + Patronymic + "\n");
        System.out.print("Дисциплины: ");
        int i = 0;
        while (discipline[i].GetDiscipline() != "")
        {
            System.out.print("|" + discipline[i].GetDiscipline() + "| ");
            i++;
        }
        System.out.print("\n");
        System.out.print("Баллы: ");
        i = 0;
        while (mark[i].Get() != 0)
        {
            System.out.print("|" + mark[i].Get() + "| ");
            i++;
        }
        System.out.print("\n");
    }
    public Mark GetMarkByNumber(int i)
    {
        Mark MarkForTransfer = new Mark();
        if (i >= 0 && i < 10)
            MarkForTransfer = mark[i];
        return MarkForTransfer;
    }
}
