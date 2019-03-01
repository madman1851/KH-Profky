package xmlload;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import xmlload.loadRecipes;
import xmlload.loadReagents;
import xmlload.lineOperator;

public class outputGenerator {

    List list = new ArrayList();

    public void createSQL(loadReagents gather,loadReagents craft, loadRecipes recepty,lineOperator lO){
        for(int i=0;i<recepty.mapOfRecipes.size();i++){
            String skript ="";//final script

        }


    }

    public void writeOutput() throws IOException {
        File fout = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (String line : list) {
            bw.write("");
            bw.newLine();
        }

        bw.close();
    }

}
