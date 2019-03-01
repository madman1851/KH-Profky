package xmlload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lineOperator {

    String line="";
    List mapaPreReagents = new ArrayList();
    List mapaPreProducts = new ArrayList();

    public void saveToLine(String input){
        line=line+";"+input;
    }

    public void saveLineToList(int i){
        if (i==1){
            //String split[] = line.split(";");
            mapaPreReagents.add(line);
        } else if (i==2){
            //String split[] = line.split(";");
            mapaPreProducts.add(line);
        }
        clearLine();
    }

    public void clearLine(){
        line="";
    }


}
