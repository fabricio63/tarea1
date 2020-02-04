package com.cinco.cinco;

import org.springframework.util.StringUtils;

public class Metodos {



    public static String counter2 (String data){
        data = data.toLowerCase();
        String result = "";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String max_v  = "";

        for (int w = 0 ; w < 10;w++) {
            if (data.length() != 0){
            int count = 0;
            int max_c = 0;
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < data.length(); j++) {
                    if (data.charAt(j) == abc.charAt(i)) {
                        count = StringUtils.countOccurrencesOf(data, String.valueOf(data.charAt(j)));
                        if (count > max_c) {
                            max_c = count;
                            max_v = String.valueOf(data.charAt(j));
                        }

                    }

                }
            }


            data = data.replaceAll(max_v, "");
            data = data.trim();
            result = result + "\n" + "* " + max_v + " = " + max_c + "  ";
            if (max_c < 10){
                result = result + " ";
            }
            for (int r = 0; r < max_c;r++){
                result = result + "*";
            }
        }
        }





        return result;
    }




}
