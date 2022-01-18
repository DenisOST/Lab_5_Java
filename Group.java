package com.company;
import java.util.Scanner;

public class Group
{
    private String Name = "";
    private Student[] student = new Student[30];
    private int Quantity;

    public Group()
    {
        Name = "";
        for (int i = 0; i < 30; i++)
        {
            student[i] = new Student();
            student[i].SetStudent("", "", "");
        }
    }

    public Group(String name)
    {
        Name = name;
        for (int i = 0; i < 30; i++)
        {
            student[i] = new Student();
            student[i].SetStudent("", "", "");
        }
    }

    public Group(String name, Student[] s, int q)
    {
        Name = name;
        Quantity = 0;
        for (int i = 0; i < 30; i++)
        {
            student[i] = new Student();
            student[i].SetStudent("", "", "");
        }
        for (int i = 0; i < 30 && i < q; i++)
        {
            student[i] = new Student();
            student[i].SetStudent("", "", "");
        }
        for (int i = 0; i < 30 && i < q; i++)
        {
            student[i] = s[i];
            Quantity++;
        }
    }

    public String GetName()
    {
        return Name;
    }

    public Student GetStudent(int Num)
    {
        Student s = new Student();
        if (Num >= 0 && Num < 10)
            s = student[Num];

        return s;
    }

    public int GetQuantity()
    {
        return Quantity;
    }

    public void Set(String name, Student[] s, int q)
    {
        Name = name;
        for (int i = 0; i < 30 && i < q; i++)
        {
            student[i] = s[i];
            Quantity++;
        }
    }
    public void SetGroup(String name)
    {
        Name = name;
    }
    public void SetStudent(Student[] s)
    {
        for (int i = 0; i < 30; i++)
        {
            student[i] = s[i];
            Quantity++;
        }
    }

    public void InputGroup()
    {
        Scanner in = new Scanner(System.in);
        this.SetGroup("");
        System.out.print("Введите название группы: ");
        Name = in.nextLine();
    }

    public boolean AddStudentToGroup(Student Student)
    {
        boolean flag = false;

        for (int i = 0; i < 30 && flag == false; i++)
        {
            if (student[i].GetSurname() == "")
            {
                if (student[i].GetName() == "")
                {
                    if (student[i].GetPatronymic() == "")
                    {
                        student[i] = Student;
                        flag = true;
                        Quantity++;
                    }
                }
            }
        }

        return flag;
    }

    public void OutputGroup()
    {
        System.out.print("Название группы: " + Name + "\n");
        System.out.print("Студенты группы: ");
        int i = 0;
        while (student[i].GetSurname() != "" && student[i].GetSurname() != "" && student[i].GetPatronymic() != "")
        {
            System.out.println(i + 1 + ". " + student[i].GetSurname() + " " + student[i].GetSurname() + " " + student[i].GetPatronymic() + "\n");
            i++;
        }
    }

    public int AverageMarkStudent()
    {
        Scanner in = new Scanner(System.in);
        OutputGroup();
        int Nomer,
                QuantityMark = 0,
                QuantitySum = 0,
                AverageMark = 0;
        System.out.print("Выберите студента для подсчёта среднего балла (введите его номер): ");
        Nomer = in.nextInt();
        if (Nomer > 0 && Nomer <= Quantity)
        {
            for (int i = 0; i < 10 && student[Nomer - 1].GetMark(i).Get() != 0; i++)
            {
                QuantitySum = QuantitySum + student[Nomer - 1].GetMark(i).Get();
                QuantityMark++;
            }
            AverageMark = QuantitySum / QuantityMark;
            System.out.print("Средний балл студента: " + AverageMark + "\n");
        }
        else
            System.out.print("Неправильно введён номер!");

        return AverageMark;
    }
}
