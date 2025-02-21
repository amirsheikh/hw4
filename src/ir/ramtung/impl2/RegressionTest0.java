package ir.ramtung.impl2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of Cannot find member");

        } catch (Exception ignored) {}
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of reference has already added");

        } catch (Exception ignored) {}
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of Cannot find member");

        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of the document is not in member's loan");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", (int) 'a');
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        try {
            library0.borrow("hi!", "");
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        try {
            library0.returnDocument("hi!", "");
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.returnDocument("", "hi!");
            org.junit.Assert.fail("Expected exception of empty memberName");
        } catch (Exception ignored) {}
        java.lang.Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        int int8 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of empty memberName");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        try {
            int8 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of member not Found");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of empty member and doc not found");
        } catch (Exception ignored) {}
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the " +
                    "magazine empty title");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        int int8 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of empty memberName");
        } catch (Exception ignored) {}
        library0.addBook("", 100);
        try {
            int8 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of empty member name and document not found");
        } catch (Exception ignored) {}
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of empty name");
        } catch (Exception ignored) {}
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        int int8 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of member not found");

        } catch (Exception ignored) {}
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {
        }
        try {
            int8 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        try {
            library0.extend("hi!", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not loaned");
        } catch (Exception ignored) {}
        library0.timePass(10);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addProfMember("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", (int) 'a');
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        library0.addReference("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        try {
            library0.returnDocument("", "");
            org.junit.Assert.fail("Expected exception of empty member name and empty title");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of empty prof name");
        } catch (Exception ignored) {}
        java.util.List<java.lang.String> strList9 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        int int8 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of empty title");

        } catch (Exception ignored) {}
        try {
            int8 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student name is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        library0.addReference("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", (int) 'a');
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        java.lang.Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        int int8 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        try {
            int8 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of member not found");
        } catch (Exception ignored) {}
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        try {
            library0.extend("hi!", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        try {
            library0.extend("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        int int11 = library0.getTotalPenalty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: student id is empty");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of member not found and doc not found and doc not loaned");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        try {
            library0.addBook("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of empty title");
        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addReference("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.addReference("hi!", 10);
        java.util.List<java.lang.String> strList8 = library0.availableTitles();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = 0;
        try {
            int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of member not found");

        } catch (Exception ignored) {}
        library0.addProfMember("hi!");
        library0.addBook("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of member not found and doc not found");
        } catch (Exception ignored) {}
        library0.timePass(100);
        try {
            library0.addReference("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of empty title and negative number");

        } catch (Exception ignored) {}
        org.junit.Assert.assertNotNull(strList1);
    }
}

