/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 31 13:31:55 GMT 2020
 */

package com.nju.svcdisambiguation.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.controller.PaperDetailController;
import com.nju.svcdisambiguation.service.PaperDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class PaperDetailController_ESTest extends PaperDetailController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PaperDetailService paperDetailService0 = mock(PaperDetailService.class, new ViolatedAssumptionAnswer());
      doReturn((ResponseVO) null).when(paperDetailService0).getPaperInfoByPaperId(anyInt() , anyString());
      PaperDetailController paperDetailController0 = new PaperDetailController(paperDetailService0);
      ResponseVO responseVO0 = paperDetailController0.getPaperInfoByPaperId((-1), "");
      assertNull(responseVO0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PaperDetailController paperDetailController0 = new PaperDetailController((PaperDetailService) null);
      // Undeclared exception!
      try { 
        paperDetailController0.getPaperInfoByPaperId((-2728), "http://47.106.211.96:5000/yake/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.controller.PaperDetailController", e);
      }
  }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        PaperDetailService paperDetailService0 = mock(PaperDetailService.class, new ViolatedAssumptionAnswer());
        doReturn((ResponseVO) null).when(paperDetailService0).getPaperRefer(anyInt() , anyString(),anyInt(),anyInt());
        PaperDetailController paperDetailController0 = new PaperDetailController(paperDetailService0);
        ResponseVO responseVO0 = paperDetailController0.getPaperRefer((-1), "",1,1);
        assertNull(responseVO0);
    }
}
