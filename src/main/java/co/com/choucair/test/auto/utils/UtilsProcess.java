package co.com.choucair.test.auto.utils;

import co.com.choucair.test.auto.models.ExecutionData;

import java.util.UUID;

public class UtilsProcess {

    public static void randomGenerate(String middleName , String userName) {
        String uuid = UUID.randomUUID().toString();
        String newMiddleName = middleName + uuid.substring(0, 8);
        String newUserName = userName + uuid.substring(9, 13);
        ExecutionData.setMiddleName(newMiddleName);
        ExecutionData.setUserName(newUserName);
    }

}
