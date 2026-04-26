package structs.mchine_neural_network;
import structs.neural_path.PraiseSet;
public class Binary
{
    private static PraiseSet _stat_REG_PraiseSet;
// public.
    public Binary()
    {

    }
    public void dyn_REG_Get_PraiseSet()
    {
        stat_REG_Get_PraiseSet();
    }
    public void dyn_REG_Get_PraiseSet(PraiseSet newPraiseSet)
    {
        stat_REG_Get_PraiseSet(newPraiseSet);
    }
// private.
    public static PraiseSet stat_REG_Get_PraiseSet()
    {
        return _stat_REG_PraiseSet;
    }
    public static void stat_REG_Get_PraiseSet(PraiseSet newPraiseSet)
    {
        _stat_REG_PraiseSet = newPraiseSet;
    }
}
