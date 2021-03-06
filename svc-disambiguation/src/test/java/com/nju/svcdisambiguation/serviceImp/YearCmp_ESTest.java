/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 29 10:00:39 GMT 2020
 */

package com.nju.svcdisambiguation.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.serviceImp.YearCmp;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.PaperVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class YearCmp_ESTest extends YearCmp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      // Undeclared exception!
      try { 
        yearCmp0.compare((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.YearCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        yearCmp0.compare(object0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.nju.svcdisambiguation.vo.PaperVO
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.YearCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      PaperVO paperVO1 = new PaperVO((-24), "?.gn#PK%", "?.gn#PK%", "?.gn#PK%", "?.gn#PK%", 1, (-24), (ArrayList<AuthorVO>) null, "?.gn#PK%");
      int int0 = yearCmp0.compare(paperVO0, paperVO1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      int int0 = yearCmp0.compare(paperVO0, paperVO0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      PaperVO paperVO1 = new PaperVO((-24), "?.gn#PK%", "?.gn#PK%", "?.gn#PK%", "?.gn#PK%", 1, (-24), (ArrayList<AuthorVO>) null, "?.gn#PK%");
      int int0 = yearCmp0.compare(paperVO1, paperVO0);
      assertEquals((-1), int0);
  }
}
