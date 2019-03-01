package xmlload;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import xmlload.lineOperator;

import java.io.File;
import java.io.IOException;

public class loadReagents  {
    public void setFile(String file) {
        this.file = file;
    }

    public int version;

    public String file = "";
    lineOperator _lineOperator;
    public boolean data() throws IOException,InvalidFormatException
    {

        Workbook workbook = WorkbookFactory.create(new File(file));
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();

        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                _lineOperator.saveToLine(cellValue);
                _lineOperator.saveLineToList(version);
            });

            _lineOperator.clearLine();
            System.out.println();
        });

        return true;
    }
}
