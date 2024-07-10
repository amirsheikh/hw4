package ir.ramtung.impl1;

import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import ir.ramtung.AbstractLibraryTest;
import ir.ramtung.sts01.ILibrary;
import org.junit.runner.RunWith;


@RunWith(JUnitQuickcheck.class)
public class LibraryTest1Test extends AbstractLibraryTest {

    Library library = new Library();

    @Override
    protected ILibrary getLib() {
        return library;
    }
}
