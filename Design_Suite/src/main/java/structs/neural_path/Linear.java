package structs.neural_path;

import engine.Framework_NNI;

public class Linear
{
    private PraiseSet _PraiseSet;
    public Linear()
    {
        //System.Console.WriteLine("entered Linear.");
        Create_PraiseSet();
        //System.Console.WriteLine("exiting Linear.");
    }
    public PraiseSet Get_PraiseSet()
    {
        return _PraiseSet;
    }
    private void Create_PraiseSet()
    {
        Set_PraiseSet(new PraiseSet());
        while (Get_PraiseSet() == null) { }
    }
    private void Set_PraiseSet(PraiseSet newPraiseSet)
    {
        _PraiseSet = newPraiseSet;
    }
}
