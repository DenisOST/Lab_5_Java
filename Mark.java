package com.company;
import java.util.Scanner;

public class Mark
{
    private int Number = 0;
    private static Mark last_mark; // Адрес последнего элемента списка
    private Mark prev; // На предыдущий элемент списка
    private Mark next; // На следующий элемент списка

    public Mark()
    {
        Number = 0;
    }
    public int Get()
    {
        return Number;
    }
    public void Set(int M)
    {
        Number = M;
    }
    public void InputMark()
    {
        Scanner in = new Scanner(System.in);
        this.Set(0);
        System.out.print("Введите балл: ");
        Number = in.nextInt();
    }
    public void OutputMark()
    {
        System.out.print("Балл: " + Number + "\n");
    }

    public static void NewList()

    {
        last_mark = null;
    }

    // Добавление элемента в конец списка
    public void Add()
    {
        if (last_mark == null)
            this.prev = null;
        else
        {
            last_mark.next = this;
            prev = last_mark;
        }
        last_mark = this;
        this.next = null;
    }

    // Вывод на дисплей содержимого списка
    public static void Reprint()
    {
        Mark uk;   // Вспомогательный указатель
        uk = last_mark;
        if (uk == null)
        {
            System.out.println("Список пуст!");
            return;
        }
        else
            System.out.println("\nСодержимое списка:\n");

        // Цикл печати в обратном порядке значений элементов списка:
        while (uk != null)
        {
            System.out.println(uk.Number + "\t");
            uk = uk.prev;
        }
    }
}

