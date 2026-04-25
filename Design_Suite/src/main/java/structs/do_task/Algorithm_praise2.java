package structs.do_task;

import structs.input.Input_praise2;
import structs.output.Output_praise2;

public class Algorithm_praise2
{
    public Algorithm_praise2()
    {

    }
    public double doWork(Input_praise2 subsetIn, Output_praise2 subsetOut)
    {
        subsetOut.dyn_REG_set_output_praise2_value((subsetIn.dyn_REG_get_input_praise2_valueA() * subsetIn.dyn_REG_get_input_praise2_valueB()));
        return subsetOut.dyn_REG_get_output_praise2_value();
    }
}
