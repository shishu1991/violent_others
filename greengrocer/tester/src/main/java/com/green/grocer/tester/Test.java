package com.green.grocer.tester;

import com.green.grocer.utility.StringFormatter;
import com.green.grocer.commoms.NumberFormatter;

public class Test {

  public static void main(String[] args) {
    StringFormatter sf = new StringFormatter();
    final Integer integer = NumberFormatter.formatNumber(100);
    final String formatString = sf.formatString("    helLO SHIshu ");
    System.out.println(formatString +":"+integer);
  }
}
