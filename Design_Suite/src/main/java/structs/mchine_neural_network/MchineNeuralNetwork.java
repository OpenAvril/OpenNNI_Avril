package structs.mchine_neural_network;

import engine.Framework_NNI;
import structs.neural_path.Linear;

public class MchineNeuralNetwork
{
    private static Binary[] _stat_REG_list_Of_Boolean_Paths;
    private static Constant[] _stat_REG_list_Of_Constant_Paths;
    private static Linear[] _stat_REG_list_Of_Linear_Paths;
    private static double[] _stat_REG_list_Of_REGISTERED_Inputs;
    private static double[] _stat_REG_list_Of_REGISTERED_Outputs;
    private static boolean _stat_REG_isNewDataReady;
    private static MetaData _stat_STRUCT_MetaData;

    public MchineNeuralNetwork(MetaData structMetaData)
    {
        System.out.printf("entered MchineNeuralNetwork.");
        _stat_STRUCT_MetaData = null;
        _stat_REG_list_Of_Boolean_Paths = new Binary[structMetaData.dyn_REG_Get_NumberOfBooleanInputs()];
        _stat_REG_list_Of_Boolean_Paths[0] = null;
        _stat_REG_list_Of_Constant_Paths = null;
        _stat_REG_list_Of_Linear_Paths = null;

        _stat_REG_list_Of_REGISTERED_Inputs = new double[1];
        _stat_REG_list_Of_REGISTERED_Inputs[0] = Double.MAX_VALUE;
        _stat_REG_list_Of_REGISTERED_Outputs = new double[1];
        _stat_REG_list_Of_REGISTERED_Outputs[0] = Double.MAX_VALUE;
        _stat_REG_isNewDataReady = true;

        _stat_STRUCT_MetaData = new MetaData();
        for(byte index = 0; index < _stat_REG_list_Of_Boolean_Paths.length; index++)
        {
            _stat_REG_list_Of_Boolean_Paths[index] = structBinary;
        }
        for(byte index = 0; index < _stat_REG_list_Of_Constant_Paths.length; index++) {
            _stat_REG_list_Of_Constant_Paths = null;
        }
        for(byte index = 0; index < _stat_REG_list_Of_Linear_Paths.length; index++) {
            _stat_REG_list_Of_Linear_Paths = null;
        }
        for(byte index = 0; index < _stat_REG_list_Of_REGISTERED_Inputs.length; index++) {
            _stat_REG_list_Of_REGISTERED_Inputs = new double[1];
        }
        for(byte index = 0; index < _stat_REG_list_Of_REGISTERED_Inputs.length; index++) {
            _stat_REG_list_Of_REGISTERED_Inputs[0] = Double.MAX_VALUE;
        }
        for(byte index = 0; index < _stat_REG_list_Of_REGISTERED_Outputs.length; index++) {
            _stat_REG_list_Of_REGISTERED_Outputs = new double[1];
        }
        for(byte index = 0; index < _stat_REG_list_Of_REGISTERED_Outputs.length; index++) {
            _stat_REG_list_Of_REGISTERED_Outputs[0] = Double.MAX_VALUE;
        }
        _stat_REG_isNewDataReady = true;
    }
    public void Initialise_MchineNeuralNetwork_Architechure(Framework_NNI obj, MchineNeuralNetwork objNNI, MetaData metaData)
    {
        // io.
        objNNI.Initialise_list_Of_REGISTERED_Inputs(metaData.Get_NumberInputRegisters());
        objNNI.Initialise_list_Of_REGISTERED_Outputs(metaData.Get_NumberOutputRegisters());
        // list of Linear.
        objNNI.Initialise_list_Of_Linear_Paths(objNNI, metaData.Get_NumberOfLinearOutputs());
        for (byte linearOutputID = 0; linearOutputID < metaData.Get_NumberOfLinearOutputs(); linearOutputID++)
        {
            System.out.printf("echo loop.");
            objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Initialise_Tree_Of_Nodes_In_PraiseSet(objNNI, linearOutputID);
            for (Int16 layerID = 4; layerID > -1; layerID--)
            {
                byte hiddenLayerID = Convert.ToByte(layerID);
                System.out.printf("foxtrot loop. outputID = " + linearOutputID + "  hiddenLayerID = " + hiddenLayerID);
                for (byte nodeID = 0; nodeID < metaData.Get_NumberOfNodesInHiddenLayer(hiddenLayerID); nodeID++)
                {
                    System.out.printf("giga loop.");
                    if (hiddenLayerID == (byte)(4))
                    {
                        //ToDo null refference aception. \/ \/ \/
                        objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Initialise_NumberOfInputs(metaData.Get_NumberInputRegisters());
                    }
                    else
                    {
                        objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Initialise_NumberOfInputs(metaData.Get_NumberOfNodesInHiddenLayer((byte)(hiddenLayerID + (byte)1)));
                    }
                    objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Initialise_list_Of_Linear_NeuralPath(objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_NumberOfInputs());
                    for (byte inputID = 0; inputID < objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_NumberOfInputs(); inputID++)
                    {
                        objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_Item_On_list_Of_Linear_NeuralPath(linearOutputID).Initialise_Linear_NeuralPath(obj);
                        System.out.printf("outputID = " + linearOutputID + "  hiddenLayerID = " + hiddenLayerID + "  nodeID = " + nodeID + "  bias = " + objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_Item_On_list_Of_Linear_NeuralPath(inputID).Get_bias() + "  weight = " + objNNI.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_Item_On_list_Of_Linear_NeuralPath(inputID).Get_weight());
                    }
                }
            }
        }
        // list of Boolean.
        objNNI.Initialise_list_Of_Boolean_Paths(objNNI, metaData.Get_NumberOfBooleanOutputs());
        for (byte booleanOutputID = 0; booleanOutputID < metaData.Get_NumberOfBooleanOutputs(); booleanOutputID++)
        {

        }
        objNNI.Initialise_list_Of_Constant_Paths(objNNI, metaData.Get_NumberOfConstantOutputs());
        for (byte constantOutputID = 0; constantOutputID < metaData.Get_NumberOfConstantOutputs(); constantOutputID++)
        {

        }
    }
    public void Initialise_MetaData(MetaData newMetaData)
    {
        Set_MetaData(newMetaData);
    }
    public bool Run_Neural_Network_Inteligence(OpenAvrilNNI.MchineNeuralNetwork objNNI)
    {
        Console.WriteLine("alpha.");
        if (objNNI.Get_IsNewDataReady() == false)
        {
            Console.WriteLine("bravo.");
            for (byte outputID = 0; outputID < objNNI.Get_MetaData().Get_NumberOfLinearOutputs(); outputID++)
            {
                Console.WriteLine("charlie loop.");
                for (Int16 layerID = 4; layerID > -1; layerID--)
                {
                    Console.WriteLine("delta loop.");
                    byte hiddenLayerID = Convert.ToByte(layerID);
                    for (byte nodeID = 0; nodeID < objNNI.Get_MetaData().Get_NumberOfNodesInHiddenLayer(hiddenLayerID); nodeID++)
                    {
                        Console.WriteLine("foxtrot loop.");
                        byte numberOfInputsForNode = new byte();
                        numberOfInputsForNode = 0;
                        if (layerID == (byte)4)
                        {
                            numberOfInputsForNode = objNNI.Get_MetaData().Get_NumberInputRegisters();
                        }
                        else
                        {
                            numberOfInputsForNode = objNNI.Get_MetaData().Get_NumberOfNodesInHiddenLayer((byte)(layerID + (byte)1));
                        }
                        objNNI.Get_Item_On_list_Of_Linear_Paths(outputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Run_All_Neural_Path_Calculations(objNNI, outputID, hiddenLayerID, nodeID, numberOfInputsForNode);
                    }
                }
                objNNI.Set_Item_On_List_Of_REGISTERED_Output(outputID, objNNI.Get_Item_On_list_Of_Linear_Paths(outputID).Get_PraiseSet().Get_Node(0, 0).Get_REGISTERED_Output());
            }
            for (byte outputID = 0; outputID < objNNI.Get_MetaData().Get_NumberOfBooleanOutputs(); outputID++)
            {

                objNNI.Set_Item_On_List_Of_REGISTERED_Output(outputID, 0/*ToDo*/);
            }
            for (byte outputID = 0; outputID < objNNI.Get_MetaData().Get_NumberOfConstantOutputs(); outputID++)
            {

                objNNI.Set_Item_On_List_Of_REGISTERED_Output(outputID, 0/*ToDo*/);
            }
        }
        objNNI.Set_IsNewDataReady(true);
        return objNNI.Get_IsNewDataReady();
    }
    public MetaData dyn_REG_Get_MetaData()
    {
        return stat_REG_Get_MetaData();
    }
    public Binary[] dyn_REG_Get_list_Of_Boolean_Paths()
    {
        return stat_REG_Get_list_Of_Boolean_Paths();
    }
    public Constant[] dyn_REG_Get_list_Of_Constant_Paths()
    {
        return stat_REG_Get_list_Of_Constant_Paths();
    }
    public Linear[] dyn_REG_Get_list_Of_Linear_Paths()
    {
        return stat_REG_Get_list_Of_Linear_Paths();
    }
    public double[] dyn_REG_Get_list_Of_REGISTERED_Inputs()
    {
        return stat_REG_Get_list_Of_REGISTERED_Inputs();
    }
    public double[] dyn_REG_Get_list_Of_REGISTERED_Outputs()
    {
        return stat_REG_Get_list_Of_REGISTERED_Outputs();
    }
    public boolean dyn_REG_Get_IsNewDataReady()
    {
        return stat_REG_Get_IsNewDataReady();
    }
    public void dyn_STRUCT_Set_MetaData(MetaData structMetaData)
    {
        stat_STRUCT_Set_MetaData(structMetaData);
    }
    public void dyn_REG_Set_Item_On_list_Of_Boolean_Paths(byte binaryID, Binary value)
    {
        dyn_REG_Set_Item_On_list_Of_Boolean_Paths(binaryID, value);
    }
    public void dyn_REG_Set_Item_On_list_Of_Constant_Paths(byte constantID, Constant value)
    {
        stat_REG_Set_Item_On_list_Of_Constant_Paths(constantID, value);
    }
    public void dyn_REG_Set_Item_On_list_Of_Linear_Paths(byte praiseTreeID, Linear value)
    {
        stat_REG_Set_Item_On_list_Of_Linear_Paths(praiseTreeID, value);
    }
    public void dyn_REG_Set_Item_On_List_Of_REGISTERED_Input(byte registerID, double value)
    {
        stat_REG_Set_Item_On_List_Of_REGISTERED_Input(registerID, value);
    }
    public void dyn_REG_Set_Item_On_List_Of_REGISTERED_Output(byte registerID, double value)
    {
        stat_REG_Set_Item_On_List_Of_REGISTERED_Output(registerID, value);
    }
    public void dyn_REG_Set_IsNewDataReady(boolean value)
    {
        stat_REG_Set_IsNewDataReady(value);
    }
// private.
    public static MetaData stat_REG_Get_MetaData()
    {
        return _stat_STRUCT_MetaData;
    }
    public static Binary[] stat_REG_Get_list_Of_Boolean_Paths()
    {
        return _stat_REG_list_Of_Boolean_Paths;
    }
    public static Constant[] stat_REG_Get_list_Of_Constant_Paths()
    {
        return _stat_REG_list_Of_Constant_Paths;
    }
    public static Linear[] stat_REG_Get_list_Of_Linear_Paths()
    {
        return _stat_REG_list_Of_Linear_Paths;
    }
    public static double[] stat_REG_Get_list_Of_REGISTERED_Inputs()
    {
        return _stat_REG_list_Of_REGISTERED_Inputs;
    }
    public static double[] stat_REG_Get_list_Of_REGISTERED_Outputs()
    {
        return _stat_REG_list_Of_REGISTERED_Outputs;
    }
    public static boolean stat_REG_Get_IsNewDataReady()
    {
        return _stat_REG_isNewDataReady;
    }
    public void stat_STRUCT_Set_MetaData(MetaData structMetaData)
    {
        _stat_STRUCT_MetaData = structMetaData;
    }
    public void stat_REG_Set_Item_On_list_Of_Boolean_Paths(byte binaryID, Binary value)
    {
        _stat_REG_list_Of_Boolean_Paths[binaryID] = value;
    }
    public void stat_REG_Set_Item_On_list_Of_Constant_Paths(byte constantID, Constant value)
    {
        _stat_REG_list_Of_Constant_Paths[constantID] = value;
    }
    public void stat_REG_Set_Item_On_list_Of_Linear_Paths(byte praiseTreeID, Linear value)
    {
        _stat_REG_list_Of_Linear_Paths[praiseTreeID] = value;
    }
    public void stat_REG_Set_Item_On_List_Of_REGISTERED_Input(byte registerID, double value)
    {
        _stat_REG_list_Of_REGISTERED_Inputs[registerID] = value;
    }
    public void stat_REG_Set_Item_On_List_Of_REGISTERED_Output(byte registerID, double value)
    {
        _stat_REG_list_Of_REGISTERED_Outputs[registerID] = value;
    }
    public void stat_REG_Set_IsNewDataReady(boolean value)
    {
        _stat_REG_isNewDataReady
    }
}
