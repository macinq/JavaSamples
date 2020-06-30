package com.bobrovsky.task24_6;

import java.util.*;

public class Level1 {
  public static int[] WordSearch(int len, String s, String subs) {
    String str = "";
    int count = 0;
    int spaces = 0;
    int lines = 0;

    String[] words = s.trim().split("\\s+");

    for (int i = 0; i < words.length; i++) {
      if (count + words[i].length() + spaces <= len) {
        str = str.concat(words[i]).concat(" ");
        count += words[i].length();
        spaces++;
      } else if (words[i].length() > len) {
        if (len - (count + spaces) < 0) {
          count = 0;
          spaces = 0;
          str = str.concat("\n");
          lines++;
        }
        char[] big = words[i].toCharArray();
        char[] small = new char[len - (count + spaces)];

        while (len < big.length) {
          if (str.charAt(str.length() - 1) == '\n') {
            count = 0;
            spaces = 0;
            small = new char[len];
          }
          for (int j = 0; j < len - (count + spaces); j++) {
            small[j] = big[j];
            big[j] = ' ';
          }
          String temp = new String(big).trim();
          big = temp.toCharArray();
          str = str.concat(new String(small).trim()).concat("\n");
          count = 0;
          spaces = 0;
          if (len >= big.length) {
            str = str.concat(new String(big).trim().concat(" "));
            count = big.length;
            spaces++;
            lines++;
          } else if (len < big.length) {
            count = 0;
            spaces = 0;
            lines++;
          }
        }
      } else {
        count = 0;
        spaces = 0;
        str = str.concat("\n");
        lines++;
        i--;
      }
    }

    String[] strings = new String[lines];
    int[] res = new int[lines];
    if (lines == 0) {
      res = new int[1];
    } else {
      char[] ch = str.trim().toCharArray();
      char[] temp = new char[len + 1]; // поскольку добавляется регулярное выражение \n
      count = 0;

      for (int i = 0; i < strings.length; i++) {
        Arrays.fill(temp, ' ');
        for (int k = 0; count < ch.length; k++) {
          if (ch[count] == '\n' || count == ch.length - 1) {
            if (count == ch.length - 1) {
              temp[k] = ch[ch.length - 1];
            }
            strings[i] = new String(temp).trim();
            count++;
            break;
          } else {
            temp[k] = ch[count];
            count++;
          }
        }
      }
    }

    for (int i = 0; i < strings.length; i++) {
      boolean flag = strings[i].matches(".*\\b" + subs + "\\b.*");

      if (flag) {
        res[i] = 1;
      } else {
        res[i] = 0;
      }
    }

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }

    return res;
  }
}
