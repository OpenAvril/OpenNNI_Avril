package structs.neural_path;

import engine.Framework_NNI;

public class Linear
{
    private PraiseSet _PraiseSet;

    //todo









    public Linear()
    {
        //System.out.printf("entered Linear.");
        Create_PraiseSet();
        //System.out.printf("exiting Linear.");
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
