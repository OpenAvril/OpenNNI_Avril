package engine;

public class Global
{
    public enum NodeLayer
    {
        Layer_4,
        Layer_3,
        Layer_2,
        Layer_1,
        Layer_0
    }
    public enum PraiseID
    {
        Praise_0,
        Praise_1,
        Praise_2,
        Praise_3
    }
    public enum PRAISE_0_I {
        Value_A,
        Value_B
    }
    public enum PRAISE_0_O
    {
        Value_Out
    }
    public enum PRAISE_1_I {
        Value_A,
        Value_B

    }
    enum PRAISE_1_O {
        Value_Out
    }
    public enum PRAISE_2_I {
        Value_A,
        Value_B
    }
    public enum PRAISE_2_O {
        Value_Out
    }
    private static int _stat_REG_numberOfPraises;
// public.
    public Global()
    {
        System.out.printf("entering Global()%n");
        stat_CLASS_boot0_DECLAIRE_Global();
        stat_CLASS_boot1_DEFINE_Global();
        stat_CLASS_boot3_INITIALISE_Global();
        stat_REG_boot0_DECLAIRE_Global();
        System.out.printf("exiting Global()%n");
    }
    public void dyn_REG_boot1_DEFINE_Global()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Global().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Global().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Global().%n");
        stat_REG_boot2_SUBSTANTIATE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Global().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Global()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Global().%n");
        stat_REG_boot3_INITIALISE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Global().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Global().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Global().%n");
    }
    public static int dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static void stat_CLASS_boot0_DECLAIRE_Global()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Global().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Global().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Global()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Global().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Global().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Global()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Global().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Global().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Global()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Global().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Global().%n");
    }
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = Integer.MAX_VALUE;
    }

    private static void stat_REG_boot3_INITIALISE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = 4;
    }
    private static int stat_REG_get_numberOfPraises()
    {
        return _stat_REG_numberOfPraises;
    }
}