package pratice.selenium.assignments.assignment22;//package com.matrix.AlleNikhil.selenium.assignments.assignment22;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Objects;
//
//public class MatchTeam {
//    JSONObject jsonObject;
//    JSONArray jsonArray;
//    @BeforeMethod
//    public void loaction() throws IOException {
//        String path="D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\gayathri\\selenium\\assignments\\Assignment22_Json\\RCBTeamInfo.json";
//        String data = new String(Files.readAllBytes(Paths.get(path)));
//        jsonObject = new JSONObject(data);
//        jsonArray = (JSONArray) jsonObject.get("player");
//    }
//    @Test
//    public void foreignPlayersNumberTeam() {
//
//        int foreignPlayers = 0;
//        for (int i = 0; i < jsonArray.length() - 1; i++) {
//            String str = jsonArray.get(i).toString();
//            JSONObject jsonObject1 = new JSONObject(str);
//
//            String country = jsonObject1.getString("country");
//            if (!Objects.equals(country, "India")) {
//                foreignPlayers++;
//            }
//        }
//        System.out.println("Number of foreign players in the team : " + foreignPlayers);
//        int expectedForeignPlayers = 4;
//        Assert.assertEquals(foreignPlayers, expectedForeignPlayers);
//    }
//
//    @Test
//    public void numberOfWicketKeepersTeam() {
//        int wicketKeeper = 0;
//        for (int i = 0; i < jsonArray.length() - 1; i++) {
//            String str = jsonArray.get(i).toString();
//            JSONObject jsonObject1 = new JSONObject(str);
//
//            String role = jsonObject1.getString("role");
//            if (Objects.equals(role, "Wicket-keeper")) {
//                wicketKeeper++;
//            }
//        }
//        System.out.println("Number of Wicket Keepers in the team : " + wicketKeeper);
//        Assert.assertTrue(wicketKeeper >= 1);
//    }
//}
