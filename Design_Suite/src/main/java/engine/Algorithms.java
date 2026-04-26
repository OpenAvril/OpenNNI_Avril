package engine;

import structs.mchine_neural_network.MchineNeuralNetwork;
import structs.neural_path.NeuralPath;

public class Algorithms
{
    private static NeuralPath _stat_REG_NeuralPath;
    // public.
    public Algorithms()
    {
        System.out.printf("entered CLASS Algorithms()%n");
        stat_CLASS_boot0_DECLAIRE_Algorithms();
        stat_CLASS_boot1_DEFINE_Algorithms();
        stat_CLASS_boot3_INITIALISE_Algorithms();
        stat_REG_boot0_DECLAIRE_Algorithms();
        System.out.printf("exiting CLASS Algorithms()%n");
    }
    public void dyn_CLASS_Initialise_instance_Of_MchineNeuralNetwork(Framework_NNI obj, MchineNeuralNetwork objNNI, String nameOfNNI, byte praiseID)
    {
        System.out.printf("entering Initialise_instance_Of_MchineNeuralNetwork.");
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_CLASS_Get_NeuralPath().Generate_MetaData_For_MchineNeuralNetwork(obj, objNNI, praiseID);
        objNNI.Get_MetaData().dyn_REG_Set_NameOfNNI(nameOfNNI);
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_CLASS_Get_NeuralPath().Gernerate_Lists_From_MetaData_For_MchineNeuralNetwork(obj, objNNI, objNNI.Get_MetaData());
        SSystem.out.printf("exiting Initialise_instance_Of_MchineNeuralNetwork.");
    }
    public void dyn_CLASS_Save_Instance_Of_instance_Of_MchineNeuralNetwork_To_File(Framework_NNI obj, MchineNeuralNetwork objNNI)
    {
        obj.Get_NeuralNetwork().Get_Execute().Get_FileReadWrite().WriteValuesToFile(obj, objNNI, objNNI.Get_MetaData().Get_NameOfNNI());
    }
    // get.
    public NeuralPath dyn_CLASS_Get_NeuralPath()
    {
        return _stat_REG_NeuralPath;
    }
    public void dyn_REG_boot1_DEFINE_Algorithms(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Algorithms().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Algorithms().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithms(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Algorithms().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Algorithms().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Algorithms(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Algorithms().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Algorithms().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithms(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Algorithms().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Algorithms().%n");
    }
    public static void stat_CLASS_boot0_DECLAIRE_Algorithms()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Algorithms().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Algorithms().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithms()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithms().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithms().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithms()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithms().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithms().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithms()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Algorithms().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Algorithms().%n");
    }
// private.
}