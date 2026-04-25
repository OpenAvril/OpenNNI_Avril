package engine;
import structs.mchine_neural_network.MchineNeuralNetwork;
public class Data
{
    private static MchineNeuralNetwork[] _stat_REG_list_Of_MchineNeuralNetwork;
    private boolean _isFirstSave;
    // public.
    public Data()
    {
        System.out.printf("entered CLASS Data()%n");
        stat_CLASS_boot0_DECLAIRE_Data();
        stat_CLASS_boot1_DEFINE_Data();
        stat_CLASS_boot3_INITIALISE_Data();
        stat_REG_boot0_DECLAIRE_Data();
        System.out.printf("exiting CLASS Data()%n");
    }
    public void dyn_APP_Initialise_DEFAULT_list_Of_MchineNeuralNetwork(MchineNeuralNetwork _DEFAULT_MchineNeuralNetwork)
    {
        stat_APP_Initialise_DEFAULT_list_Of_MchineNeuralNetwork(_DEFAULT_MchineNeuralNetwork);
    }
    public void dyn_APP_Preserve_New_Neural_Network(MchineNeuralNetwork newNeuralNetwork)
    {
        stat_APP_Preserve_New_Neural_Network(newNeuralNetwork);
    }
    public MchineNeuralNetwork dyn_APP_Get_Item_On_list_Of_MchineNeuralNetwork(int praiseId)
    {
        return stat_REG_Get_Item_list_Of_MchineNeuralNetwork()[praiseId];
    }
    public MchineNeuralNetwork[] dyn_App_Get_list_Of_MchineNeuralNetwork_Preservation()
    {
        return stat_App_Get_list_Of_MchineNeuralNetwork_Preservation();
    }
    public void dyn_REG_boot1_DEFINE_Data()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Data().%n");
        stat_REG_boot1_DEFINE_list_Of_MchineNeuralNetwork();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Data().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Data(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Data().%n");
        stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Data().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Data(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Data().%n");
        stat_REG_boot3_INITIALISE_list_Of_MchineNeuralNetwork(null);//todo:
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Data().%n");
    }
    public void stat_CLASS_boot0_DECLAIRE_Data()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Data().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Data().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Data()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Data().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Data().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Data()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Data().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Data().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Data()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Data().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Data().%n");
    }
// private.
    public void stat_APP_Initialise_DEFAULT_list_Of_MchineNeuralNetwork(MchineNeuralNetwork _DEFAULT_MchineNeuralNetwork)
    {
        stat_REG_Set_Item_On_list_Of_MachineAI(0, _DEFAULT_MchineNeuralNetwork);
    }
    public void stat_APP_Preserve_New_Neural_Network(MchineNeuralNetwork newNeuralNetwork)
    {
        MchineNeuralNetwork[] oldList = stat_REG_Get_Item_list_Of_MchineNeuralNetwork();
        _stat_REG_list_Of_MchineNeuralNetwork  = new MchineNeuralNetwork[(int)stat_REG_Get_Item_list_Of_MchineNeuralNetwork().length + 1];
        for (byte index = 0; index < oldList.length; index++)
        {
            _stat_REG_list_Of_MchineNeuralNetwork[index] = oldList[index];
        }
        _stat_REG_list_Of_MchineNeuralNetwork[stat_REG_Get_Item_list_Of_MchineNeuralNetwork().length] = newNeuralNetwork;
    }

    public MchineNeuralNetwork[] stat_App_Get_list_Of_MchineNeuralNetwork_Preservation()
    {
        return _stat_REG_list_Of_MchineNeuralNetwork;
    }
    private static void stat_REG_boot1_DEFINE_list_Of_MchineNeuralNetwork()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_list_Of_MchineNeuralNetwork().%n");
        _stat_REG_list_Of_MchineNeuralNetwork = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_list_Of_MchineNeuralNetwork().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork().%n");
        try {
            _stat_REG_list_Of_MchineNeuralNetwork = new MchineNeuralNetwork[1];
        }
        catch (NullPointerException e)
        {
            System.out.printf("NullPointerException.");
        }
        for(int index = 0; index < _stat_REG_list_Of_MchineNeuralNetwork.length; index++)
        {
            _stat_REG_list_Of_MchineNeuralNetwork[index] = null;
        }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork().%n");
    }
    private static void stat_REG_boot3_INITIALISE_list_Of_MchineNeuralNetwork(MchineNeuralNetwork _DEFAULT_MchineNeuralNetwork)
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork().%n");
        for(int index = 0; index < _stat_REG_list_Of_MchineNeuralNetwork.length; index++)
        {
            _stat_REG_list_Of_MchineNeuralNetwork[index] = _DEFAULT_MchineNeuralNetwork;
        }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_list_Of_MchineNeuralNetwork().%n");
    }
    public static MchineNeuralNetwork[] stat_REG_Get_Item_list_Of_MchineNeuralNetwork()
    {
        return _stat_REG_list_Of_MchineNeuralNetwork;
    }
    private static void stat_REG_Set_Item_On_list_Of_MachineAI(int praiseID, MchineNeuralNetwork newMachineAI)
    {
        _stat_REG_list_Of_MchineNeuralNetwork[praiseID] = newMachineAI;
    }
}