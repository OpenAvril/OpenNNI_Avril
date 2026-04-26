package structs.mchine_neural_network;

public class Constant
{
    private static double _stat_REG_Constant;
// public.
    public Constant()
    {
        System.out.printf("entered Constant.");
        _stat_REG_Constant = Double.MAX_VALUE;
        _stat_REG_Constant = 0.0;
        System.out.printf("exiting Constant.");
    }
    public double dyn_REG_Get_Constant()
    {
        return stat_REG_Get_Constant();
    }
    public void dyn_REG_Set_Constant(double newConstant)
    {
        stat_REG_Set_Constant(newConstant);
    }
// private.
    public static double stat_REG_Get_Constant()
    {
        return _stat_REG_Constant;
    }
    public static void stat_REG_Set_Constant(double newConstant)
    {
        _stat_REG_Constant = newConstant;
    }
}
