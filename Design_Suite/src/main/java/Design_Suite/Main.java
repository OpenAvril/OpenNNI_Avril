package Design_Suite;
public class Main
{
    static void main() 
    {
        System.out.printf("started program entry.");
        var obj = IO.dyn_App_Generate_OpenNNI_OpenEpiCentre();

/*
        // SIMULATION - output testbench.
        var objNNI_DEFAULT = IO.dyn_APP_Get_stat_CALSS_Framework_NNI()..Get_Data().Get_Item_On_list_Of_MchineNeuralNetwork(0);

        System.out.printf("started SIMULATION - output default data file.");
        for (byte linearOutputID = 0; linearOutputID < objNNI_DEFAULT.Get_MetaData().Get_NumberOfLinearOutputs(); linearOutputID++)
        {
            for (Int16 layerID = 4; layerID > -1; layerID--)
            {
                byte hiddenLayerID = Convert.ToByte(layerID);
                for (byte nodeID = 0; nodeID < objNNI_DEFAULT.Get_MetaData().Get_NumberOfNodesInHiddenLayer(hiddenLayerID); nodeID++)
                {
                    for (byte inputID = 0; inputID < objNNI_DEFAULT.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_NumberOfInputs(); inputID++)
                    {
                        System.out.printf("outputID = " + linearOutputID + "  hiddenLayerID = " + hiddenLayerID + "  nodeID = " + nodeID + "  inputID = " + inputID + "  bias = " + objNNI_DEFAULT.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_Item_On_list_Of_Linear_NeuralPath(linearOutputID).Get_bias() + "  weight = " + objNNI_DEFAULT.Get_Item_On_list_Of_Linear_Paths(linearOutputID).Get_PraiseSet().Get_Node(hiddenLayerID, nodeID).Get_Item_On_list_Of_Linear_NeuralPath(linearOutputID).Get_weight());
                    }
                }
            }
        }
        for (byte booleanOutputID = 0; booleanOutputID < objNNI_DEFAULT.Get_MetaData().Get_NumberOfBooleanOutputs(); booleanOutputID++)
        {
            //ToDo: boolean preperation.
        }
        for (byte constantOutputID = 0; constantOutputID < objNNI_DEFAULT.Get_MetaData().Get_NumberOfConstantOutputs(); constantOutputID++)
        {
            //ToDo: constant preperation.
        }
        */
        System.out.printf("ending SIMULATION - output default data file.");
    }
}
