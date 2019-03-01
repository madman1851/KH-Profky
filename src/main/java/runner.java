import xmlload.loadReagents;
import xmlload.DBHandler;
import xmlload.outputGenerator;
import xmlload.loadRecipes;


public class runner {
    loadReagents gather;
    loadReagents craft;

    DBHandler db;
    outputGenerator generator;
    loadRecipes loadRecipes;

    public void main(String args[]){
        try {
            gather.version=1;
            gather.data();
            craft.version=2;
            craft.data();




            generator.writeOutput();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
