package structs.do_task;
import engine.Framework_NNI;

public class Algorithm
{

    private static Object _stat_REG_AlgorithmSubset;
// public.
    public Algorithm()
    {
        System.out.printf("entered STRUCT_CLASS Algorithm()%n");
        stat_CLASS_boot0_DECLAIRE_Algorithm();
        stat_CLASS_boot1_DEFINE_Algorithm();
        stat_CLASS_boot3_INITIALISE_Algorithm();
        stat_REG_boot0_DECLAIRE_Algorithm();
        System.out.printf("exiting STRUCT_CLASS Algorithm()%n");
    }
    public void dyn_REG_boot1_DEFINE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Algorithm().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Algorithm().%n");
        stat_REG_boot2_SUBSTANTIATE_AlgorithmSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Algorithm().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Algorithm(User_Algorithm objUserAlgorithm)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Algorithm().%n");
        stat_REG_boot3_INITIALISE_AlgorithmSubset(objUserAlgorithm);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Algorithm().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Algorithm().%n");
    }
    public Object dyn_REG_get_AlgorithmSubset()
    {
        return stat_REG_get_AlgorithmSubset();
    }
    public void dyn_REG_set_AlgorithmSubset(Algorithm_praise0 objAlgorithmPraise0)
    {
        stat_REG_set_AlgorithmSubset((Object)objAlgorithmPraise0);
    }
    public void dyn_REG_set_AlgorithmSubset(Algorithm_praise1 objAlgorithmPraise1)
    {
        stat_REG_set_AlgorithmSubset((Object)objAlgorithmPraise1);
    }
    public void dyn_REG_set_AlgorithmSubset(Algorithm_praise2 objAlgorithmPraise2)
    {
        stat_REG_set_AlgorithmSubset((Object)objAlgorithmPraise2);
    }
    public void dyn_REG_set_AlgorithmSubset(Algorithm_praise3 objAlgorithmPraise3)
    {
        stat_REG_set_AlgorithmSubset((Object)objAlgorithmPraise3);
    }
    public void dyn_REG_set_AlgorithmSubset(Framework_NNI obj, int praiseId)
    {
        User_Algorithm userAlgorithm = obj.dyn_STRUCT_get_User_Algorithm();
        switch(praiseId)
        {
            case 0:
                stat_REG_set_AlgorithmSubset((Algorithm_praise0)userAlgorithm.dyn_REG_get_Item_On_List_Of_AlgorithmSubsets(praiseId));
                break;

            case 1:
                stat_REG_set_AlgorithmSubset((Algorithm_praise1)userAlgorithm.dyn_REG_get_Item_On_List_Of_AlgorithmSubsets(praiseId));
                break;

            case 2:
                stat_REG_set_AlgorithmSubset((Algorithm_praise2)userAlgorithm.dyn_REG_get_Item_On_List_Of_AlgorithmSubsets(praiseId));
                break;

            case 3:
                stat_REG_set_AlgorithmSubset((Algorithm_praise3)userAlgorithm.dyn_REG_get_Item_On_List_Of_AlgorithmSubsets(praiseId));
                break;

        }
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Algorithm().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Algorithm().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithm().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithm().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithm().%n");
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithm().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithm()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Algorithm().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Algorithm().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_AlgorithmSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_AlgorithmSubset().%n");
        _stat_REG_AlgorithmSubset = new Object();
        while(stat_REG_get_AlgorithmSubset() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_AlgorithmSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_AlgorithmSubset(User_Algorithm objUserAlgorithm)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_AlgorithmSubset().%n");
        _stat_REG_AlgorithmSubset = objUserAlgorithm.dyn_REG_get_Item_On_List_Of_AlgorithmSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_AlgorithmSubset().%n");
    }
    private static Object stat_REG_get_AlgorithmSubset()
    {
        return _stat_REG_AlgorithmSubset;
    }
    private static void stat_REG_set_AlgorithmSubset(Object objSubset)
    {
        _stat_REG_AlgorithmSubset = objSubset;
    }
}