package ir.ramtung;

import com.pholser.junit.quickcheck.Property;
import ir.ramtung.sts01.ILibrary;
import ir.ramtung.sts01.LibraryException;
import org.apache.commons.lang3.StringUtils;



import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public abstract class AbstractLibraryTest {

    protected abstract ILibrary getLib();

    public void setup() throws LibraryException {
        getLib().addStudentMember("st1", "st1");
        getLib().addStudentMember("st2", "st2");
        getLib().addStudentMember("st3", "st3");
        getLib().addProfMember("pr1");
        getLib().addProfMember("pr2");
        getLib().addProfMember("pr3");
        getLib().addMagazine("mg1", 1377, 1, 1);
        getLib().addMagazine("mg2", 1391, 1, 2);
        getLib().addMagazine("mg3", 1392, 1, 3);
        getLib().addReference("rf1",  1);
        getLib().addReference("rf2",  2);
        getLib().addReference("rf3",  3);
        getLib().addBook("bo1",  1);
        getLib().addReference("bo2",  2);
        getLib().addReference("bo3",  3);
    }

    @Property
    public void checkAddStudentMember(String studentId, String studentName) throws LibraryException {
        if (StringUtils.isNotBlank(studentName) && StringUtils.isNotBlank(studentId)) {
            getLib().addStudentMember(studentId, studentName);
            return;
        }
        try {
            getLib().addStudentMember(studentId, studentName);
            fail();
        } catch (Exception ignored) {}

        try {
            getLib().addStudentMember("test", studentName);
            fail();
        } catch (Exception ignored) {}
    }

    @Property public void checkAddProfMember(String profName) throws LibraryException {
        if (StringUtils.isNotBlank(profName)) {
            getLib().addProfMember(profName);
            return;
        }
        try {
            getLib().addProfMember(profName);
            fail();
        } catch (Exception ignored) {}

        try {
            getLib().addProfMember(profName);
            fail();
        } catch (Exception ignored) {}
    }

    @Property public void checkAddBook(String bookTitle, int copies) throws LibraryException {
        if (StringUtils.isNotBlank(bookTitle) && copies > 0) {
            getLib().addBook(bookTitle, copies);
            return;
        }
        try {
            getLib().addBook(bookTitle, copies);
            fail();
        } catch (Exception ignored) {}

    }

    @Property public void checkAddMagazine(String bookTitle, int year, int number, int copies) throws LibraryException {
        if (StringUtils.isNotBlank(bookTitle) && year > 0 && number > 0 && copies > 0) {
            getLib().addMagazine(bookTitle, year, number, copies);
            return;
        }
        try {
            getLib().addMagazine(bookTitle, year, number, copies);
            fail();
        } catch (Exception ignored) {}

    }

    @Property public void checkAddReference(String bookTitle, int copies) throws LibraryException {
        if (StringUtils.isNotBlank(bookTitle) && copies > 0) {
            getLib().addReference(bookTitle, copies);
            return;
        }
        try {
            getLib().addReference(bookTitle, copies);
            fail();
        } catch (Exception ignored) {}
    }

    @Property(trials = 10) public void checkTimePass(int days) throws LibraryException {
        if (days >= 0) {
            getLib().timePass(days);
            return;
        }
        try {
            getLib().timePass(days);
            fail();
        } catch (Exception ignored) {}
    }

    @Property public void checkMaxBorrow() throws LibraryException {
        setup();
        getLib().borrow("st1", "mg1");
        getLib().borrow("st1", "mg2");
        try {
            getLib().borrow("st1", "mg3");
            fail();
        } catch (Exception ignored) {}
        getLib().borrow("pr1", "mg2");
        getLib().borrow("pr1", "mg3");
        getLib().borrow("pr1", "bo1");
        getLib().borrow("pr1", "bo2");
        getLib().borrow("pr1", "bo3");
        try {
            getLib().borrow("pr1", "rf1");
            fail();
        } catch (Exception ignored) {}
    }

    @Property() public void checkMaxDocForBorrow(int copies) throws LibraryException {
        copies = Math.abs(copies) % 1000 + 1;
        getLib().addMagazine("mgTest", 1, 1, copies);
        for (int i = 0; i< copies; i++) {
            getLib().addProfMember("profTest" + i);
            getLib().borrow("profTest" + i, "mgTest");
        }

        try {
            getLib().addProfMember("profTestFailed");
            getLib().borrow("profTestFailed", "mgTest");
            fail();
        } catch (Exception ignored) {}
    }

    @Property public void checkExtend() throws LibraryException {
        try {
            setup();
            getLib().extend("st1", "bo1");
            fail("Doc extend before borrow not allowed");
        } catch (Exception ignored) {}

        getLib().borrow("st1", "bo1");
        try {
            getLib().extend("st1", "bo1");
            fail("Doc extend at borrow day not allowed");
        } catch (Exception ignored) {}
        getLib().timePass(1);
        getLib().extend("st1", "bo1");
        getLib().extend("st1", "bo1");
        try {
            getLib().extend("st1", "bo1");
            fail("Doc extend more than twice");
        } catch (Exception ignored) {}
        try {
            getLib().borrow("st1", "mg1");
            getLib().timePass(1);
            getLib().extend("st1", "mg1");
            fail("Magazine extend not allowed");
        } catch (Exception ignored) {}
    }

    @Property public void checkExtendDeadline(int timeToExtend) throws LibraryException {
        setup();
        getLib().borrow("st1", "bo1");
        timeToExtend = Math.abs(timeToExtend) % 100 + 1;
        getLib().timePass(timeToExtend);
        if (timeToExtend > 10) {
            try {
                getLib().extend("st1", "bo1");
                fail();
            } catch (Exception ignored) {}
        } else {
            getLib().extend("st1", "bo1");
        }

        getLib().borrow("st2", "rf1");
        timeToExtend = Math.abs(timeToExtend) % 100 + 1;
        getLib().timePass(timeToExtend);
        if (timeToExtend > 5) {
            try {
                getLib().extend("st2", "rf1");
                fail();
            } catch (Exception ignored) {}
        } else {
            getLib().extend("st2", "rf1");
        }
    }

    @Property public void calculatePenaltyWithYearLessThan1390(List<Integer> returnAfterTimeForMag,
                                           List<Integer> returnAfterTimeForBook,
                                           List<Integer> returnAfterTimeForRef) throws LibraryException {
        setup();
        long penalty = 0;
        int bookDelayDays = 0;
        int refDelayDays = 0;
        for (Integer i : returnAfterTimeForBook) {
            i = Math.abs(i) % 20 + 1;
            getLib().borrow("st1", "bo1");
            getLib().timePass(i);
            getLib().returnDocument("st1", "bo1");
            if (i > 10) {
                bookDelayDays += i - 10;
            }
        }

        for (Integer i : returnAfterTimeForMag) {
            i = Math.abs(i) % 1000 + 1;
            getLib().borrow("st1", "mg1");
            getLib().timePass(i);
            getLib().returnDocument("st1", "mg1");
            if (i > 2) {
                penalty += (i - 2) * 2000;
            }
        }
        for (Integer i : returnAfterTimeForRef) {
            i = Math.abs(i) % 1000 + 1;
            getLib().borrow("st1", "rf1");
            getLib().timePass(i);
            getLib().returnDocument("st1", "rf1");
            if (i > 5) {
                refDelayDays += i - 5;
            }
        }

        if (bookDelayDays <= 7) {
            penalty += 2000 * bookDelayDays;
        } else if (bookDelayDays <= 21 && bookDelayDays > 7) {
            penalty += ((2000 * 7) + ((bookDelayDays - 7) * 3000));
        } else {
            penalty += ((2000 * 7) + (14 * 3000) + (bookDelayDays - 21) * 5000);
        }

        if (refDelayDays <= 3) {
            penalty += 5000 * refDelayDays;
        } else {
            penalty += ((5000 * 3) + ((refDelayDays - 3) * 7000));
        }
        assertEquals(penalty, getLib().getTotalPenalty("st1"));

    }

    @Property public void calculatePenaltyWithYearMoreThan1390(List<Integer> returnAfterTimeForMag,
                                                               List<Integer> returnAfterTimeForBook,
                                                               List<Integer> returnAfterTimeForRef) throws LibraryException {
        setup();
        long penalty = 0;
        int bookDelayDays = 0;
        int refDelayDays = 0;
        for (Integer i : returnAfterTimeForBook) {
            i = Math.abs(i) % 20 + 1;
            getLib().borrow("st1", "bo1");
            getLib().timePass(i);
            getLib().returnDocument("st1", "bo1");
            if (i > 10) {
                bookDelayDays += i - 10;
            }
        }

        for (Integer i : returnAfterTimeForMag) {
            i = Math.abs(i) % 1000 + 1;
            getLib().borrow("st1", "mg2");
            getLib().timePass(i);
            getLib().returnDocument("st1", "mg2");
            if (i > 2) {
                penalty += (i - 2) * 3000;
            }
        }
        for (Integer i : returnAfterTimeForRef) {
            i = Math.abs(i) % 1000 + 1;
            getLib().borrow("st1", "rf1");
            getLib().timePass(i);
            getLib().returnDocument("st1", "rf1");
            if (i > 5) {
                refDelayDays += i - 5;
            }
        }

        if (bookDelayDays <= 7) {
            penalty += 2000 * bookDelayDays;
        } else if (bookDelayDays <= 21 && bookDelayDays > 7) {
            penalty += ((2000 * 7) + ((bookDelayDays - 7) * 3000));
        } else {
            penalty += ((2000 * 7) + (14 * 3000) + (bookDelayDays - 21) * 5000);
        }

        if (refDelayDays <= 3) {
            penalty += 5000 * refDelayDays;
        } else {
            penalty += ((5000 * 3) + ((refDelayDays - 3) * 7000));
        }
        assertEquals(penalty, getLib().getTotalPenalty("st1"));

    }
}
