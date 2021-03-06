/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 31 13:26:59 GMT 2020
 */

package com.nju.svcdisambiguation.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.acm.ACMInstitutionDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEInstitutionDetailMapper;
import com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class InstitutionDetailServiceImp_ESTest extends InstitutionDetailServiceImp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp((IEEEInstitutionDetailMapper) null, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        institutionDetailServiceImp0.getInstitutionFieldStat(1070, "eiJU!mWxHS7kgVj;mj2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, (IEEEAuthorDetailMapper) null, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        institutionDetailServiceImp0.getInstitutionAuthorStat((-3070), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp((IEEEInstitutionDetailMapper) null, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        institutionDetailServiceImp0.getInstitutionAuthorActivation(484, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionAuthorActivation(130, "");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(aCMInstitutionDetailMapper0).selectInstitutionName(anyInt());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionAuthorActivation(576, "ACM");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(aCMInstitutionDetailMapper0).selectInstitutionName(anyInt());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionAuthorStat(576, "ACM");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionAuthorStat(2153, "HmU");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMInstitutionDetailMapper0).selectFieldSummaryPOByInstitutionNAME(anyString());
      doReturn((String) null).when(aCMInstitutionDetailMapper0).selectInstitutionName(anyInt());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionFieldStat((-509), "ACM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectFieldSummaryPOByInstitutionNAME(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionFieldStat(1, "7z5VCh47h(");
      assertTrue(responseVO0.getSuccess());
  }

//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      InstitutionInfoVO institutionInfoVO0 = mock(InstitutionInfoVO.class, new ViolatedAssumptionAnswer());
//      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
//      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
//      doReturn(institutionInfoVO0).when(iEEEInstitutionDetailMapper0).selectInstitutionDetailById(anyInt());
//      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
//      doReturn((ArrayList<String>) null).when(iEEEInstitutionDetailMapper0).selectSameInsByInstitutionId(anyInt());
//      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
//      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
//      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
//      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
//      ResponseVO responseVO0 = institutionDetailServiceImp0.getInstitutionInfo(2153, ">7]");
//      assertNull(responseVO0.getMessage());
//  }

//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
//      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
//      doReturn((InstitutionInfoVO) null).when(aCMInstitutionDetailMapper0).selectInstitutionDetailById(anyInt());
//      doReturn((ArrayList) null).when(aCMInstitutionDetailMapper0).selectSameInsByInstitutionId(anyInt());
//      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
//      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
//      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
//      try { 
//        institutionDetailServiceImp0.getInstitutionInfo(576, "ACM");
//        fail("Expecting exception: NullPointerException");
      
//      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
//      }
//  }
}
