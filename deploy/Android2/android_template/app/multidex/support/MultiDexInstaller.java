/* Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved. */
package com.company.MAF_Employees;

import android.support.multidex.MultiDex;

public final class MultiDexInstaller
{
  private MultiDexInstaller()
  {
    //
    // Prevent instantiation.
    //
  }
  
  public static void install(MafApplication app)
  { 
    MultiDex.install(app);
  }
}
