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

        Disciplines[0].SetName("Программирование");
        Disciplines[1].SetName("Математика");
        Disciplines[2].SetName("Экономика");

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

        System.out.println("Лабораторная работа №9:");
        System.out.println("2) Продемонстрировать вызов всех конструкторов");

        Teacher Teacher1 = new Teacher();
        Teacher Teacher2 = new Teacher("Сталин");
        Teacher Teacher3 = new Teacher("Жмышенко", "Василий", "Витальевич");

        Teacher1.OutputTeacher();
        System.out.println();
        Teacher2.OutputTeacher();
        System.out.println();
        Teacher3.OutputTeacher();
        System.out.println("\n\n");

        Discipline Discipline1 = new Discipline();
        Discipline Discipline2 = new Discipline("Бориков");
        Discipline Discipline3 = new Discipline("Химия", Teacher3);

        Discipline1.OutputDiscipline();
        System.out.println();
        Discipline2.OutputDiscipline();
        System.out.println();
        Discipline3.OutputDiscipline();
        System.out.println("\n\n");

        Mark Mark1 = new Mark();
        Mark Mark2 = new Mark(65);

        Mark1.OutputMark();
        System.out.println();
        Mark2.OutputMark();
        System.out.println("\n\n");

        Student Student1 = new Student();
        Student Student2 = new Student("Лупин");
        Student Student3 = new Student("Пупин", "Андрей", "Васильевич", Marks2, 3, Disciplines, 3);

        Student1.OutputStudent();
        System.out.println();
        Student2.OutputStudent();
        System.out.println();
        Student3.OutputStudent();
        System.out.println("\n\n");

        Group Group1 = new Group();
        Group Group2 = new Group("ПИ-02");
        Group Group3 = new Group("ПИ-03", Students, 3);

        Group1.OutputGroup();
        System.out.println();
        Group2.OutputGroup();
        System.out.println();
        Group3.OutputGroup();
        System.out.println("\n\n");

        System.out.println("3) Инициализировать небольшой массив конструктором с одним параметром");
        Teacher[] teacherArr = new Teacher[3];
        for (int j = 0; j < 3; j++)
            teacherArr[j] = new Teacher("Иванов" + (j + 1));
        for (int j = 0; j < 3; j++)
            teacherArr[j].OutputTeacher();
        System.out.println("\n\n");
        /*
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

        System.out.println("Модифицировать ваши проекты на С++, C# и Java путем добавления в один из классов как минимум одного статического поля и одного статического метода.");
        Mark A = new Mark();
        Mark B = new Mark();
        Mark C = new Mark();
        Mark D = new Mark();
        A.Set(10);
        B.Set(20);
        C.Set(30);
        D.Set(40);
        Mark.NewList();
        // Вызов статической компанентной функции:
        Mark.Reprint();
        // Включение созданных компанентов в двусвязанный список:
        A.Add(); B.Add(); C.Add(); D.Add();
        // Печать в обратном порядке значений элементов списка:
        Mark.Reprint();
        System.out.println("\n");
         */
    }
}
