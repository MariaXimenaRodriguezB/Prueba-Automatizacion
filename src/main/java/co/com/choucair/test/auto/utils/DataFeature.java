package co.com.choucair.test.auto.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataFeature {
    static final Logger logger = LoggerFactory.getLogger(DataFeature.class);

    private DataFeature() {
        throw new IllegalStateException("error class: DataBaseToFeature");
    }

    private static List<String> setDataBaseToFeature(File featureFile, File excelFile) throws IOException {
        List<String> fileData = new ArrayList<>();
        try (BufferedReader buffReader = new BufferedReader(
                new InputStreamReader(new BufferedInputStream(new FileInputStream(featureFile)), StandardCharsets.UTF_8))) {
            String data;
            while ((data = buffReader.readLine()) != null) {
                fileData.add(data);
            }
        } catch (Exception e) {
            logger.error("error reading feature file", e);
        }

        try (FileInputStream fis = new FileInputStream(excelFile);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            List<String> excelData = new ArrayList<>();

            // Leer encabezados
            Row headerRow = sheet.getRow(0);
            List<String> columnHeaders = new ArrayList<>();
            for (Cell cell : headerRow) {
                columnHeaders.add(cell.getStringCellValue());
            }
            String concatenatedHeaders = "| " + String.join(" | ", columnHeaders) + " |";
            excelData.add(concatenatedHeaders);

            // Leer datos de las filas
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                List<String> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    rowData.add(cell.toString());
                }
                String concatenatedRow = "| " + String.join(" | ", rowData) + " |";
                excelData.add(concatenatedRow);
            }

            fileData.addAll(excelData);
        } catch (Exception e) {
            logger.error("error reading excel file", e);
        }

        return fileData;
    }

    private static List<File> listOfFeatureFiles(File folder) {
        List<File> featureFiles = new ArrayList<>();
        if (folder.getName().endsWith(".feature")) {
            featureFiles.add(folder);
        } else {
            for (File fileEntry : Objects.requireNonNull(folder.listFiles())) {
                if (fileEntry.isDirectory()) {
                    featureFiles.addAll(listOfFeatureFiles(fileEntry));
                } else {
                    if (fileEntry.isFile() && fileEntry.getName().endsWith(".feature")) {
                    }
                }
            }
        }
        return featureFiles;

    }


            public static void overrideFeatureFilesDB(String featuresDirectoryPath, String excelFilePath)
            throws IOException {
                List<File> listOfFeatureFiles = listOfFeatureFiles(new File(featuresDirectoryPath));
                File excelFile = new File(excelFilePath);
                for (File featureFile : listOfFeatureFiles) {
                    List<String> featureWithDataBase = setDataBaseToFeature(featureFile, excelFile);
                    try (BufferedWriter writer = new BufferedWriter
                            (new OutputStreamWriter(new FileOutputStream(featureFile), StandardCharsets.UTF_8))) {
                        for (String string : featureWithDataBase) {
                            writer.write(string);
                            writer.write("\n");
                        }
                    }
                }
            }
        }