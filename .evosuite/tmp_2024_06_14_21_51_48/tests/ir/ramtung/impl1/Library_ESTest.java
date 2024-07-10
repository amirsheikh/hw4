/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 14 17:22:26 GMT 2024
 */

package ir.ramtung.impl1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ir.ramtung.impl1.Library;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addBook("ir.ramtung.impl1.Reference", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Negative or zero copies of a document cannot be added
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Library library0 = new Library();
      library0.timePass(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.extend("CK}4", "(N=yC>");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The document is not in member's loan
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("eAq;w^aaX40eMj3Xi", 1);
      try { 
        library0.borrow("b6@5-Yu$<,", "eAq;w^aaX40eMj3Xi");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot find member to borrow
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine("INug", 2977, 21, 1459);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
      library0.addBook("&[C(8M/UHx'\"}?[C<lA", 10);
      library0.borrow("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
      library0.timePass(1);
      library0.extend("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("&[(8MUHx'\"}[C<lA", "&[(8MUHx'\"}[C<lA");
      library0.addBook("&[(8MUHx'\"}[C<lA", 1704);
      library0.borrow("&[(8MUHx'\"}[C<lA", "&[(8MUHx'\"}[C<lA");
      library0.timePass(1704);
      int int0 = library0.getTotalPenalty("&[(8MUHx'\"}[C<lA");
      assertEquals(8421000, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addStudentMember("", "z`+Nix AX_");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Empty student ID is not allowed
         //
         verifyException("ir.ramtung.impl1.Student", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addMagazine((String) null, (-3004), (-3004), 4022);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Magazine with zero or negative publication year
         //
         verifyException("ir.ramtung.impl1.Magazine", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook((String) null, 5110);
      try { 
        library0.addReference((String) null, 5110);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Document with the same title exists
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("Invalid argument to oan constructor", "Invalid argument to oan constructor");
      try { 
        library0.addProfMember("Invalid argument to oan constructor");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Member with the same name exists
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addReference("&XnLsYi|oN", (-3265));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Negative or zero copies of a document cannot be added
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("eAq;w^aaX40eMj3Xi", 1);
      library0.addStudentMember("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      library0.borrow("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      library0.addStudentMember("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
      library0.addBook("&[C(8M/UHx'\"}?[C<lA", 10);
      library0.borrow("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("Member with the same name exits", "Member with the same name exits");
      library0.addBook("Member with the same name exits", 1704);
      library0.borrow("Member with the same name exits", "Member with the same name exits");
      try { 
        library0.returnDocument("Member with the same name exits", "Document is not available to borrow");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The document is not in member's loan
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("eAq;w^aaX40eMj3Xi", 1);
      library0.addStudentMember("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      library0.borrow("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      try { 
        library0.extend("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The document is not in member's loan
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("&[C(8MUHx'\"}?[C<lA", "&[C(8MUHx'\"}?[C<lA");
      library0.addBook("&[C(8MUHx'\"}?[C<lA", 1704);
      library0.borrow("&[C(8MUHx'\"}?[C<lA", "&[C(8MUHx'\"}?[C<lA");
      int int0 = library0.getTotalPenalty("&[C(8MUHx'\"}?[C<lA");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine((String) null, 1, 1, 1);
      library0.addProfMember((String) null);
      library0.addProfMember("kXuj.+A|;?cjlr:Td");
      library0.borrow((String) null, (String) null);
      int int0 = library0.getTotalPenalty("kXuj.+A|;?cjlr:Td");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.timePass((-924));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot go back in time
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.getTotalPenalty("Invalid argument to loan constructor");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot find member
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("eAq;w^aaX40eMj3Xi", 1);
      library0.addStudentMember("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      library0.borrow("eAq;w^aaX40eMj3Xi", "eAq;w^aaX40eMj3Xi");
      List<String> list0 = library0.availableTitles();
      assertFalse(list0.contains("eAq;w^aaX40eMj3Xi"));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("Member with the same name exits", "Member with the same name exits");
      library0.addBook("Member with the same name exits", 1704);
      library0.borrow("Member with the same name exits", "Member with the same name exits");
      library0.borrow("Member with the same name exits", "Member with the same name exits");
      try { 
        library0.borrow("Member with the same name exits", "Member with the same name exits");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot borrow more documents
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.borrow((String) null, "i~9M#F{5r");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot find document to borrow
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine((String) null, 1, 1, 1);
      library0.addProfMember((String) null);
      library0.borrow((String) null, (String) null);
      try { 
        library0.borrow((String) null, (String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Document is not available to borrow
         //
         verifyException("ir.ramtung.impl1.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
      library0.addBook("&[C(8M/UHx'\"}?[C<lA", 10);
      library0.borrow("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
      library0.returnDocument("&[C(8M/UHx'\"}?[C<lA", "&[C(8M/UHx'\"}?[C<lA");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("eAq;w^aaX40eMj3Xi", 1);
      List<String> list0 = library0.availableTitles();
      assertTrue(list0.contains("eAq;w^aaX40eMj3Xi"));
  }
}
