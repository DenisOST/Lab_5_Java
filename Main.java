package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;

        Teacher[] Teachers = new Teacher[3];

        for (i = 0; i < 3; i++)
        {
            Teachers[i] = new Teacher();
        }

        Teachers[0].Set("Попова", "Ирина", "Андреевна");
        Teachers[1].Set("Иванова", "Елена", "Сергеевна");
        Teachers[2].Set("Буянов", "Виталий", "Юрьевич");

        Discipline[] Disciplines = new Discipline[3];

        for (i = 0; i < 3; i++)
        {
            Disciplines[i] = new Discipline();
        }

        Disciplines[0].Set("Программирование");
        Disciplines[1].Set("Математика");
        Disciplines[2].Set("Экономика");

        for (i = 0; i < 3; i++)
        {
            Disciplines[i].AddTeacherToDiscipline(Teachers[i]);
        }

        Mark[] Marks1 = new Mark[3];
        Mark[] Marks2 = new Mark[3];
        Mark[] Marks3 = new Mark[3];

        for (i = 0; i < 3; i++)
        {
            Marks1[i] = new Mark();
        }
        for (i = 0; i < 3; i++)
        {
            Marks2[i] = new Mark();
        }
        for (i = 0; i < 3; i++)
        {
            Marks3[i] = new Mark();
        }

        Marks1[0].Set(60);
        Marks1[1].Set(80);
        Marks1[2].Set(75);
        Marks2[0].Set(50);
        Marks2[1].Set(40);
        Marks2[2].Set(80);
        Marks3[0].Set(100);
        Marks3[1].Set(30);
        Marks3[2].Set(80);

        Student[] Students = new Student[3];

        for (i = 0; i < 3; i++)
        {
            Students[i] = new Student();
        }

        Students[0].SetStudent("Андреев", "Сергей", "Васильевич");
        Students[1].SetStudent("Авдеев", "Антон", "Александрович");
        Students[2].SetStudent("Сергеев", "Юрий", "Владимирович");

        for (i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                Students[i].AddDisciplineToStudent(Disciplines[j]);
            }
        }

        for (int j = 0; j < 3; j++)
        {
            Students[0].AddMarkToStudent(Disciplines[j], Marks1[j]);
        }

        for (int j = 0; j < 3; j++)
        {
            Students[1].AddMarkToStudent(Disciplines[j], Marks2[j]);
        }

        for (int j = 0; j < 3; j++)
        {
            Students[2].AddMarkToStudent(Disciplines[j], Marks3[j]);
        }

        Group Groups = new Group();
        Groups.SetGroup("ПИ-01");

        for (i = 0; i < 3; i++)
        {
            Groups.AddStudentToGroup(Students[i]);
        }

        
        for (i = 0; i < 3; i++)
        {
            Teachers[i].OutputTeacher();
            System.out.println();
        }

        for (i = 0; i < 3; i++)
        {
            Disciplines[i].OutputDiscipline();
            System.out.println();
        }

        for (i = 0; i < 3; i++)
        {
            Students[i].OutputStudent();
            System.out.println();
        }

        Groups.OutputGroup();
        System.out.println();

        Groups.AverageMarkStudent();
        System.out.println();

        System.out.println("6) Продемонстрировать работу с массивом объектов");
        Marks1[0].Set(50);
        Marks1[1].Set(70);
        Marks1[2].Set(35);
        for (i = 0; i < 3; i++)
        {
            Marks1[i].OutputMark();
        }
        System.out.println();

        System.out.println("7) Продемонстрировать возврат целочисленного значения из метода через вспомогательный класс");
        Mark MarkForTest = new Mark();
        MarkForTest = Students[0].GetMarkByNumber(1);
        MarkForTest.OutputMark();
        System.out.println();

        System.out.println("8) Продемонстрировать разумное использование оператора this");
        Mark A = new Mark();
        Mark B = new Mark();
        Mark C = new Mark();
        Mark D = new Mark();
        A.Set(10);
        B.Set(20);
        C.Set(30);
        D.Set(40);
        // Вызов статической компанентной функции:
        D.Reprint();
        // Включение созданных компанентов в двусвязанный список:
        A.Add(); B.Add(); C.Add(); D.Add();
        // Печать в обратном порядке значений элементов списка:
        D.Reprint();
        System.out.println("\n");

        System.out.println("9) Продемонстрировать обработку строк (String)");
        Teacher TeacherString = new Teacher();
        TeacherString.Set("", "", "");
        TeacherString.ShowingWorkingWithString();
        TeacherString.OutputTeacher();

    }
}
