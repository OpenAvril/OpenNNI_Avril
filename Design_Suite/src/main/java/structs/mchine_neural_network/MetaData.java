package structs.mchine_neural_network;

public class MetaData
{
    private String _nameOfNNI;
    private byte _PraiseID;
    private byte _NumberOfBooleanInputs;
    private byte _NumberOfConstantInputs;
    private byte _NumberOfLinearInputs;
    private byte _NumberInputRegisters;
    private byte _NumberOfBooleanOutputs;
    private byte _NumberOfConstantOutputs;
    private byte _NumberOfLinearOutputs;
    private byte _NumberOutputRegisters;
    private byte[] _NumberOfNodesInLayer;

    public MetaData()
    {
        System.out.printf("entered MetaData.");
        _nameOfNNI = new String("nil");
        _NumberOfBooleanInputs = Byte.MAX_VALUE;
        _NumberOfConstantInputs = Byte.MAX_VALUE;
        _NumberOfLinearInputs = Byte.MAX_VALUE;
        _NumberInputRegisters = Byte.MAX_VALUE;
        _NumberOfBooleanOutputs = Byte.MAX_VALUE;
        _NumberOfConstantOutputs = Byte.MAX_VALUE;
        _NumberOfLinearOutputs = Byte.MAX_VALUE;
        _NumberOutputRegisters = Byte.MAX_VALUE;
        _NumberOfNodesInLayer = new byte[5];
        for(byte layerID = 0; layerID < 5; layerID++) {
            _NumberOfNodesInLayer[0] = Byte.MAX_VALUE;
        }
        _NumberOfBooleanInputs = (byte) 0.0;
        _NumberOfConstantInputs = (byte) 0.0;
        _NumberOfLinearInputs = (byte) 0.0;
        _NumberInputRegisters = (byte) 0.0;
        _NumberOfBooleanOutputs = (byte) 0.0;
        _NumberOfConstantOutputs = (byte) 0.0;
        _NumberOfLinearOutputs = (byte) 0.0;
        _NumberOutputRegisters = (byte) 0.0;
        for(byte layerID = 0; layerID < 5; layerID++) {
            _NumberOfNodesInLayer[0] = (byte) 0.0;
        }
        System.out.printf("exiting MetaData.");
    }
    public String dyn_REG_Get_NameOfNNI()
    {
        return stat_REG_Get_NameOfNNI();
    }
    public byte dyn_REG_Get_PraiseID()
    {
        return stat_REG_Get_PraiseID();
    }
    public byte dyn_REG_Get_NumberOfBooleanInputs()
    {
        return stat_REG_Get_NumberOfBooleanInputs();
    }
    public byte dyn_REG_Get_NumberOfBooleanOutputs()
    {
        return stat_REG_Get_NumberOfBooleanOutputs();
    }
    public byte dyn_REG_Get_NumberOfConstantInputs()
    {
        return stat_REG_Get_NumberOfConstantInputs();
    }
    public byte dyn_REG_Get_NumberOfConstantOutputs()
    {
        return stat_REG_Get_NumberOfConstantOutputs();
    }
    public byte dyn_REG_Get_NumberInputRegisters()
    {
        return stat_REG_Get_NumberInputRegisters();
    }
    public byte dyn_REG_Get_NumberOfLinearInputs()
    {
        return stat_REG_Get_NumberOfLinearInputs();
    }
    public byte dyn_REG_Get_NumberOfLinearOutputs()
    {
        return stat_REG_Get_NumberOfLinearOutputs();
    }
    public byte dyn_REG_Get_NumberOfNodesInHiddenLayer(byte hiddenLayerID)
    {
        return stat_REG_Get_NumberOfNodesInHiddenLayer(hiddenLayerID);
    }
    public byte dyn_REG_Get_NumberOutputRegisters()
    {
        return stat_REG_Get_NumberOutputRegisters();
    }
    public void dyn_REG_Set_NameOfNNI(String nameOfNNI)
    {
        stat_REG_Set_NameOfNNI(nameOfNNI);
    }
    public void dyn_REG_Set_PraiseID(byte value)
    {
        stat_REG_Set_PraiseID(value);
    }
    public void dyn_REG_Set_NumberOfBooleanInputs(byte numberOfBinaryValues)
    {
        stat_REG_Set_PraiseID(numberOfBinaryValues);
    }
    public void dyn_REG_Set_NumberOfBooleanOutputs(byte numberOfBinaryValues)
    {
        stat_REG_Set_NumberOfBooleanOutputs(numberOfBinaryValues);
    }
    public void dyn_REG_Set_NumberOfConstantInputs(byte numberOfResetToConstantValues)
    {
        stat_REG_Set_NumberOfConstantInputs(numberOfResetToConstantValues);
    }
    public void dyn_REG_Set_NumberOfConstantOutputs(byte numberOfResetToConstantValues)
    {
        stat_REG_Set_NumberOfConstantOutputs(numberOfResetToConstantValues);
    }
    public void dyn_REG_Set_NumberOfInputRegisters(byte numberOfInputValues)
    {
        stat_REG_Set_NumberOfInputRegisters(numberOfInputValues);
    }
    public void dyn_REG_Set_NumberOfLinearInputs(byte numberOfLinearValues)
    {
        stat_REG_Set_NumberOfLinearInputs(numberOfLinearValues);
    }
    public void dyn_REG_Set_NumberOfLinearOutputs(byte numberOfLinearValues)
    {
        stat_REG_Set_NumberOfLinearOutputs(numberOfLinearValues);
    }
    public void dyn_REG_Set_NumberOfNodesInHiddenLayer(byte layerID, byte numberOfNodes)
    {
        stat_REG_Set_NumberOfNodesInHiddenLayer(layerID, numberOfNodes);
    }
    public void dyn_REG_Set_NumberOfOutputRegisters(byte numberOfInputValues)
    {
        stat_REG_Set_NumberOfOutputRegisters(numberOfInputValues);
    }
// private.
    public String stat_REG_Get_NameOfNNI()
    {
        return _nameOfNNI;
    }
    public byte stat_REG_Get_PraiseID()
    {
        return _PraiseID;
    }
    public byte stat_REG_Get_NumberOfBooleanInputs()
    {
        return _NumberOfBooleanInputs;
    }
    public byte stat_REG_Get_NumberOfBooleanOutputs()
    {
        return _NumberOfBooleanOutputs;
    }
    public byte stat_REG_Get_NumberOfConstantInputs()
    {
        return _NumberOfConstantInputs;
    }
    public byte stat_REG_Get_NumberOfConstantOutputs()
    {
        return _NumberOfConstantOutputs;
    }
    public byte stat_REG_Get_NumberInputRegisters()
    {
        return _NumberInputRegisters;
    }
    public byte stat_REG_Get_NumberOfLinearInputs()
    {
        return _NumberOfLinearInputs;
    }
    public byte stat_REG_Get_NumberOfLinearOutputs()
    {
        return _NumberOfLinearOutputs;
    }
    public byte stat_REG_Get_NumberOfNodesInHiddenLayer(byte hiddenLayerID)
    {
        return _NumberOfNodesInLayer[hiddenLayerID];
    }
    public byte stat_REG_Get_NumberOutputRegisters()
    {
        return _NumberOutputRegisters;
    }
    public void stat_REG_Set_NameOfNNI(String nameOfNNI)
    {
        _nameOfNNI = nameOfNNI;
    }
    public void stat_REG_Set_PraiseID(byte value)
    {
        _PraiseID = value;
    }
    public void stat_REG_Set_NumberOfBooleanInputs(byte numberOfBinaryValues)
    {
        _NumberOfBooleanInputs = numberOfBinaryValues;
    }
    public void stat_REG_Set_NumberOfBooleanOutputs(byte numberOfBinaryValues)
    {
        _NumberOfBooleanOutputs = numberOfBinaryValues;
    }
    public void stat_REG_Set_NumberOfConstantInputs(byte numberOfResetToConstantValues)
    {
        _NumberOfConstantInputs = numberOfResetToConstantValues;
    }
    public void stat_REG_Set_NumberOfConstantOutputs(byte numberOfResetToConstantValues)
    {
        _NumberOfConstantOutputs = numberOfResetToConstantValues;
    }
    public void stat_REG_Set_NumberOfInputRegisters(byte numberOfInputValues)
    {
        _NumberInputRegisters = numberOfInputValues;
    }
    public void stat_REG_Set_NumberOfLinearInputs(byte numberOfLinearValues)
    {
        _NumberOfLinearInputs = numberOfLinearValues;
    }
    public void stat_REG_Set_NumberOfLinearOutputs(byte numberOfLinearValues)
    {
        _NumberOfLinearOutputs = numberOfLinearValues;
    }
    public void stat_REG_Set_NumberOfNodesInHiddenLayer(byte layerID, byte numberOfNodes)
    {
        _NumberOfNodesInLayer[layerID] = numberOfNodes;
    }
    public void stat_REG_Set_NumberOfOutputRegisters(byte numberOfInputValues)
    {
        _NumberOutputRegisters = numberOfInputValues;
    }
}
