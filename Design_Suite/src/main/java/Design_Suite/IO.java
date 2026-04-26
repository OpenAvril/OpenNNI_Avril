package Design_Suite;
import engine.Framework_NNI;
public class IO
{
    static private Framework_NNI _stat_CALSS_Framework_NNI;
// public.
    public IO()
    {

    }
    static public Framework_NNI dyn_App_Generate_OpenNNI_OpenEpiCentre()
    {
        System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

        System.out.printf("started architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
        stat_CLASS_boot1_DEFINE_framework();
        stat_CLASS_boot3_INITIALISE_framework();
        System.out.printf("done architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        Get_stat_CALSS_Framework_NNI().dyn_CLASS_create_Global_and_Settings();
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_Global().dyn_REG_boot1_DEFINE_Global();
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_Global().dyn_REG_boot2_SUBSTANTIATE_Global();
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_Global().dyn_REG_boot3_INITIALISE_Global();

        System.out.printf("started STRUCTS generate.%n");
        Get_stat_CALSS_Framework_NNI().dyn_STRUCTs_boot();
        System.out.printf("done STRUCTS generate.%n");

        System.out.printf("started ARCHITECTURE generate.%n");
        System.out.printf("started architectured classes - Registers - DEFINE.%n");
        Get_stat_CALSS_Framework_NNI().dyn_REG_boot1_DEFINE_Framework_NNI(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_REG_boot1_DEFINE_App(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot1_DEFINE_Algorithms(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot1_DEFINE_Data();
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot1_DEFINE_Execute(Get_stat_CALSS_Framework_NNI());
        System.out.printf("done architectured classes -Registers - DEFINE.%n");

        System.out.printf("started architectured classes - Registers - SUBSTANTIATE.%n");
        Get_stat_CALSS_Framework_NNI().dyn_REG_boot2_SUBSTANTIATE_Framework_NNI(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_REG_boot2_SUBSTANTIATE_App(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot2_SUBSTANTIATE_Algorithms(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot2_SUBSTANTIATE_Data(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot2_SUBSTANTIATE_Execute(Get_stat_CALSS_Framework_NNI());
        System.out.printf("done architectured classes -Registers - SUBSTANTIATE.%n");

        System.out.printf("started architectured classes - Registers - INITIALISE.%n");
        Get_stat_CALSS_Framework_NNI().dyn_REG_boot3_INITIALISE_Framework_NNI(Get_stat_CALSS_Framework_NNI(), Get_stat_CALSS_Framework_NNI().dyn_STRUCT_get_Input(), Get_stat_CALSS_Framework_NNI().dyn_STRUCT_get_Output());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_REG_boot3_INITIALISE_App(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot3_INITIALISE_Algorithms(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot3_INITIALISE_Data(Get_stat_CALSS_Framework_NNI());
        Get_stat_CALSS_Framework_NNI().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot3_INITIALISE_Execute(Get_stat_CALSS_Framework_NNI());
        System.out.printf("done architectured classes - Registers - INITIALISE.%n");
        System.out.printf("done ARCHITECTURE generate.%n");

        System.out.printf("started PROGRAM - INSTANTIATE.%n");
        Get_stat_CALSS_Framework_NNI().dyn_REG_boot4_INSTANTIATE_Framework_NNI(Get_stat_CALSS_Framework_NNI());
        System.out.printf("done PROGRAM - INSTANTIATE.%n");

        System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");

        return Get_stat_CALSS_Framework_NNI();
    }
    public static Framework_NNI dyn_APP_Get_stat_CALSS_Framework_NNI()
    {
        return Get_stat_CALSS_Framework_NNI();
    }
// private.
    private static void stat_CLASS_boot1_DEFINE_framework()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_framework().%n");
        _stat_CALSS_Framework_NNI = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_framework().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_framework()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_framework().%n");
        _stat_CALSS_Framework_NNI = new Framework_NNI();
        try {
            Get_stat_CALSS_Framework_NNI();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_framework().%n");
    }
    static private Framework_NNI Get_stat_CALSS_Framework_NNI()
    {
        return _stat_CALSS_Framework_NNI;
    }
/*
   static public bool Run_Neural_Network_Inteligence(MchineNeuralNetwork objNNI)
    {
        return objNNI.Run_Neural_Network_Inteligence(objNNI);
    }
    // get.
    static public double[] Get_Output_Values(MchineNeuralNetwork objNNI)
    {
        return objNNI.Get_list_Of_REGISTERED_Outputs();
    }
    // set.
    static public void Set_Input_Values(MchineNeuralNetwork objNNI, double[] inputValues)
    {
        for (byte inputID = 0; inputID < objNNI.Get_MetaData().Get_NumberInputRegisters(); inputID++)
        {
            objNNI.Set_Item_On_List_Of_REGISTERED_Input(inputID, inputValues[inputID]);
        }
    }
    */
}