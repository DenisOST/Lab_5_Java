package com.company;
import java.util.Scanner;

public class Mark
{
    private int Number = 0;

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
}

