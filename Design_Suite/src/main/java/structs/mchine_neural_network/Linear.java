package structs.mchine_neural_network;

import structs.neural_path.PraiseSet;

public class Linear
{
    private PraiseSet _stat_REG_PraiseSet;

    public Linear()
    {
        System.out.printf("entered Linear.");

        System.out.printf("exiting Linear.");
    }

    public PraiseSet _stat_REG_Get_PraiseSet()
    {
        return _stat_REG_PraiseSet;
    }
    private void _stat_REG_Set_PraiseSet(PraiseSet newPraiseSet)
    {
        _stat_REG_PraiseSet = newPraiseSet;
    }
}
