package edu.najah.eng.solid.ocp.assignment;

import edu.najah.eng.solid.ocp.assignment.Classes.*;

import java.util.ArrayList;

public class Factory extends Calculator{
    public Factory(){this.numbers = numbers;}
    ArrayList<Integer> numbers = new ArrayList<>();

    public Result getOperation(Operation operation)
    {
        if (operation== operation.Addition)
        {
            return (Result) new Additions();
        }
        if (operation== operation.Count)
        {
            return (Result) new Count();
        }

        if (operation== operation.Max)
        {
            return (Result) new Max();
        }

        if (operation== operation.Min)
        {
            return (Result) new Min();
        }

        if (operation== operation.Multiplication)
        {
            return (Result) new Multiplication();
        }

        if (operation== operation.Multiplication)
        {
            return (Result) new Multiplication();
        }
        return null;
    }
}
