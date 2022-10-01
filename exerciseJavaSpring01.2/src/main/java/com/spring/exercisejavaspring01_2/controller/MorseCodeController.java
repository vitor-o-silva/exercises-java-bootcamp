package com.spring.exercisejavaspring01_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MorseCodeController {

    private Map<String,String> morseCodes = new HashMap<>();
     public MorseCodeController(){
         morseCodes.put(".-","A");
         morseCodes.put("-...","B");
         morseCodes.put("-.-.","C");
         morseCodes.put("-..","D");
         morseCodes.put(".","E");
         morseCodes.put("..-.","F");
         morseCodes.put("--.","G");
         morseCodes.put("....","H");
         morseCodes.put("..","I");
         morseCodes.put(".---","J");
         morseCodes.put("-.-","K");
         morseCodes.put(".-..","L");
         morseCodes.put("--","M");
         morseCodes.put("-.","N");
         morseCodes.put("---","O");
         morseCodes.put(".--.","P");
         morseCodes.put("--.-","Q");
         morseCodes.put(".-.","R");
         morseCodes.put("...","S");
         morseCodes.put("-","T");
         morseCodes.put("..-","U");
         morseCodes.put("...-","V");
         morseCodes.put(".--","W");
         morseCodes.put("-..-","X");
         morseCodes.put("-.--","Y");
         morseCodes.put("--..","Z");
         morseCodes.put(".----","1");
         morseCodes.put("..---","2");
         morseCodes.put("...--","3");
         morseCodes.put("....-","4");
         morseCodes.put(".....","5");
         morseCodes.put("..--..","?");
         morseCodes.put("-.-.--","!");
         morseCodes.put("-....","6");
         morseCodes.put("--...","7");
         morseCodes.put("---..","8");
         morseCodes.put("----.","9");
         morseCodes.put("-----","0");
         morseCodes.put(".-.-.-",".");
         morseCodes.put("--..--",",");
     }

     @GetMapping("/{code}")
     public String decryptMorseCode(@PathVariable String code){
         final String[] codeDecrypt = {""};
         String[] arrayCode = code.split("   ");
         for (String c: arrayCode) {
             String[] newArrayCode = c.split(" ");
             Arrays.stream(newArrayCode).forEach(cd -> {
                 if (newArrayCode[newArrayCode.length -1] == cd) {
                     codeDecrypt[0] += morseCodes.get(cd) + " ";
                 }else{
                     codeDecrypt[0] += morseCodes.get(cd);
                 }
             });
         }
        return codeDecrypt[0];
    }

}
