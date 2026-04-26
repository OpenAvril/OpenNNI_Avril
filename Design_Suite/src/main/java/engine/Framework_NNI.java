package engine;
import structs.do_task.Algorithm;
import structs.do_task.User_Algorithm;
import structs.input.Input;
import structs.input.User_Input;
import structs.output.Output;
import structs.output.User_Output;

public class Framework_NNI
{
    private static App _stat_CLASS_App;
    private static Global _stat_CLASS_Global;
    private static Algorithm _stat_STRUCT_Algorithm;
    private static Input _stat_STRUCT_Input;
    private static Output _stat_STRUCT_Output;
    private static User_Algorithm _stat_STRUCT_User_Algorithms;
    private static User_Input _stat_STRUCT_User_Inputs;
    private static User_Output _stat_STRUCT_User_Outputs;
    // public.
    public Framework_NNI()
    {
        System.out.printf("entered CONSTRUCTOR Framework_NNI()%n");
        stat_CLASS_boot0_DECLAIRE_Framework_NNI();
        stat_CLASS_boot1_DEFINE_Framework_NNI();
        stat_CLASS_boot3_INITIALISE_Framework_NNI();
        stat_REG_boot0_DECLAIRE_Framework_NNI();
        System.out.printf("exiting CONSTRUCTOR Framework_NNI()%n");
    }

    public void dyn_CLASS_create_Global_and_Settings()
    {
        boot1_CLASS_DEFINE_Global();
        boot3_CLASS_INITIALISE_Global();
    }
    public App dyn_CLASS_get_App()
    {
        return stat_CLASS_get_App();
    }
    public Global dyn_CLASS_get_Global()
    {
        return stat_CLASS_get_Global();
    }
    public void dyn_REG_boot1_DEFINE_Framework_NNI(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Framework_NNI().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Framework_NNI().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Framework_NNI(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Framework_NNI().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Framework_NNI().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Framework_NNI(Framework_NNI obj, Input structDEFAULT_Input, Output structDEFAULT_Output)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Framework_NNI().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Framework_NNI().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Framework_NNI(Framework_NNI obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework_NNI().%n");
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot4_INSTANTIATE_Execute();
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework_NNI().%n");
    }
    public Algorithm dyn_STRUCT_get_Algorithm()
    {
        return stat_STRUCT_get_Algorithm();
    }
    public Input dyn_STRUCT_get_Input()
    {
        return stat_STRUCT_get_Input();
    }
    public Output dyn_STRUCT_get_Output()
    {
        return stat_STRUCT_get_Output();
    }
    public User_Algorithm dyn_STRUCT_get_User_Algorithm()
    {
        return stat_STRUCT_get_User_Algorithm();
    }
    public User_Input dyn_STRUCT_get_User_Input()
    {
        return stat_STRUCT_get_User_Input();
    }
    public User_Output dyn_STRUCT_get_User_Output()
    {
        return stat_STRUCT_get_User_Output();
    }
    public void dyn_STRUCT_Set_Algorithm(Algorithm struxtAlgorithm)
    {
        stat_STRUCT_Set_Algorithm(struxtAlgorithm);
    }
    public void dyn_STRUCT_Set_Input(Input struct_Input)
    {
        stat_STRUCT_Set_Input(struct_Input);
    }
    public void dyn_STRUCT_Set_Output(Output structUserOutput)
    {
        stat_STRUCT_Set_Output(structUserOutput);
    }
    public void dyn_STRUCT_Set_User_Input(User_Input structUserInput)
    {
        stat_STRUCT_Set_User_Input(structUserInput);
    }
    public void dyn_STRUCT_Set_User_Output(User_Output structUserOutput)
    {
        stat_STRUCT_Set_User_Output(structUserOutput);
    }
    public void dyn_STRUCT_Set_User_Algorithm(User_Algorithm structUserAlgorithm)
    {
        stat_STRUCT_Set_User_Algorithm(structUserAlgorithm);
    }
    public void dyn_STRUCTs_boot()
    {
        _stat_STRUCT_Algorithm = new Algorithm();
        _stat_STRUCT_Input = new Input();
        _stat_STRUCT_Output = new Output();
        _stat_STRUCT_User_Algorithms = new User_Algorithm();
        _stat_STRUCT_User_Inputs = new User_Input();
        _stat_STRUCT_User_Outputs = new User_Output();
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Framework_NNI()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework_NNI().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework_NNI().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_App().%n");
        _stat_CLASS_App = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework_NNI()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework_NNI().%n");
        stat_CLASS_boot1_DEFINE_App();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework_NNI().%n");
    }
    private static void boot1_CLASS_DEFINE_Global()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Global().%n");
        _stat_CLASS_Global = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Global().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_App().%n");
        _stat_CLASS_App = new App();
        try {
            stat_CLASS_get_App();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework_NNI()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_NNI().%n");
        stat_CLASS_boot3_INITIALISE_App();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_NNI().%n");
    }
    private static void boot3_CLASS_INITIALISE_Global()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Global().%n");
        _stat_CLASS_Global = new Global();
        try {
            stat_CLASS_get_Global();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Global().%n");
    }
    private static App stat_CLASS_get_App()
    {
        return _stat_CLASS_App;
    }
    private static void stat_REG_boot0_DECLAIRE_Framework_NNI()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Framework_NNI().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Framework_NNI().%n");
    }
    private static void stat_STRUCT_boot1_DEFINE_Algorithm()
    {
        _stat_STRUCT_Algorithm = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Input()
    {
        _stat_STRUCT_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Output()
    {
        _stat_STRUCT_Output = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Algorithm()
    {
        _stat_STRUCT_User_Algorithms = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Input()
    {
        _stat_STRUCT_User_Inputs = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Output()
    {
        _stat_STRUCT_User_Outputs = null;
    }
    private static void stat_STRUCT_boot3_INITIALISE_Algorithm()
    {
        _stat_STRUCT_Algorithm = new Algorithm();
        try {
            stat_STRUCT_get_Algorithm();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Input()
    {
        _stat_STRUCT_Input = new Input();
        try {
            stat_STRUCT_get_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Output()
    {
        _stat_STRUCT_Output = new Output();
        try {
            stat_STRUCT_get_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Algorithm()
    {
        _stat_STRUCT_User_Algorithms = new User_Algorithm();
        try {
            stat_STRUCT_get_User_Algorithm();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Input()
    {
        _stat_STRUCT_User_Inputs = new User_Input();
        try {
            stat_STRUCT_get_User_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Output()
    {
        _stat_STRUCT_User_Outputs = new User_Output();
        try {
            stat_STRUCT_get_User_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static Algorithm stat_STRUCT_get_Algorithm()
    {
        return _stat_STRUCT_Algorithm;
    }
    private static Input stat_STRUCT_get_Input()
    {
        return _stat_STRUCT_Input;
    }
    private static Output stat_STRUCT_get_Output()
    {
        return _stat_STRUCT_Output;
    }
    private static User_Input stat_STRUCT_get_User_Input()
    {
        return _stat_STRUCT_User_Inputs;
    }
    private static User_Output stat_STRUCT_get_User_Output()
    {
        return _stat_STRUCT_User_Outputs;
    }
    private static User_Algorithm stat_STRUCT_get_User_Algorithm()
    {
        return _stat_STRUCT_User_Algorithms;
    }
    private static Global stat_CLASS_get_Global()
    {
        return _stat_CLASS_Global;
    }
    private static void stat_STRUCT_Set_Algorithm(Algorithm struxtAlgorithm)
    {
        _stat_STRUCT_Algorithm = struxtAlgorithm;
    }
    private static void stat_STRUCT_Set_Input(Input struxtAlgorithm)
    {
        _stat_STRUCT_Input = struxtAlgorithm;
    }
    private static void stat_STRUCT_Set_Output(Output stuctOutput)
    {
        _stat_STRUCT_Output = stuctOutput;
    }
    private static void stat_STRUCT_Set_User_Input(User_Input structUserInput)
    {
        _stat_STRUCT_User_Inputs = structUserInput;
    }
    private static void stat_STRUCT_Set_User_Output(User_Output structUserOutput)
    {
        _stat_STRUCT_User_Outputs = structUserOutput;
    }
    private static void stat_STRUCT_Set_User_Algorithm(User_Algorithm structUserAlgorithm)
    {
        _stat_STRUCT_User_Algorithms = structUserAlgorithm;
    }

}