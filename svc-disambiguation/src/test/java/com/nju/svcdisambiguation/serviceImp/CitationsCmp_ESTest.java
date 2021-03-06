/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 29 10:03:37 GMT 2020
 */

package com.nju.svcdisambiguation.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.serviceImp.CitationsCmp;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.PaperVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class CitationsCmp_ESTest extends CitationsCmp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CitationsCmp citationsCmp0 = new CitationsCmp();
      // Undeclared exception!
      try { 
        citationsCmp0.compare((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.CitationsCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CitationsCmp citationsCmp0 = new CitationsCmp();
      // Undeclared exception!
      try { 
        citationsCmp0.compare("`T`6D[i;$y", "`T`6D[i;$y");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.nju.svcdisambiguation.vo.PaperVO
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.CitationsCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CitationsCmp citationsCmp0 = new CitationsCmp();
      PaperVO paperVO0 = new PaperVO();
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO1 = new PaperVO(1, "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", 1, 1, arrayList0, "com.nju.svcdisambiguation.serviceImp.CitationsCmp");
      int int0 = citationsCmp0.compare(paperVO1, paperVO0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CitationsCmp citationsCmp0 = new CitationsCmp();
      PaperVO paperVO0 = new PaperVO();
      int int0 = citationsCmp0.compare(paperVO0, paperVO0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CitationsCmp citationsCmp0 = new CitationsCmp();
      PaperVO paperVO0 = new PaperVO();
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO1 = new PaperVO((-2763), "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", "com.nju.svcdisambiguation.serviceImp.CitationsCmp", (-2763), (-2763), arrayList0, "com.nju.svcdisambiguation.serviceImp.CitationsCmp");
      int int0 = citationsCmp0.compare(paperVO1, paperVO0);
      assertEquals(1, int0);
  }
}
