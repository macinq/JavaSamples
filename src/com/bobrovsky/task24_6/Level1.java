package com.bobrovsky.task24_6;

import java.util.*;

public class Level1 {
  public static int[] WordSearch(int len, String s, String subs) {
    String str = "";
    int count = 0;
    int spaces = 0;
    int lines = 1; // при подсчёте не учитывается последняя строка, поэтому 1

    String[] words = s.trim().split("\\s+");

    for (int i = 0; i < words.length; i++) {
      if (count + words[i].length() + spaces <= len) {
        str = str.concat(words[i]).concat(" ");
        count += words[i].length();
        spaces++;
      } else {
        count = 0;
        spaces = 0;
        str = str.concat("\n");
        i--;
        lines++;
      }
    }

    String[] strings = new String[lines];
    int[] res = new int[lines];
    char[] ch = str.trim().toCharArray();
    char[] temp = new char[len + 1]; // поскольку добавляется регулярное выражение \n
    count = 0;

    for (int i = 0; i < strings.length; i++) {
      Arrays.fill(temp, ' '); // обнуляем массив, чтобы к коротким строкам не добавилась часть предыдущей длинной
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

    for (int i = 0; i < strings.length; i++) {
      boolean flag = strings[i].matches(".*\\b" + subs + "\\b.*");

      if (flag) {
        res[i] = 1;
      } else {
        res[i] = 0;
      }
    }
    return res;
  }
}
