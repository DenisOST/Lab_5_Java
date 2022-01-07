package com.company;
import java.util.Scanner;

public class Discipline
{
    private String Name = "";
    private Teacher teacher = new Teacher();

    public Discipline()
    {
        Name = "";
        teacher.Set("", "", "");
    }
    public String GetDiscipline()
    {
        return Name;
    }
    public Teacher GetTeacher()
    {
        return teacher;
    }
    public void Set(String name)
    {
        Name = name;
        teacher.Set("", "", "");
    }
    public void InputDiscipline(Teacher Teacher)
    {
        Scanner in = new Scanner(System.in);
        this.Set("");
        System.out.print("Введите название дисциплины: ");
        Name = in.nextLine();
        teacher = Teacher;
    }
    public boolean AddTeacherToDiscipline(Teacher Teacher)
    {
        boolean flag = false;

        if (teacher.GetSurname() == "")
        {
            teacher = Teacher;
            flag = true;
        }

        return flag;
    }
    public void OutputDiscipline()
    {
        System.out.print("Название дисциплины: " + Name + "\n");
        teacher.OutputTeacher();
    }
}
