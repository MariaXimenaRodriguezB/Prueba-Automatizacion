package co.com.choucair.test.auto.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetData {

    public List<DataForRegister> setDataRegister(DataTable dataTable) {
        List<DataForRegister> data = new ArrayList<>();
        List<Map<String,String>> mapInfo = dataTable.asMaps();
        for (Map<String,String> map : mapInfo) {
            data.add(new ObjectMapper().convertValue(map, DataForRegister.class));
        }
            return data;
    }

}
