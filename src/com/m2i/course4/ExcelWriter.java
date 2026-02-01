package com.m2i.course4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class ExcelWriter {
    public static void main(String[] args) {

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Feuille1");


            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Nom");
            row.createCell(1).setCellValue("Âge");


            Row row2 = sheet.createRow(1);
            row2.createCell(0).setCellValue("Alice");
            row2.createCell(1).setCellValue(30);

            try (FileOutputStream fos = new FileOutputStream("public/media/sortie.xlsx")) {
                workbook.write(fos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
