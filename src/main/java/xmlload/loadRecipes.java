package xmlload;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class loadRecipes {
    //ID,GatherItemName1-6,Odmeny1-6
    List mapOfRecipes = new ArrayList();
    String line = "";
    String file = "";

    public void CreateRecipes() throws Throwable{
        Workbook workbook = WorkbookFactory.create(new File(file));
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();

        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                String split[] = line.split(";");
                mapOfRecipes.add(line);
            });

            line="";
            System.out.println();
        });

    }

}
